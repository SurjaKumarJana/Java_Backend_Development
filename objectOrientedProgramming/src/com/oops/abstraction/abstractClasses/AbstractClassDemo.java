/*
================================================================================
ABSTRACT CLASS IN JAVA
================================================================================

What is an Abstract Class?
    - An abstract class is a class that is declared using the `abstract` keyword.
    - It cannot be instantiated directly (you cannot create an object of it).
    - It is used as a base class and is meant to be extended by other classes.

Purpose:
    - To provide a common template or blueprint for subclasses.
    - To enforce that subclasses must implement certain methods.
    - To allow code reuse by writing shared logic in the base class.

--------------------------------------------------------------------------------
Key Features of Abstract Class:

    - Can contain both:
        → Abstract methods (without body)
        → Concrete methods (with body)

    - Can have constructors, variables, and static methods.

    - Used when classes share common behavior, but also require specific behavior
      to be defined by subclasses.

--------------------------------------------------------------------------------
Example:

    abstract class Animal {
        abstract void makeSound(); // abstract method

        void sleep() {
            System.out.println("Sleeping...");
        }
    }

    class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Dog barks");
        }
    }

    public class Main {
        public static void main(String[] args) {
            // Animal a = new Animal();      // Error: Cannot instantiate abstract class
            Animal a = new Dog();            // Valid
            a.makeSound();                   // Output: Dog barks
            a.sleep();                       // Output: Sleeping...
        }
    }

--------------------------------------------------------------------------------
Why Use Abstract Class?

    - When you want to provide some default behavior, but also enforce subclasses
      to define specific behavior.

    - Good for situations like:
        * Animal → Dog, Cat
        * Shape → Circle, Rectangle
        * Employee → Manager, Developer

--------------------------------------------------------------------------------
ABSTRACT CLASS vs CONCRETE CLASS

| Feature                      | Abstract Class                      | Concrete Class                   |
|------------------------------|-------------------------------------|----------------------------------|
| Can be instantiated?         | No                                  | Yes                              |
| Contains abstract methods?   | Yes (optional)                      | No                               |
| Contains method definitions? | Yes                                 | Yes                              |
| Used for?                    | Providing base template             | Creating full usable objects     |
| Extending required?          | Yes (to use)                        | Not required                     |

--------------------------------------------------------------------------------
Important Notes:

    - If a class has at least one abstract method, the class itself must be abstract.
    - Subclasses must implement all abstract methods or be declared abstract themselves.
    - Abstract classes support constructors and member variables, unlike interfaces.

================================================================================
*/



package com.oops.abstraction.abstractClasses;

public class AbstractClassDemo {
    public static void main(String[] args) {

        // creating an object of a subclass of shape and referring it using a super class referrence
        Shape shape = new Circle();
        shape.draw();

        shape = new Rectangle();
        shape.draw();

        shape = new Triangle();
        shape.draw();

        // when we use the super class referrence
        // then  we don't know about the .draw() method implementation
        // we only know to use it
        // this is abstracton

    }
}
