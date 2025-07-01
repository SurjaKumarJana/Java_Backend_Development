/*
================================================================================
LAMBDA EXPRESSIONS IN JAVA
================================================================================

Definition:
    A **lambda expression** is a short block of code which takes in parameters
    and returns a value. Lambda expressions are used primarily to define the
    implementation of a functional interface (i.e., an interface with a single
    abstract method).

    Lambda expressions were introduced in **Java 8** to support **functional
    programming** and to make code more concise and readable.

--------------------------------------------------------------------------------
Syntax:
    (parameter list) -> { body }

    OR, simplified forms:
    - No parameter:           () -> System.out.println("Hello");
    - One parameter:          name -> System.out.println(name);
    - Multiple parameters:    (a, b) -> a + b;

--------------------------------------------------------------------------------
Example 1: Using Lambda with Runnable (Built-in Functional Interface)

    public class Demo {
        public static void main(String[] args) {
            Runnable r = () -> System.out.println("Running in thread");
            new Thread(r).start();
        }
    }

--------------------------------------------------------------------------------


--------------------------------------------------------------------------------
Example 3: Lambda with Parameters and Return Value

    @FunctionalInterface
    interface Adder {
        int add(int a, int b);
    }

    public class Demo {
        public static void main(String[] args) {
            Adder sum = (a, b) -> a + b;
            System.out.println("Sum: " + sum.add(5, 3)); // Output: 8
        }
    }

--------------------------------------------------------------------------------
Key Features:
    - Concise way to write anonymous inner classes.
    - Improves readability and maintainability.
    - Enables functional programming using streams and collections.

--------------------------------------------------------------------------------
Rules:
    - Can be used only with functional interfaces.
    - Types of parameters can be omitted (type inference).
    - If only one parameter, parentheses are optional.
    - If body has one statement, braces `{}` and return are optional.

================================================================================
*/



package com.surja.lambda;

import com.surja.funtionalInterface.CalculateValue;

public class LamdaExpressionDemo {
    public static void main(String[] args) {



        Greeting greeting = () -> System.out.println("Hello, Lambda!");
        greeting.say();
        CalculateValue ca = (a,b)-> a+b;
        System.out.println(ca.calculate(5,3));

    }

}
