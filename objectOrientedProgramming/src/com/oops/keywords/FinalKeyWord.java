/*
================================================================================
FINAL KEYWORD IN JAVA
================================================================================

Definition:
    In Java, the "final" keyword is used to denote a constant or an unmodifiable
    entity. Once a variable, method or class is declared as final, it cannot be
    modified or overridden.

    In simple terms, `final` means "unchangeable" or "constant".

--------------------------------------------------------------------------------
1. FINAL VARIABLES (Constants)
--------------------------------------------------------------------------------
- Once assigned, a final variable cannot be changed.
- You must initialize it at the time of declaration OR in the constructor.

Example:
    final int x = 10;
    x = 20;  // Error: cannot assign a value to final variable 'x'

    final int y;
    y = 100;  // OK if done in constructor or instance initializer block

    final double PI = 3.14159;

    // For constants, use all uppercase by convention:
    final int MAX_SPEED = 120;

--------------------------------------------------------------------------------
2. FINAL METHODS
--------------------------------------------------------------------------------
- A final method cannot be overridden in a subclass.
- Useful when you want to prevent a specific method from being changed.

Example:
    class Animal {
        final void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Dog extends Animal {
        // void sound() { }  // Error: Cannot override final method
    }

--------------------------------------------------------------------------------
3. FINAL CLASSES
--------------------------------------------------------------------------------
- A final class cannot be extended/inherited.
- Prevents subclasses from being created.

Example:
    final class MathHelper {
        static int square(int x) {
            return x * x;
        }
    }

    // class MyMath extends MathHelper { }  // Error: Cannot subclass a final class

--------------------------------------------------------------------------------
4. FINAL PARAMETERS
--------------------------------------------------------------------------------
- A method parameter declared as `final` cannot be reassigned inside the method.

Example:
    void printValue(final int value) {
        // value = value + 1;  // Error: cannot assign a value to final parameter
        System.out.println(value);
    }

--------------------------------------------------------------------------------
5. FINAL WITH OBJECT REFERENCES
--------------------------------------------------------------------------------
- If an object reference is declared as `final`, it cannot point to a new object.
- However, the **contents** (fields) of the object can still be modified.

Example:
    final Student s = new Student();
    s.name = "Amit";        // OK: modifying field
    s = new Student();      // Error: cannot reassign final reference

--------------------------------------------------------------------------------
SUMMARY

| Context     | Effect of `final`                                |
|-------------|--------------------------------------------------|
| Variable    | Value cannot be changed once assigned             |
| Method      | Cannot be overridden in subclasses                |
| Class       | Cannot be extended (no subclassing allowed)       |
| Parameter   | Cannot be reassigned inside the method            |
| Reference   | Cannot point to a new object                      |

--------------------------------------------------------------------------------
BEST PRACTICES

- Use `final` to define constants and ensure immutability.
- Use `final` methods when you want to lock critical behavior.
- Declare variables or parameters as `final` to avoid accidental changes.

================================================================================
*/

package com.oops.keywords;

class Car{
    final int MAX_SPEED =120;


}

public class FinalKeyWord {
    public static void main(String[] args) {
        Car c1 = new Car();
        //c1.MAX_SPEED =10;// this will show error
    }

}
