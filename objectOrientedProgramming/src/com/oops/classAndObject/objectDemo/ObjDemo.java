/*
===============================================================================
                            Objects in Java
===============================================================================

Overview:
	An object is an instance of a class. It represents a real-world entity that
	has **state (data)** and **behavior (methods)**.

	When you create an object, memory is allocated for the fields defined
	in the class, and the object gets access to all the methods.

	In simple terms:
	- **Class** = Blueprint
	- **Object** = Real-world usable version of that blueprint

-------------------------------------------------------------------------------
How to Create an Object
-------------------------------------------------------------------------------

Syntax:
	ClassName objectName = new ClassName();

Example:
	class Car {
		String color;
		void drive() {
			System.out.println("Driving...");
		}
	}

	public class Main {
		public static void main(String[] args) {
			Car myCar = new Car();         // Creating an object
			myCar.color = "Red";           // Setting data
			myCar.drive();                 // Calling method
		}
	}

-------------------------------------------------------------------------------
Accessing Object Members
-------------------------------------------------------------------------------

	- Use dot `.` operator to access fields and methods.

Example:
	Student s = new Student();
	s.name = "Alice";
	s.showDetails();

-------------------------------------------------------------------------------
Multiple Objects from Same Class
-------------------------------------------------------------------------------

	- You can create multiple independent objects from the same class.

Example:
	Student s1 = new Student();
	Student s2 = new Student();
	s1.name = "John";
	s2.name = "Sara";

-------------------------------------------------------------------------------
Object Memory Allocation
-------------------------------------------------------------------------------

	- When an object is created using `new`, memory is allocated on the heap.
	- The reference (e.g., `myCar`) is stored in the stack.

Diagram:
	Car myCar = new Car();
	[Stack] myCar → [Heap] (Car object with color & methods)

-------------------------------------------------------------------------------
Anonymous Object
-------------------------------------------------------------------------------

	- An object without a name. Used for one-time method calls.

Example:
	new Car().drive();

-------------------------------------------------------------------------------
Object as Method Parameter
-------------------------------------------------------------------------------

	class Calculator {
		void printSquare(Number n) {
			System.out.println(n.value * n.value);
		}
	}

-------------------------------------------------------------------------------
Object as Return Type
-------------------------------------------------------------------------------

	class StudentFactory {
		Student createStudent() {
			Student s = new Student();
			s.name = "Auto";
			return s;
		}
	}

-------------------------------------------------------------------------------
Important Notes
-------------------------------------------------------------------------------

	- Objects are the foundation of Object-Oriented Programming (OOP).
	- Each object has its own copy of instance variables.
	- Methods operate on the data inside the object.
	- Use `null` to denote that a reference variable doesn’t point to any object.

Example:
	Student s = null;    // Reference exists, but no object assigned


===============================================================================
                   MEMORY ALLOCATION IN JAVA — STACK vs HEAP
===============================================================================

+---------------------------------------+        +-----------------------------------------+
|              Stack Frame              |        |               Heap Memory               |
|  +-------------------------------+    |        |  +-------------------------------+      |
|  |          main frame           |    |        |  |           object 1            |      |
|  |  +-------------------------+  |    |        |  |-------------------------------|      |
|  |  | car1  ------------------|--|--------------> |  |  color = "red"             |      |
|  |  | car2  ------------------|-------------+  |  |  drive()                      |      |
|  |  +-------------------------+  |    |     |  |  +-------------------------------+      |
|  +-------------------------------+    |     |  |                                         |
+---------------------------------------+     |  |  +-------------------------------+      |
                                              |  |  |           object 2            |      |
                                              |  |  |-------------------------------|      |
                                              +---> |  color = "green"              |      |
                                                 |  |  drive()                      |      |
                                                 |  +-------------------------------+      |
                                                 +-----------------------------------------+

Explanation:
- `car1` and `car2` are references stored in the stack inside `main frame`.
- `car1` points to `object 1` in the heap (color = "red").
- `car2` points to `object 2` in the heap (color = "green").
- Each object is distinct and has its own copy of fields and methods.
- The stack holds the reference variables; the heap holds the actual objects.
*/


package com.oops.classAndObject.objectDemo;
class Car{
    String name;
    String color;
    String no ;
    public Car(String name , String color, String no ){
        this.name = name;
        this.color = color;
        this.no = no;

    }

    void drive(){
        System.out.println( this.name + " is running on the road ");
    }

    @Override
    public String toString() {
        return "car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", no='" + no + '\'' +
                '}';
    }
}

public class ObjDemo {
    public static void main(String[] args) {
        Car c1 = new Car("Punch","golden","AP 39 BD 3803");
        Car c2 = new Car("Harrier","black","WB 30 AV 1520");

        driveCar(c1);
        driveCar(c2);

        System.out.println(c1.toString());
        System.out.println(c2.toString());



    }
    static void driveCar(Car car){
        car.drive();
    }

}
