/*
 * ================================
 *           VARIABLES IN JAVA
 * ================================
 *
 * >> What is a Variable?
 * A variable is a named container used to store data values during program execution.
 * In Java, every variable must be declared with a specific data type.
 *
 * -------------------------------
 * VARIABLE SYNTAX
 * -------------------------------
 * dataType variableName = value;
 * Example: int age = 25;
 *
 * -------------------------------
 * TYPES OF VARIABLES IN JAVA
 * -------------------------------
 * 1. Local Variable:
 *    - Declared inside methods, constructors, or blocks.
 *    - Scope is limited to the block where it's defined.
 *    - Must be initialized before use.
 *
 * 2. Instance Variable:
 *    - Declared inside a class but outside any method.
 *    - Belongs to the object (non-static).
 *    - Has default values.
 *
 * 3. Static Variable (Class Variable):
 *    - Declared with the 'static' keyword inside a class.
 *    - Shared among all objects of the class.
 *    - Belongs to the class, not the instance.
 *
 * -------------------------------
 * NAMING RULES FOR VARIABLES
 * -------------------------------
 * - Must begin with a letter (A-Z or a-z), $ or _
 * - Cannot start with a digit
 * - Can include letters, digits, $ and _
 * - Cannot be a Java reserved keyword
 * - Should follow camelCase convention for readability
 *   Example: studentAge, totalMarks, isValid
 *
 * -------------------------------
 * DEFAULT VALUES
 * -------------------------------
 * - Local variables: No default value (must initialize before use)
 * - Instance/static variables:
 *      int, byte, short, long   -> 0
 *      float, double            -> 0.0
 *      char                     -> '\u0000'
 *      boolean                  -> false
 *      Object/Reference types   -> null
 *
 */



package com.fundamental.variable;

public class BasicsOfVar {

    int value = 5465;
    static int myInstance = 5465;
    // as main is a static method we also have to declare it as static

    // main method
    public static void main(String[] args) {
        // localVar is a local variable and it can be acessed in side the perticular method
        // that is main here , out side of main we can't access it

        int localVar = 10;// this is a primitive type variable
        String str = "Java Program "; // this is a referrence type variable that points to an object "Java Program"
        System.out.println("This is my local variable : "+localVar);
        System.out.println("This is my instance variable : "+myInstance);


    }




    // another method
    void printhello(){
        float word = 12.6F ;// it is also a local variable()
        System.out.println(word);
        // if we try to access localVar here this will throw error
        //System.out.println(localVar); // it throws error
        System.out.println("the is a instance variable : "+value);

    }


}
