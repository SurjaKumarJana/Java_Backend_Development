/*
 * =============================================
 *                OPERATORS IN JAVA
 * =============================================
 *
 * -> Operators are special symbols that perform operations on variables and values.
 * -> Java supports many types of operators:
 *
 *
 * 1. ARITHMETIC OPERATORS
 * ---------------------------------------------
 * -> Used to perform basic arithmetic operations.
 *
 * -> +  : Addition
 * -> -  : Subtraction
 * -> *  : Multiplication
 * -> /  : Division
 * -> %  : Modulus (Remainder)
 *
 * -> Example:
 *    int a = 10, b = 3;
 *    int sum = a + b;     // 13
 *    int mod = a % b;     // 1
 *
 *
 * 2. RELATIONAL (COMPARISON) OPERATORS
 * ---------------------------------------------
 * -> Used to compare two values and return true/false.
 *
 * -> == : Equal to
 * -> != : Not equal to
 * -> >  : Greater than
 * -> <  : Less than
 * -> >= : Greater than or equal to
 * -> <= : Less than or equal to
 *
 * -> Example:
 *    int x = 5, y = 10;
 *    boolean result = x < y;  // true
 *
 *
 * 3. LOGICAL OPERATORS
 * ---------------------------------------------
 * -> Used to combine multiple boolean expressions.
 *
 * -> && : Logical AND (true if both conditions are true)
 * -> || : Logical OR  (true if any one condition is true)
 * -> !  : Logical NOT (reverses boolean value)
 *
 * -> Example:
 *    int age = 25;
 *    if (age > 18 && age < 60) {
 *        // adult
 *    }
 *
 *
 * 4. ASSIGNMENT OPERATORS
 * ---------------------------------------------
 * -> Used to assign values to variables.
 *
 * -> =   : Assign
 * -> +=  : Add and assign
 * -> -=  : Subtract and assign
 * -> *=  : Multiply and assign
 * -> /=  : Divide and assign
 * -> %=  : Modulus and assign
 *
 * -> Example:
 *    int a = 5;
 *    a += 3;  // a = a + 3 → 8
 *
 *
 * 5. UNARY OPERATORS
 * ---------------------------------------------
 * -> Used with only one operand.
 *
 * -> +  : Unary plus (positive number)
 * -> -  : Unary minus (negative number)
 * -> ++ : Increment (increases by 1)
 * -> -- : Decrement (decreases by 1)
 * -> !  : Logical NOT
 *
 * -> Example:
 *    int a = 10;
 *    a++;  // now a is 11
 *
 *
 * 6. BITWISE OPERATORS
 * ---------------------------------------------
 * -> Used to perform operations on bits (0s and 1s).
 *
 * -> &  : Bitwise AND
 * -> |  : Bitwise OR
 * -> ^  : Bitwise XOR
 * -> ~  : Bitwise Complement
 * -> << : Left shift
 * -> >> : Right shift
 *
 * -> Example:
 *    int x = 5;      // binary: 0101
 *    int y = 3;      // binary: 0011
 *    int z = x & y;  // binary: 0001 → z = 1
 *
 *
 * 7. TERNARY OPERATOR
 * ---------------------------------------------
 * -> Short form of if-else
 * -> Syntax: condition ? value_if_true : value_if_false
 *
 * -> Example:
 *    int a = 10, b = 20;
 *    int max = (a > b) ? a : b;  // max = 20
 *
 *
 * 8. INSTANCEOF OPERATOR
 * ---------------------------------------------
 * -> Checks whether an object is an instance of a specific class.
 *
 * -> Syntax: object instanceof ClassName
 *
 * -> Example:
 *    String s = \"hello\";
 *    boolean check = s instanceof String;  // true
 *
 *
 */

package com.fundamental.operator;

public class BasicsOfOperator {
}
