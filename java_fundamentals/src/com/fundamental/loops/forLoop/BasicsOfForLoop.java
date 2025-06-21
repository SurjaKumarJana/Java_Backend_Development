/*
 * =============================================
 *                 FOR LOOP IN JAVA
 * =============================================
 *
 * -> The `for` loop is used when the number of iterations is known.
 *
 * -> Syntax:
 *    for (initialization; condition; update) {
 *        // code to run
 *    }
 *
 * -> Example:
 *    for (int i = 1; i <= 5; i++) {
 *        System.out.println(i);
 *    }
 *
 * -> Output: 1 2 3 4 5
 *
 *
 * KEY POINTS:
 * ---------------------------------------------
 * -> Initialization: set starting point (e.g., int i = 0)
 * -> Condition: loop continues while true
 * -> Update: modifies counter after each iteration
 * -> Best for fixed number of iterations
 *
 */


package com.fundamental.loops.forLoop;

public class BasicsOfForLoop {
    public static void main(String[] args) {
        // for loop demo
        for(int i = 0; i<200; i++){
            System.out.println(i);
        }
    }
}
