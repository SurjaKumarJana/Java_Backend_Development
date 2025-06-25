/*
================================================================================
                            'this' KEYWORD IN JAVA
================================================================================

Definition:
    The `this` keyword is a reference variable in Java that refers to the
    **current object** — the object on which a method or constructor is invoked.

    In other words, `this` is used inside a class to refer to:
        - The current instance of the class
        - Current object's fields and methods

--------------------------------------------------------------------------------
COMMON USES OF 'this' KEYWORD:

1. To refer to **current instance variables** when there's a naming conflict.

2. To call another constructor in the **same class** (constructor chaining).

3. To **pass the current object** as an argument to a method or constructor.

4. To return the **current object** from a method.

--------------------------------------------------------------------------------
1. USING 'this' TO RESOLVE VARIABLE NAME CONFLICT:

    class Student {
        String name;
        int age;

        Student(String name, int age) {
            this.name = name;  // Refers to instance variable
            this.age = age;
        }

        void display() {
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
        }
    }

--------------------------------------------------------------------------------
2. CALLING A CONSTRUCTOR FROM ANOTHER CONSTRUCTOR:

    class Student {
        String name;
        int age;

        Student() {
            this("Unknown", 0); // Calls parameterized constructor
        }

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

Note:
    - The constructor call using `this(...)` must be the first line.

--------------------------------------------------------------------------------
3. PASSING 'this' AS A METHOD ARGUMENT:

    class Student {
        void show(Student s) {
            System.out.println("Object received");
        }

        void call() {
            show(this);  // Passing current object
        }
    }

--------------------------------------------------------------------------------
4. RETURNING THE CURRENT OBJECT:

    class Student {
        Student getInstance() {
            return this;  // Returns current object
        }
    }

--------------------------------------------------------------------------------
WHY IS 'this' IMPORTANT?

- Resolves naming conflicts between local and instance variables.
- Helps in constructor chaining (avoids code repetition).
- Supports method chaining by returning the current object.
- Makes code easier to read and maintain.

--------------------------------------------------------------------------------
KEY POINTS:

- `this` can only be used **inside non-static methods or constructors**.
- You cannot use `this` inside a `static` context (since static belongs to class, not instance).
- Improves clarity and avoids confusion in larger classes or frameworks.

================================================================================
*/


package com.oops.keywords;

class Student {
    String name;
    int age;

    // constractor chaning
    Student(){
        this("unknown", 0);
    }
    // avoid name conflict
    Student(String name, int age) {
        this.name = name;  // Refers to instance variable
        this.age = age;
    }

    //returning the current object
    Student setName(String name){
        this.name = name;
        return this;
    }
    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
    void great(){
        System.out.println("Hello from  "+ this.name);

    }
}


public class ThisKeyWord {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Arun").great();
    }
}
