/*
 * ================================
 *        WRAPPER CLASSES IN JAVA
 * ================================
 *
 * >> What is a Wrapper Class?
 *
 * A wrapper class in Java is an object representation of a primitive data type.
 * A Wrapper Class is a special class in Java
 * that allows to use primitive data types (like int, char, etc.) as objects.
 *
 * It "wraps" the primitive value into an object, allowing it to be used where objects are required
 * (e.g., in collections like ArrayList).
 *
 * ============================================
 *     WHY WRAPPER CLASS IS NEEDED IN JAVA
 * ============================================
 *
 * primitive data types are usedfull in many cases like -->
 *--------------------------------------------
 * 1. it is faster in execution (no object overhead)
 *     => Ideal for performance-sensitive code like loops & calculations
 *
 * 2. Use less memory
 *     => Primitives are stored directly, wrappers use more memory (heap + reference)
 *
 * 3. Avoid NullPointerExceptions
 *    => Primitives cannot be null, so safer in many scenarios
 *
 * 4. Simpler for basic tasks
 *    => Direct and easy to use for simple variables and math
 *
 * PROBLEMS WITH PRIMITIVE DATA TYPES:
 * --------------------------------------------
 * 1. Cannot be used in Java Collections
 *    → Example: ArrayList<int> (Not allowed)
 *
 * 2. Cannot store null values
 *    → You can't write: int a = null;
 *
 * 3. No utility methods available
 *    → You can't call methods like int.toString() or int.parseInt()
 *
 * 4. Cannot behave like Objects
 *    → Java is object-oriented; many frameworks expect Objects
 *
 * 5. Limited in flexible type handling
 *    → Harder to work with generics, conversions, etc.
 *
 * HOW WRAPPER CLASSES SOLVE THESE ISSUES:
 * --------------------------------------------
 * 1. Can be used in Collections
 *    → Example: ArrayList<Integer>
 *
 * 2. Can store null values
 *    → Integer a = null; useful when value is unknown or optional
 *
 * 3. Provide utility methods
 *    → Integer.parseInt("123"), Double.toString(10.5)
 *
 * 4. Support Object-Oriented Features
 *    → Can be used with generics, passed to methods expecting objects
 *
 * 5. Autoboxing & Unboxing make it easy
 *    → Java automatically converts between primitive and wrapper types
 *
 * SO Wrapper class is help full in this way
 *
 * - Required when working with collections (e.g., ArrayList<Integer>)
 * - Supports utility methods (e.g., Integer.parseInt())
 * - Enables object features like null assignment
 * - Autoboxing and unboxing simplifies conversion between primitives and wrappers
 *
 * -------------------------------
 * AUTOBOXING AND UNBOXING
 * -------------------------------
 * Autoboxing: Converting primitive to wrapper automatically
 *   Example: Integer x = 10; // int to Integer
 *
 * Unboxing: Converting wrapper to primitive automatically
 *   Example: int y = x;      // Integer to int
 * -------------------------------
 * PRIMITIVE   →   WRAPPER CLASS
 * -------------------------------
 * byte        →   Byte
 * short       →   Short
 * int         →   Integer
 * long        →   Long
 * float       →   Float
 * double      →   Double
 * char        →   Character
 * boolean     →   Boolean
 *

 *
 * -------------------------------
 * Example with Integer class
 * -------------------------------
 * Integer.parseInt("123")   → converts String to int
 * Integer.toString(123)     → converts int to String
 * Integer.MAX_VALUE         → largest int value
 * Integer.MIN_VALUE         → smallest int value
 *
 * we cann't do this with primitive type values
 */



package com.fundamental.dataType;

public class WrapperClassDemo {
    public static void main(String[] args) {
        // primitive values
        byte a  = 23;
        int b =1234;
        float f = 254.030F;
        //for them we don't have any extra utility menthods

        // Wrapper classes
        Byte refference1 = a;
        Integer refference2 = b;
        Float refference3 = f;
        // for them we have many utility methods

        String str = "number " + Integer.toString(refference2);
        System.out.println(str);

    }

}
