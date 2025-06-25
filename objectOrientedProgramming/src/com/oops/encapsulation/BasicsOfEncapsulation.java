
/*
================================================================================
ENCAPSULATION IN JAVA
================================================================================

Definition:
    Encapsulation is one of the four main pillars of Object-Oriented Programming (OOP).
    It refers to the concept of **hiding internal object details** and only exposing
    necessary parts through public methods.

    In simple words:
        → "Bind the data and methods that operate on the data into a single unit."
        → "Hide internal details, and show only what is necessary to the outside world."

--------------------------------------------------------------------------------
Key Concepts:
    - Declare fields (variables) as `private` → not accessible from outside directly.
    - Provide `public` getter and setter methods to access and modify the private fields.
    - Controls how data is accessed or modified (adds a layer of security).

--------------------------------------------------------------------------------
Why Encapsulation?
    - Prevents direct access to sensitive data.
    - Allows validation before updating data.
    - Improves code modularity and reusability.
    - Makes maintenance and debugging easier.


--------------------------------------------------------------------------------
Advantages of Encapsulation:
    - Data is hidden from outside classes (security).
    - Can add logic inside setters (e.g., validation).
    - Class is easier to maintain and modify.
    - Increases flexibility by changing internal code without affecting users.
    - Encourages use of standard APIs to access class data.

--------------------------------------------------------------------------------
Real-World Analogy:
    - Think of a capsule: medicine is enclosed inside a shell.
    - The user only knows how to take the capsule, not what's inside or how it's made.

================================================================================
*/
package com.oops.encapsulation;

class Student {
    // states
    // we can restric there access by access modifies
    private String name;
    int age;
    private int rollNo;
    String dept;


    // Setter method
    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        if (a > 0) {
            age = a;
        }
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Getter method
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDept() {
        return dept;
    }


    public int getRollNo() {
        return rollNo;
    }

}





public class BasicsOfEncapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Amit");
        s.setAge(20);

        // if we try to directly access the data and modify it we can't
        //s.name; // this will show compilation error
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
