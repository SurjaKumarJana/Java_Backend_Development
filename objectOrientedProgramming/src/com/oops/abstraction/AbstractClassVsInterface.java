/*
================================================================================
ABSTRACT CLASS vs INTERFACE in JAVA
================================================================================

Purpose:
    Both abstract classes and interfaces are used to achieve **abstraction** in Java.
    However, they are used in **different scenarios** based on requirements like
    inheritance, multiple inheritance, method definitions, and default behaviors.

--------------------------------------------------------------------------------
ABSTRACT CLASS:
    - A class declared with the keyword `abstract`.
    - Can have both abstract methods (no body) and concrete methods (with body).
    - Supports constructors and instance variables.
    - Supports single inheritance (a class can extend only one abstract class).

    Syntax:
        abstract class Vehicle {
            abstract void start();

            void fuel() {
                System.out.println("Filling fuel...");
            }
        }

        class Bike extends Vehicle {
            void start() {
                System.out.println("Bike started");
            }
        }

--------------------------------------------------------------------------------
INTERFACE:
    - A completely abstract type used to define a contract.
    - Can contain:
        → Abstract methods (Java 7 and below)
        → Default/static methods (Java 8+)
        → Private methods (Java 9+)
    - All methods are `public` and `abstract` by default (unless declared otherwise).
    - Variables are `public`, `static`, and `final` by default.
    - Supports multiple inheritance (a class can implement multiple interfaces).

    Syntax:
        interface Engine {
            void run();
        }

        class Car implements Engine {
            public void run() {
                System.out.println("Car running...");
            }
        }

--------------------------------------------------------------------------------
KEY DIFFERENCES:

| Feature                    | Abstract Class                     | Interface                           |
|----------------------------|------------------------------------|-------------------------------------|
| Keyword                    | abstract class                     | interface                           |
| Inheritance                | Single (extends only 1)            | Multiple (can implement many)       |
| Methods                    | Abstract + Concrete                | Only abstract (Java 7 and below)    |
| Access Modifiers           | public, protected, private allowed | All methods are public              |
| Variables                  | Can be any type                    | public static final only            |
| Constructor Support        | Yes                                | No                                  |
| When to Use                | When some behavior is shared       | When unrelated classes share a type |
| Example Use Case           | Vehicle → Bike, Car                | Flyable → Bird, Plane, Drone        |

--------------------------------------------------------------------------------
When to Use What?

- Use **abstract class** when:
    → You want to provide some shared implementation.
    → You are building a class hierarchy with common base logic.

- Use **interface** when:
    → You want to define a common contract across unrelated classes.
    → You need multiple inheritance of type.

================================================================================
*/

package com.oops.abstraction;

public class AbstractClassVsInterface {
}
