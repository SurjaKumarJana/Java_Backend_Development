/*
================================================================================
                   OBJECT-ORIENTED PROGRAMMING (OOP) — JAVA NOTES
================================================================================

0. TWO MAIN WAYS TO WRITE SOFTWARE
================================================================================

When we write programs, we usually follow one of these two styles:

1. FUNCTIONAL PROGRAMMING (FP):
--------------------------------

        This style of programming focuses on writing functions that take input, perform
some computations, and return an output. It is great for simple, small tasks such
as automation scripts or basic computations. Functional programming works well
when there are only a few pieces of logic and little interaction between different
parts of the program.

Common in: JavaScript, Haskell, Scala, Python, Java (8+ with lambdas and streams)

Best for:
    - Data filtering and transformation
    - Parallel or concurrent processing
    - Logic-heavy operations


2. OBJECT-ORIENTED PROGRAMMING (OOP):
-------------------------------------
Focus: Objects that combine data and behavior

        OOP becomes particularly useful when building larger, more complex systems. If
your program needs to model real-world entities with attributes and behaviors,
and these entities interact with each other in a meaningful way, OOP is the
preferred approach. For example, in a software system for managing students
and teachers, where entities like students, teachers, and subjects need to
interact, OOP is the more efficient and scalable way to organize the system.

Common in: Java, C++, Python, Kotlin

Best for:
    - Applications with real-world entities
    - Large, scalable software projects
    - Team development


--------------------------------------------------------------------------------
FUNCTIONAL PROGRAMMING vs OBJECT-ORIENTED PROGRAMMING

| Feature              | Functional Programming           | Object-Oriented Programming        |
|----------------------|----------------------------------|-------------------------------------|
| Focus                | Functions                        | Objects (data + methods)            |
| Data Mutability      | Immutable                        | Mutable                             |
| Structure            | Based on function composition    | Based on classes and objects        |
| Reusability          | Reuse functions                  | Reuse via inheritance/interfaces    |
| Used in Java via     | Streams, Lambdas                 | Classes, Objects                    |
| Example Use Case     | Data processing                  | Real-world modeling (Car, Bank)     |

================================================================================
1. WHAT IS OOP?
================================================================================

OOP (Object-Oriented Programming) is a way to build programs using objects.

Each object has:
    - Data → stored in variables (called fields)
    - Behavior → written as methods (functions)

To create objects, we first write a class (blueprint), then make objects from it.

Example:
    Class: Car
    Object: BMW, Honda
    Fields: color, speed
    Methods: start(), stop()

================================================================================
2.WHY CHOOSE OBJECT-ORIENTED PROGRAMMING (OOP) OVER FUNCTIONAL PROGRAMMING (FP)?
================================================================================

If you have two options—Functional Programming (FP) and Object-Oriented
Programming (OOP)—here are the clear benefits of choosing OOP:

1. Real-World Modeling
    - OOP allows you to create classes and objects that represent real-world
      entities (e.g., Car, Student, BankAccount).
    - The design feels more natural and easier to understand.

2. Code Reusability (Inheritance)
    - Shared logic can be placed in a base class and reused in derived classes.
    - Example: A Vehicle class reused by Car, Bike, and Bus classes.

3. Modular Structure
    - Code is broken into independent classes/modules.
    - Easier to manage, test, and debug.
    - Enables multiple developers to work on different parts of the program.

4. Encapsulation (Data Hiding)
    - Internal fields are hidden using `private` access modifiers.
    - External access is provided using getter and setter methods.
    - Helps prevent accidental data modification and improves security.

5. Maintainability
    - Well-structured class-based code is easier to update.
    - Fixing bugs or adding new features can be done in isolated parts.

6. Extensibility
    - You can easily extend existing functionality using inheritance or interfaces.
    - Ideal for evolving software requirements.

7. Polymorphism (Flexibility)
    - The same method name can behave differently in different classes.
    - Supports Method Overloading and Method Overriding.
    - Helps in writing generic and flexible code.

8. Scalability
    - Best suited for building large-scale applications.
    - Structure remains clean and manageable even as the codebase grows.

9. Readability and Reusability
    - Organized code using classes improves clarity.
    - Once a class is written, it can be reused across multiple projects.

10. Team Collaboration
    - Multiple developers can work on different classes simultaneously.
    - Promotes consistent project structure and clean architecture.

When to Prefer Functional Programming (FP)?
    - For small, stateless, data-driven programs.
    - Ideal for tasks like filtering, transforming, and aggregating data.
    - Useful when you want predictable output without side effects.

Summary:
    Choose OOP when:
        - You are modeling real-world objects.
        - The system is large or will grow over time.
        - You want reusable, secure, and organized code.
        - You are working in a team or collaborative environment.

    OOP provides long-term benefits like flexibility, maintainability,
    and better architecture for complex applications.


================================================================================
4. FOUR PILLARS OF OOP
================================================================================

OOP is based on 4 key principles:

--------------------------------------------------------------------------------
a) ENCAPSULATION — Hiding internal data
--------------------------------------------------------------------------------
- Make variables private
- Use getter and setter methods for access

Example:
    class Person {
        private int age;
        public void setAge(int a) { age = a; }
        public int getAge() { return age; }
    }

--------------------------------------------------------------------------------
b) INHERITANCE — Reuse code from other classes
--------------------------------------------------------------------------------
- A child class inherits from a parent class using `extends`

Example:
    class Animal {
        void eat() {
            System.out.println("Eating...");
        }
    }

    class Dog extends Animal {
        void bark() {
            System.out.println("Barking...");
        }
    }

--------------------------------------------------------------------------------
c) POLYMORPHISM — One method, many forms
--------------------------------------------------------------------------------
- Method Overloading: same method name, different parameters
- Method Overriding: child class redefines parent method

Example:
    class Shape {
        void draw() {
            System.out.println("Drawing shape");
        }
    }

    class Circle extends Shape {
        void draw() {
            System.out.println("Drawing circle");
        }
    }

--------------------------------------------------------------------------------
d) ABSTRACTION — Hiding complex details
--------------------------------------------------------------------------------
- Show only essential information
- Use abstract classes or interfaces

Example:
    abstract class Bike {
        abstract void start();
    }

    class Honda extends Bike {
        void start() {
            System.out.println("Bike started");
        }
    }

================================================================================
5. SUMMARY — OOP IN ONE LINE
================================================================================

Object-Oriented Programming is a method of writing software using objects,
where each object contains data (fields) and behavior (methods) to represent
real-world entities in a clean and organized way.

================================================================================
*/

