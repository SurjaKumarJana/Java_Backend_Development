/*
================================================================================
                    THE `super` KEYWORD IN JAVA
================================================================================

Definition:
    The `super` keyword in Java is a reference variable used to refer to the
    **immediate parent class** of the current object. It is commonly used
    in **inheritance** to access parent class methods, constructors, or variables.

--------------------------------------------------------------------------------
USES OF `super` IN JAVA:

1. Access Parent Class Fields
    - When a subclass has a variable with the same name as its superclass,
      `super` is used to refer to the superclass variable.

2. Call Parent Class Methods
    - If a method is overridden in the subclass, `super.methodName()` can be
      used to call the parent version of that method.

3. Call Parent Class Constructor
    - `super()` is used to explicitly call the parent class constructor from the
      subclass constructor.
    - This must be the **first statement** in the subclass constructor.

--------------------------------------------------------------------------------
EXAMPLE 1: Accessing Parent Class Variable

    class Animal {
        String type = "Animal";
    }

    class Dog extends Animal {
        String type = "Dog";

        void printTypes() {
            System.out.println(type);       // Dog
            System.out.println(super.type); // Animal
        }
    }

--------------------------------------------------------------------------------
EXAMPLE 2: Calling Parent Method

    class Animal {
        void makeSound() {
            System.out.println("Animal makes sound");
        }
    }

    class Dog extends Animal {
        void makeSound() {
            System.out.println("Dog barks");
        }

        void callParentSound() {
            super.makeSound(); // Calls Animal's makeSound
        }
    }

--------------------------------------------------------------------------------
EXAMPLE 3: Calling Parent Constructor

    class Animal {
        Animal(String name) {
            System.out.println("Animal name is: " + name);
        }
    }

    class Dog extends Animal {
        Dog() {
            super("Bruno"); // Calls parent class constructor with parameter
            System.out.println("Dog constructor called");
        }
    }

--------------------------------------------------------------------------------
IMPORTANT POINTS:

- `super()` must be the first statement in the subclass constructor.
- `super` can only access members from the **immediate parent** class.
- `super` is mainly used in inheritance and constructor chaining.

--------------------------------------------------------------------------------
WHEN TO USE:

- To avoid ambiguity when both parent and child have the same field or method.
- To reuse parent class logic without duplicating code.
- To ensure correct constructor execution in inheritance.

================================================================================
*/


package com.oops.keywords;

class Animal{
    String type = "Animal";

    Animal(){
        System.out.println("Animal class constractor is working...");

    }

    void makeSound(){
        System.out.println("Animal is making noise....");
    }
}

class Cat extends  Animal{
    String type = "Cat";
    Cat(){
        super();//// accessing constractor  of parent class
        // for constractor we have to make sure that super is at the begining of constractor block
        System.out.println("Dog class constractor is working...");
    }
    void makeSound(){
        System.out.println("Cat is making sound..");
        System.out.println(super.type);// // accessing variable of parent class
        super.makeSound();// accessing method of parent class
    }


}

public class SuperKeyWord {
    public static void main(String[] args) {
        Cat c = new Cat();

        c.makeSound();

    }
}
