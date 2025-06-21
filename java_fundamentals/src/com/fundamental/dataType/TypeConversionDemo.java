/*
 * ============================================
 *               TYPE CONVERSION IN JAVA
 * ============================================
 *
 * -> Type conversion means converting one data type into another.
 * -> In Java, this can happen in two ways:
 *    1. Implicit (Widening)
 *    2. Explicit (Narrowing / Type Casting)
 *
 *
 * 1. IMPLICIT TYPE CONVERSION (Widening)
 * --------------------------------------------
 * -> Happens automatically when a smaller data type is converted to a larger one
 * -> No data is lost
 * -> Also called "Widening Conversion"
 *
 * -> Order of Widening:
 *    byte -> short -> int -> long -> float -> double
 *
 * -> Example:
 *    int a = 100;
 *    long b = a;      // int to long
 *    float c = b;     // long to float
 *
 *
 * 2. EXPLICIT TYPE CONVERSION (Narrowing / Type Casting)
 * --------------------------------------------------------
 * -> Must be done manually by the programmer
 * -> Used when converting a larger data type to a smaller one
 * -> Data loss may occur
 * -> Also called "Narrowing Conversion"
 *
 * -> Syntax: targetType variable = (targetType) value;
 *
 * -> Example:
 *    double d = 10.75;
 *    int i = (int) d;   // Output: 10 (decimal part lost)
 *
 *
 * SPECIAL POINT:
 * --------------------------------------------
 *  HOW CAN A 64-BIT long BE STORED IN A 32-BIT float?
 *
 * -> float is 32 bits, and long is 64 bits — still conversion is allowed.
 * -> Reason: float stores values in scientific notation (exponential form)
 * -> It can represent very large values, though with limited precision
 *
 * -> So, even though float has fewer bits, it can hold wider range
 *    of values than long, but the exact value may not be preserved.
 *
 * -> Example:
 *    long l = 1234567890123456789L;
 *    float f = l;   // Valid, but some precision is lost
 *
 *
 * INTERNAL STRUCTURE OF float (32-bit Floating Point)
 * -----------------------------------------------------
 * -> float uses the IEEE 754 standard to represent numbers.
 * -> Total: 32 bits, divided into 3 parts:
 *
 *    1. Sign Bit     -> 1 bit
 *       - 0 for positive, 1 for negative
 *
 *    2. Exponent     -> 8 bits
 *       - Represents the power of 2 (range or scale of number)
 *       - Stored in biased form (actual exponent + 127)
 *
 *    3. Mantissa     -> 23 bits
 *       - Stores the actual digits of the number
 *       - Also called the significant or fraction
 *
 * -> Because of this structure:
 *    - float can store very large or very small numbers
 *    - but may lose **exact precision** for very large integers
 *
 * -> That’s why float can represent a 64-bit long value range-wise,
 *    even though it’s only 32-bit in size.
 *
 *
 *
 *
 */



package com.fundamental.dataType;

public class TypeConversionDemo {
    public static void main(String[] args) {
        // widening type conversion
        byte b =11;
        short s =b;
        int i = b;
        long l =b;
        float f = l;
        double d = b;
        System.out.println("Integer is :"+i +" float : "+f);

        // explicit type conversion
        double number = 120759347.0380438;
        float myFloat = (float)number;
        int myInt = (int)number;
        System.out.println("Integer  :"+myInt +" float : "+myFloat);

    }
}

