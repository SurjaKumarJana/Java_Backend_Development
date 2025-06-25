/*
================================================================================
INHERITANCE IN JAVA
================================================================================

Definition:
    Inheritance is one of the four main pillars of Object-Oriented Programming (OOP).
    It allows a class (child or subclass) to **acquire properties and behaviors**
    (fields and methods) from another class (parent or superclass).

    It supports **code reuse** and provides a way to build **hierarchical relationships**
    between classes.

--------------------------------------------------------------------------------
SYNTAX:

    class Parent {
        // fields and methods
    }

    class Child extends Parent {
        // inherits fields and methods from Parent
        // can add new or override existing ones
    }

--------------------------------------------------------------------------------
EXAMPLE:

    class Animal {
        void eat() {
            System.out.println("Animal eats food");
        }
    }

    class Dog extends Animal {
        void bark() {
            System.out.println("Dog barks");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Dog d = new Dog();
            d.eat();   // Inherited from Animal
            d.bark();  // Defined in Dog
        }
    }

--------------------------------------------------------------------------------
TYPES OF INHERITANCE IN JAVA:

1. Single Inheritance
    - One subclass inherits from one superclass.
    - Java supports this directly.

2. Multilevel Inheritance
    - Class C inherits from class B, which inherits from class A.
    - Java supports this.

        Example: A → B → C

3. Hierarchical Inheritance
    - Multiple subclasses inherit from the same superclass.

        Example: A → B, A → C

4. Multiple Inheritance (NOT supported using classes)
    - A class cannot extend more than one class in Java (to avoid ambiguity).
    - Java supports multiple inheritance through **interfaces**, not classes.

--------------------------------------------------------------------------------
WHY USE INHERITANCE?

- Reuse existing code (no need to rewrite common functionality).
- Organize related classes into a hierarchy.
- Promote method overriding and polymorphism.
- Improve code readability and maintenance.

--------------------------------------------------------------------------------
METHOD OVERRIDING:

    - When a subclass defines a method with the same name, return type,
      and parameters as in the parent class, it overrides the parent method.
    - Use the `@Override` annotation for clarity.

    Example:

        class Animal {
            void makeSound() {
                System.out.println("Animal sound");
            }
        }

        class Cat extends Animal {
            @Override
            void makeSound() {
                System.out.println("Meow");
            }
        }

--------------------------------------------------------------------------------
KEYWORDS RELATED TO INHERITANCE:

- `extends`   → used to define inheritance between two classes.
- `super`     → used to access members of the parent class.
- `@Override` → indicates a method is being overridden from the parent.

--------------------------------------------------------------------------------
REAL-WORLD EXAMPLE:

    Class: Vehicle
    Subclasses: Car, Bike, Truck

    All vehicles can start(), stop(), and refuel(),
    but each may have their own specific implementation.

--------------------------------------------------------------------------------
ADVANTAGES:

- Reduces code duplication.
- Supports polymorphism (same interface, different behaviors).
- Helps in logically structuring related classes.
- Encourages modular and organized design.

================================================================================
*/

package com.oops.inheritance;



class Parent{
    String type = "Parent";

    void printType(){
        System.out.println("class type is :"+this.type);
    }
}
//child class
class Child extends  Parent{
    String type = "Child";

    @Override
    void printType(){
        System.out.println("Type function is modified");
        System.out.println("class type is : "+ this.type);
    }
}
public class InheritaceDemo {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        p.printType();
        c.printType();
    }
}
