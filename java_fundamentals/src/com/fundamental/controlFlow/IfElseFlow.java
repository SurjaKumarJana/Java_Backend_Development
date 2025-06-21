/*
 * =============================================
 *            FLOW CONTROL - IF STATEMENTS
 * =============================================
 *
 * -> Flow control means directing the flow of program execution
 *    based on conditions or decisions.
 *
 * -> Java supports decision-making using:
 *    1. if
 *    2. if-else
 *    3. if-else if-else
 *    4. nested if
 *
 *
 * 1. SIMPLE if STATEMENT
 * ---------------------------------------------
 * -> Executes a block of code only if the condition is true.
 *
 * -> Syntax:
 *    if (condition) {
 *        // code to execute if condition is true
 *    }
 *
 * -> Example:
 *    int age = 18;
 *    if (age >= 18) {
 *        System.out.println("You are an adult.");
 *    }
 *
 *
 * 2. if-else STATEMENT
 * ---------------------------------------------
 * -> Executes one block if condition is true,
 *    and another block if condition is false.
 *
 * -> Syntax:
 *    if (condition) {
 *        // true block
 *    } else {
 *        // false block
 *    }
 *
 * -> Example:
 *    int number = 5;
 *    if (number % 2 == 0) {
 *        System.out.println("Even number");
 *    } else {
 *        System.out.println("Odd number");
 *    }
 *
 *
 * 3. if-else if-else LADDER
 * ---------------------------------------------
 * -> Allows checking multiple conditions in sequence.
 *
 * -> Syntax:
 *    if (condition1) {
 *        // block 1
 *    } else if (condition2) {
 *        // block 2
 *    } else {
 *        // default block
 *    }
 *
 * -> Example:
 *    int marks = 85;
 *    if (marks >= 90) {
 *        System.out.println("Grade A");
 *    } else if (marks >= 75) {
 *        System.out.println("Grade B");
 *    } else {
 *        System.out.println("Grade C");
 *    }
 *
 *
 * 4. NESTED if STATEMENTS
 * ---------------------------------------------
 * -> An if statement inside another if or else block.
 *
 * -> Example:
 *    int num = 10;
 *    if (num > 0) {
 *        if (num % 2 == 0) {
 *            System.out.println("Positive even number");
 *        }
 *    }
 *
 *
 * NOTE:
 * -> Conditions inside `if` must return boolean (true/false)
 * -> Use braces `{}` for readability, even for single lines
 *
 */


package com.fundamental.controlFlow;

public class IfElseFlow {
    public static void main(String[] args) {
        // a simple if else if statement
        int num =99;

        if(num >100){
            System.out.println("this is if Statement");
        }
        else if(num<10){
            System.out.println("this is else if statement");
        }
        else {
            System.out.println("this is else statement");
        }
    }
}
