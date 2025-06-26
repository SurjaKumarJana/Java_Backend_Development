/*
================================================================================
                                    WHAT IS ABSTRACTION
================================================================================

Definition:
    Abstraction is one of the four fundamental principles of Object-Oriented Programming (OOP).
    It refers to the process of **hiding the internal implementation details** of a class or object,
    and **exposing only the essential and relevant features** to the outside world.

    In other words:
        → Abstraction allows us to focus on **what an object does** rather than **how it does it**.

    The main goal of abstraction is to reduce complexity, improve code clarity,
    and prevent users from interacting with the unnecessary or sensitive parts
    of a system's logic.

--------------------------------------------------------------------------------
Why Abstraction is Useful:
    - Helps to manage large and complex systems by exposing only the required parts.
    - Prevents misuse of internal logic by hiding it from the outside.
    - Promotes clean and secure API design.
    - Supports modular programming and improves code reusability.

--------------------------------------------------------------------------------
Real-Life Example:
    Think of a **mobile phone**:
        - You use buttons or touch to make a call, send messages, or take photos.
        - You don’t need to know the working of the processor, sensors, or circuits.
        - The complex working is hidden — only the important features are visible.

    → That is abstraction in action.

--------------------------------------------------------------------------------
How Abstraction is Achieved in Java:
    1. **Using Abstract Classes**:
        - A class declared with the `abstract` keyword.
        - Can contain abstract methods (no body) and concrete methods (with body).
        - Cannot be instantiated directly — must be extended.

    2. **Using Interfaces**:
        - A 100% abstract type (in older Java versions).
        - Contains method declarations only (Java 8+ allows default and static methods too).
        - A class must implement an interface and define its methods.

--------------------------------------------------------------------------------
Example:
    interface Animal {
        void makeSound(); // method declaration only
    }

    class Dog implements Animal {
        public void makeSound() {
            System.out.println("Dog barks");
        }
    }

    // The user only sees the makeSound() method — not how it’s implemented internally.

--------------------------------------------------------------------------------
Key Characteristics of Abstraction:
    ✓ Hides the implementation.
    ✓ Shows only the necessary behavior.
    ✓ Achieved using abstract classes and interfaces.
    ✓ Promotes clean and maintainable code design.

================================================================================
*/

package com.oops.abstraction;

public class BasicesOfAbstraction {
}
