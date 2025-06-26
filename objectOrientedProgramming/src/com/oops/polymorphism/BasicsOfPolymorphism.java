/*
================================================================================
POLYMORPHISM IN JAVA
================================================================================

Definition:
    Polymorphism is one of the four core principles of Object-Oriented Programming (OOP).
    It means **"many forms"** — the ability of an object to take on **different behaviors**
    depending on the context.

    In simple terms:
        A single method or object can behave differently in different situations.

--------------------------------------------------------------------------------
TYPES OF POLYMORPHISM IN JAVA:

1. Compile-Time Polymorphism (Method Overloading)

        Compile-time polymorphism means that the method to be executed is decided
    **during compilation**, based on the method signature (name, number of
    parameters, and types of parameters).

Compile-time polymorphism is achieved through method overloading.
    - Same method name, but different parameters.
    - The decision about which method to call is made at compile time.
    - Also known as static or early binding.

    Example:
        class Calculator {
            int add(int a, int b) {
                return a + b;
            }

            double add(double a, double b) {
                return a + b;
            }

            int add(int a, int b, int c) {
                return a + b + c;
            }
        }

2. Runtime Polymorphism (Method Overriding)

            Runtime polymorphism means that the method to be executed is decided
    **at runtime**, depending on the actual object that is being referred to
    by a parent class reference.

    It occurs when a subclass **overrides** a method of its superclass and
    we use a **parent class reference** to point to a **child class object**.

Runtime-time polymorphism is achieved through method Overriding.
    - Subclass provides a specific implementation of a method defined in its parent class.
    - The method call is resolved at runtime.
    - Also known as dynamic or late binding.

    Example:
        class Animal {
            void sound() {
                System.out.println("Animal makes sound");
            }
        }

        class Dog extends Animal {
            void sound() {
                System.out.println("Dog barks");
            }
        }

        class Cat extends Animal {
            void sound() {
                System.out.println("Cat meows");
            }
        }

        public class Main {
            public static void main(String[] args) {
                Animal a;

                a = new Dog();
                a.sound();  // Output: Dog barks

                a = new Cat();
                a.sound();  // Output: Cat meows
            }
        }

--------------------------------------------------------------------------------
WHY USE POLYMORPHISM?

- To achieve flexibility in code design.
- To implement behavior that varies depending on the object type.
- To enable loose coupling between components.
- To support dynamic method resolution during execution.

--------------------------------------------------------------------------------
REAL-WORLD EXAMPLE:

    - A remote control can operate a TV, AC, or Music System.
    - One interface (remote) → many forms (TV, AC, etc.)

    In code:
        Remote r;

        r = new TV();
        r.power();  // Turns on TV

        r = new AC();
        r.power();  // Turns on AC

--------------------------------------------------------------------------------
BENEFITS OF POLYMORPHISM:

- Improves code flexibility and reusability.
- Simplifies method calling by using a common interface.
- Makes it easier to add new classes without modifying existing code.
- Supports method overriding and dynamic behavior.

--------------------------------------------------------------------------------
IMPORTANT NOTES:

- Polymorphism works through **inheritance** and **interfaces**.
- In runtime polymorphism, the decision of which method to execute
  is made during program execution, not compilation.

================================================================================
*/

package com.oops.polymorphism;

public class BasicsOfPolymorphism {
}
