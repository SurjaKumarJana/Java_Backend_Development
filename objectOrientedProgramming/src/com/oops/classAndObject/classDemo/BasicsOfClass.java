/*
===============================================================================
                                    Class in Java
===============================================================================

Overview:
            A class in Java is a structure used to define your own custom data type.
	It groups related variables (called fields) and functions (called methods) into
	one single unit. Objects are created using classes.

	          A class is a fundamental building block in Java and the core concept of
	Object-Oriented Programming (OOP). It defines the **structure** (variables)
	and **behavior** (methods) of objects.


	Think of a class as a **blueprint**, **template**, or **design** for creating
	objects. The actual objects created from this template are called **instances**.

Real-World Analogy:
	A class is like an architectural blueprint for a house.
	From one blueprint (class), you can build many houses (objects).
	Each house can have its own color, owner, and furniture (unique values).

-------------------------------------------------------------------------------
Syntax:
	class ClassName {
		// Fields or attributes
		// Constructors
		// Methods
	}

Example:
	class Car {
		String color;
		int speed;

		void drive() {
			System.out.println("Car is driving");
		}
	}

-------------------------------------------------------------------------------
Creating Objects (Instances of a Class)
-------------------------------------------------------------------------------

	Objects are created using the `new` keyword:

	Car myCar = new Car();        // myCar is an object of type Car
	myCar.color = "Red";          // Setting object-specific data
	myCar.drive();                // Calling method → Output: Car is driving

-------------------------------------------------------------------------------
Fields / Instance Variables (Attributes)
-------------------------------------------------------------------------------

	- Declared inside the class but outside methods.
	- Represent the state or data of an object.
	- Each object has its own copy of instance variables.

Example:
	class Student {
		String name;
		int rollNo;
	}

-------------------------------------------------------------------------------
Methods (Member Functions)
-------------------------------------------------------------------------------

	- Define actions or behavior of a class.
	- Can accept parameters and return values.
	- Can access and modify instance variables.

Example:
	class Calculator {
		int add(int a, int b) {
			return a + b;
		}
	}

-------------------------------------------------------------------------------
Constructors
-------------------------------------------------------------------------------

	- Special methods used to initialize objects.
	- Same name as the class, no return type (not even void).
	- Automatically called when an object is created.

Types:
	1. Default Constructor (no parameters)
	2. Parameterized Constructor
	3. Constructor Overloading (multiple constructors with different signatures)

Example:
	class Person {
		String name;

		// Constructor
		Person(String n) {
			name = n;
		}
	}

	Person p = new Person("Alice");

-------------------------------------------------------------------------------
this Keyword
-------------------------------------------------------------------------------

	- Refers to the current object.
	- Commonly used to resolve naming conflicts between instance variables and
	    parameters.

Example:
	class Box {
		int length;

		Box(int length) {
			this.length = length;
		}
	}

-------------------------------------------------------------------------------
Access Modifiers
-------------------------------------------------------------------------------

	Used to control the visibility (accessibility) of class members:

	public      → Accessible from anywhere
	private     → Accessible only within the class
protected     → Accessible in same package and in subclasses
(default)     → Accessible within the same package (no modifier used)

-------------------------------------------------------------------------------
Static Keyword
-------------------------------------------------------------------------------

	- Declares class-level variables or methods.
	- Shared among all instances of the class.
	- Accessed using ClassName.staticMember or via objects (not preferred).

Example:
	class Counter {
		static int count = 0;

		Counter() {
			count++;
		}
	}


-------------------------------------------------------------------------------
Object Class (Super Class of All Classes)
-------------------------------------------------------------------------------

	- Every class in Java implicitly extends the Object class.
	- Provides default methods: toString(), equals(), hashCode(), getClass(), etc.

-------------------------------------------------------------------------------
Main Method and Entry Point
-------------------------------------------------------------------------------

	- Every Java program starts from the `main` method.
	- It must be inside a class.

Example:
	public class Main {
		public static void main(String[] args) {
			Car myCar = new Car();
			myCar.drive();
		}
	}

-------------------------------------------------------------------------------
Key Takeaways
-------------------------------------------------------------------------------

	✔ A class is a blueprint for creating objects.
	✔ It contains fields, methods, and constructors.
	✔ Objects are instances of classes.
	✔ Classes support key OOP concepts: encapsulation, inheritance, etc.
	✔ All Java programs are organized into classes — even the main method.

*/

package com.oops.classAndObject.classDemo;

// this is our class
class Student{
    // states or properties
    String name;
    long rollNo;
    long regNo;
    String dept;
    float cgpa;


    // if we don't use an constractor , compiler will autometically invoked a default one
    // a constractor is noting but an method , that don't have a return type
    // and name will be same as class name

    // default constractor
    public Student(){

    }
    //our own constractor
    public Student(String name,long rollNo,String dept){
        // we can assign other states later
        // here this keyword is used to avoid name conflict
        // this.name refers that name variable of the current object
        this.name = name;
        this.rollNo = rollNo;
        this.dept = dept;

    }



    //if we directly print the object we can see the memory referrence value
    // but we want to see the fields of it
    // so we override .toString() methods , it is the string representation of object
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", regNo=" + regNo +
                ", dept='" + dept + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }



}

// this is our main class that holds the main() method
public class BasicsOfClass {
    public static void main(String[] args) {
        // creating objects of Student class
        Student s1 = new Student();// creating by default constractor
        Student s2 = new Student("Surja ",1235881, "CSE"); // using new constractor

        System.out.println(s1.toString());
        System.out.println(s2.toString());

        //now we can assign others states of s2
        s2.regNo = 1283823804;
        s2.cgpa = 8.9f;
        // now the object fields are modified
        System.out.println(s2.toString());

    }
}