package com.oops;

import java.awt.dnd.DragGestureEvent;

class Person{
    //states
    String name;
    int age;

    //constractor
    public Person( String name, int age ) {

        this.age = age;
        this.name = name;
    }

    //behaviour
    void walk(){
        System.out.println(this.name + "  is walking .....");
    }
    void talk(){
        System.out.println(this.name + "  is talking .....");
    }

}
// inheritance
class Student extends Person{

    int rollNO;

    // if we have a constractor in superclass then we must have a constractor in
    // subclass also


    public Student(String name, int age, int rollNO) {
        super(name, age);
        this.rollNO = rollNO;
    }

    //adding new behaviour in subclasses
    void learning(){
        System.out.println(this.name +" is learning new concepts...");
    }


}

public class BasicsOfOOPS {
    public static void main(String[] args) {
        // creating objects from the classes
        // we can create objects as many as the memory space support us

        // a super class reffernce can referr to a object of subclass
        // but vice -versa is not valid
        Person p1 = new Person("Rahul", 12);
        Person s1 = new Student("Suresh",25,321456);


        p1.talk();
        p1.walk();

        s1.talk();
        s1.walk();
        // if we created a object using superclass referrence then we can only
        // access the propertises and method that the super class have
        // so the below line will show compilation error
        //s1.learnig()

        Student s2 = new Student("Arnav", 24,1254789);
        s2.walk();
        s2.talk();
        s2.learning();
    }
}
