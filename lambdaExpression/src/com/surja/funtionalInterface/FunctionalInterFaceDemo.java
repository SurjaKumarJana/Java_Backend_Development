/*
================================================================================
FUNCTIONAL INTERFACE IN JAVA
================================================================================

Definition:
    A **functional interface** in Java is an interface that contains exactly
    **one abstract method**. These interfaces can have multiple default or
    static methods but only one abstract method.

    Functional interfaces are the foundation of **lambda expressions** and
    functional programming features introduced in **Java 8**.

--------------------------------------------------------------------------------
Annotation: @FunctionalInterface
    - It is an optional annotation used to indicate that the interface is
      intended to be a functional interface.
    - The compiler will generate an error if the interface annotated with
      @FunctionalInterface has more than one abstract method.

--------------------------------------------------------------------------------
Examples of Functional Interfaces in Java:
    1. java.lang.Runnable
        -> void run();

    2. java.util.Comparator<T>
        -> int compare(T o1, T o2);

    3. java.util.function.Predicate<T>
        -> boolean test(T t);

    4. java.util.function.Function<T, R>
        -> R apply(T t);

    5. java.util.function.Supplier<T>
        -> T get();

--------------------------------------------------------------------------------
Example: Custom Functional Interface
    @FunctionalInterface
    interface MyFunctionalInterface {
        void sayHello(); // Only one abstract method
    }

    public class Demo {
        public static void main(String[] args) {
            // Using lambda expression
            MyFunctionalInterface greeting = () -> System.out.println("Hello, Java!");
            greeting.sayHello();
        }
    }

--------------------------------------------------------------------------------
Rules:
    - Only one abstract method is allowed.
    - Can have multiple default and static methods.
    - Can override methods from java.lang.Object (e.g., toString, equals).

--------------------------------------------------------------------------------
Why Use Functional Interfaces?
    - Enables writing cleaner and more readable code using lambda expressions.
    - Facilitates passing behavior (functions) as parameters to methods.
    - Supports functional programming style in Java.

================================================================================
*/



package com.surja.funtionalInterface;

public class FunctionalInterFaceDemo {

}
