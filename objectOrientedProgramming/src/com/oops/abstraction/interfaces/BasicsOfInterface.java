/*
================================================================================
INTERFACES IN JAVA
================================================================================

What is an Interface?
    - An interface in Java is a **completely abstract type** used to define a **contract**
      for what a class should do, without defining how it should do it.
    - It only contains **method declarations** and **constants** by default.
    - A class that implements an interface must define all of its methods.

--------------------------------------------------------------------------------
Purpose of Interface:
    - To provide **100% abstraction** (before Java 8).
    - To define **common behavior** across unrelated classes.
    - To support **multiple inheritance** (Java allows a class to implement multiple interfaces).
    - To enable a flexible and loosely-coupled system design.

--------------------------------------------------------------------------------
Syntax:

    interface InterfaceName {
        void methodName();  // abstract method (no body)
    }

    class ClassName implements InterfaceName {
        public void methodName() {
            // method body
        }
    }

--------------------------------------------------------------------------------
Example:

    interface Animal {
        void makeSound();  // abstract method
    }

    class Dog implements Animal {
        public void makeSound() {
            System.out.println("Dog barks");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Animal a = new Dog();
            a.makeSound();  // Output: Dog barks
        }
    }

--------------------------------------------------------------------------------
What is Allowed Inside an Interface?

1. **Abstract Methods**
    - All methods are public and abstract by default (until Java 7).
    - Syntax:
        void run();

2. **Constants (public static final variables)**
    - Variables declared in interfaces are by default:
        → public
        → static
        → final
    - Syntax:
        int MAX = 100;

3. **Default Methods** (Java 8+)
    - Methods with a body, used to provide default behavior.
    - Syntax:
        default void start() {
            System.out.println("Default start");
        }

4. **Static Methods** (Java 8+)
    - Methods that belong to the interface itself, not the implementing class.
    - Syntax:
        static void utility() {
            System.out.println("Utility method");
        }

5. **Private Methods** (Java 9+)
    - Used internally inside the interface to support code reuse between default methods.
    - Syntax:
        private void helper() {
            System.out.println("Private method");
        }

--------------------------------------------------------------------------------
Key Characteristics of Interfaces:

    - Cannot have constructors.
    - Cannot have instance variables (only constants allowed).
    - A class must use `implements` to use an interface.
    - A class can implement **multiple interfaces**.
    - Interfaces can extend other interfaces.

--------------------------------------------------------------------------------
When to Use an Interface?

    - When you want to **define common behavior** for unrelated classes.
    - When you need to support **multiple inheritance** of type.
    - When designing **APIs, libraries, or plugins**.
    - When you want to ensure a class follows a specific pattern or rule.

================================================================================
*/

package com.oops.abstraction.interfaces;

public class BasicsOfInterface {
    public static void main(String[] args) {
        Car c = new HatchbackCar();
        c.start();
        c.stop();

        c = new SedanCar();
        c.start();
        c.stop();
    }

}
