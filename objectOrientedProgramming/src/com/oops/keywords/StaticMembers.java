/*
================================================================================
STATIC MEMBERS IN JAVA
================================================================================

Definition:
    The `static` keyword in Java is used to create **class-level members**.

    - Static members belong to the **class**, not to any specific object.
    - They are **shared among all instances** of the class.
    - there is only one copy of a static member shared by all instances of the class,
    - You can access them using the class name directly.

--------------------------------------------------------------------------------
1. STATIC VARIABLES (Class variables)
--------------------------------------------------------------------------------
- Declared using the `static` keyword.
- Memory is allocated only once when the class is loaded.
- Shared across all objects of the class.

Example:
    class Student {
        int id;
        static String college = "ABC College";  // shared by all students

        Student(int id) {
            this.id = id;
        }

        void display() {
            System.out.println(id + " " + college);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Student s1 = new Student(101);
            Student s2 = new Student(102);

            s1.display();  // 101 ABC College
            s2.display();  // 102 ABC College
        }
    }

--------------------------------------------------------------------------------
2. STATIC METHODS
--------------------------------------------------------------------------------
- Can be called without creating an object.
- Can access only **static data** directly.
- Cannot use `this` or `super` inside static methods.

Example:
    class Utility {
        static int square(int x) {
            return x * x;
        }
    }

    public class Main {
        public static void main(String[] args) {
            int result = Utility.square(5);  // No need to create object
            System.out.println(result);      // Output: 25
        }
    }

--------------------------------------------------------------------------------
3. STATIC BLOCK
--------------------------------------------------------------------------------
- A static block is used to **initialize static data**.
- Executes only once, when the class is first loaded.

Example:
    class Example {
        static int data;

        static {
            data = 100;  // static initialization block
            System.out.println("Static block executed");
        }
    }

--------------------------------------------------------------------------------
4. STATIC NESTED CLASSES
--------------------------------------------------------------------------------
- A class can be declared static inside another class.
- Static nested classes can access only static members of the outer class.

Example:
    class Outer {
        static int outerData = 10;

        static class Inner {
            void show() {
                System.out.println("Data: " + outerData);
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            Outer.Inner obj = new Outer.Inner();
            obj.show();  // Output: Data: 10
        }
    }

--------------------------------------------------------------------------------
KEY POINTS:
    - Static members are loaded only once with the class (not per object).
    - Use static for constants, utility methods, or shared configurations.
    - Static methods cannot access non-static instance variables directly.
    - Avoid overusing static—it breaks object-oriented design if misused.

--------------------------------------------------------------------------------
SUMMARY TABLE:

| Static Element       | Purpose                                         |
|----------------------|-------------------------------------------------|
| static variable      | Shared data among all objects                   |
| static method        | Can be called without creating an object        |
| static block         | Runs once at class loading, for initialization  |
| static nested class  | A class inside another, behaves like top-level  |

================================================================================
*/
package com.oops.keywords;

class CollegeStudent {
    int id;
    static String college;// shared by all students
    static {
        college= "ABC College";
    }

    CollegeStudent(int id) {
        this.id = id;
    }

    void display() {
        System.out.println(id + " " + college);
    }
}


public class StaticMembers {
    public static void main(String[] args) {
//        CollegeStudent cs1 = new CollegeStudent(102);
//        CollegeStudent cs2 = new CollegeStudent(103);
//        cs1.display();
//        cs2.display();

        System.out.println(CollegeStudent.college);
    }
}
