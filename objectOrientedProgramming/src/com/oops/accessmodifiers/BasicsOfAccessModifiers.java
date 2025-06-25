/*
================================================================================
                    ACCESS MODIFIERS IN JAVA
================================================================================

Definition:
    Access modifiers define the **visibility (accessibility)** of classes, methods,
    variables, and constructors in Java. They determine **who can access** a
    particular class member (inside class, same package, other packages, etc.).

--------------------------------------------------------------------------------
TYPES OF ACCESS MODIFIERS IN JAVA:

1. private
    - Accessible only within the same class.
    - Not visible to subclasses or other classes in the same package.

2. default (no modifier)
    - Accessible only within the same package.
    - Also called "package-private".
    - If no modifier is specified, it is considered default.

3. protected
    - Accessible within the same package.
    - Also accessible in subclasses (even if they are in different packages).

4. public
    - Accessible from **anywhere** in the program.
    - No restriction on access.

--------------------------------------------------------------------------------
ACCESS LEVEL SUMMARY TABLE:

| Modifier    | Same Class | Same Package | Subclass (diff pkg) | Other Packages |
|-------------|------------|--------------|----------------------|----------------|
| private     | Yes        | No           | No                   | No             |
| default     | Yes        | Yes          | No                   | No             |
| protected   | Yes        | Yes          | Yes                  | No             |
| public      | Yes        | Yes          | Yes                  | Yes            |
-----------------------------------------------------------------------------------

--------------------------------------------------------------------------------
WHY USE ACCESS MODIFIERS?

- To **enforce encapsulation** (hide details from outside code).
- To **protect important fields** from unauthorized changes.
- To **control what is accessible** outside the class or package.
- Helps in designing **robust APIs**.

--------------------------------------------------------------------------------
BEST PRACTICES:

- Make fields `private` and provide `public` getters/setters → Encapsulation.
- Use `protected` only if you expect inheritance.
- Use `default` for internal package-level logic.
- Use `public` only when you want complete access (e.g., utility methods).

================================================================================
*/



package com.oops.accessmodifiers;


public class BasicsOfAccessModifiers {
    public static void main(String[] args) {
        Person p = new Person();

        // p.name = "Amit";         // ERROR → private
        p.age = 22;                 // OK → default
        p.address = "Delhi";        // OK → protected, same package
        p.nationality = "Indian";   // OK → public

        p.showInfo();               // Can access all fields internally
    }
}
