/*
 * ================================
 *         DATA TYPES IN JAVA
 * ================================
 *
 * >> What is a Data Type?
 * A data type in Java defines the type of data a variable can hold.
 * It specifies the size, kind of values, and the operations that can be performed on that data.
 *
 * Java is a statically typed language, so every variable must be declared with a data type before the compilation.
 *
 *
 * -------------------------------
 * 1. PRIMITIVE DATA TYPES (8 types)
 * -------------------------------
 * These are the most basic data types built into the language.
 * They store simple values, not objects.
 *
 * a. byte   : 1 byte (8-bit)     | Range: -128 to 127
 * b. short  : 2 bytes (16-bit)   | Range: -32,768 to 32,767
 * c. int    : 4 bytes (32-bit)   | Range: -2^31 to 2^31-1
 * d. long   : 8 bytes (64-bit)   | Range: -2^63 to 2^63-1
 *
 * e. float  : 4 bytes (32-bit)   | Decimal numbers (up to ~7 digits precision)
 * f. double : 8 bytes (64-bit)   | Decimal numbers (up to ~15 digits precision)
 *
 * g. char   : 2 bytes (16-bit)   | A single character (e.g. 'A', 'z', '9')
 * h. boolean: 1 bit (JVM-dependent) | true or false
 *
 * -------------------------------
 * 2. NON-PRIMITIVE / REFERENCE DATA TYPES
 * -------------------------------
 * These are not built-in like primitives.
 * They refer to objects and store memory addresses (references).
 *
 * Examples: String, Arrays, Classes, Interfaces, etc.
 *
 * -------------------------------
 * DIFFERENCE: Primitive vs Non-Primitive
 * -------------------------------
 * | Feature                  | Primitive Data Types         | Non-Primitive Data Types       |
 * |--------------------------|-------------------------------|--------------------------------|
 * | Stores                   | Actual value                  | Reference to an object         |
 * | Predefined by Java       | Yes                           | No (except some like String)   |
 * | Memory size              | Fixed                         | Can be dynamic                 |
 * | Methods                  | Cannot use methods            | Can call methods               |
 * | Null value               | Cannot be null                | Can be null                    |
 * | Examples                 | int, float, char, boolean     | String, Array, Class, Object   |
 *
 * -------------------------------
 * DEFAULT VALUES
 * -------------------------------
 * byte, short, int, long       -> 0
 * float, double                -> 0.0
 * char                         -> '\u0000' (null character)//because java follows unicode
 * boolean                      -> false
 * reference types (e.g. String) -> null
 *
 */




package com.fundamental.dataType;

public class PrimitiveDataTypeDemo {
    public static void main(String[] args) {
        // boolean
        boolean b = true;
        // integral value
        // character value
        char c = 'A';
        //Numeric values
        //Integers
        byte num1 = 124;
        short num2 = 12453;
        int num3 = 308023;
        long num4 = 20328028234184L;//we use L to make it long
        // Floating point numbers
        //Float
        float f = 28320.232F;
        // if it is float then we must use F at the end
        // by default it is considered as double in java
        //Double
        double d =12.384038048;
        // double is used to represent  more precise floating point number

        /*
         * =======================================
         *   SUFFIX CHARACTERS USED IN DATA TYPES
         * =======================================
         *
         * 1. float  -> 'f' or 'F'
         *    Example: float x = 12.5f;
         *
         * 2. double -> 'd' or 'D' (optional, because decimal literals are double by default)
         *    Example: double y = 12.5d;   // or just 12.5
         *
         * 3. long   -> 'l' or 'L'
         *    Example: long z = 10000000000L;
         *
         * 4. int    -> No suffix needed (default for whole numbers)
         *    Example: int a = 100;
         *
         * 5. char   -> Use single quotes for character literals
         *    Example: char c = 'A';
         *
         * 6. boolean -> No suffix (only two values: true / false)
         *    Example: boolean b = true;
         *
         * 7. byte & short -> No suffix; assign value within range
         *    Example: byte b = 100;
         *             short s = 1000;
         *
         */

        // displaying the results
        System.out.println("boolean : "+b);
        System.out.println("character : "+c);
        System.out.println("byte : "+num1);
        System.out.println("short : "+num2);
        System.out.println("int  : "+num3);
        System.out.println("long : "+num4);
        System.out.println("float : "+f);
        System.out.println("double : "+d);














    }
}
