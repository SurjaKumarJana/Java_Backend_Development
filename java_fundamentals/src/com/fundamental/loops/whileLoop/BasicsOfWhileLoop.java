/*
 * =============================================
 *                 WHILE LOOP IN JAVA
 * =============================================
 *
 * -> The `while` loop is used when the number of iterations is unknown,
 *    and you want to repeat code as long as the condition is true.
 *
 * -> Syntax:
 *    while (condition) {
 *        // code to run
 *    }
 *
 * -> Example:
 *    int i = 1;
 *    while (i <= 5) {
 *        System.out.println(i);
 *        i++;
 *    }
 *
 * -> Output: 1 2 3 4 5
 *
 *
 * KEY POINTS:
 * ---------------------------------------------
 * -> Condition is checked before loop body.
 * -> If condition is false at first, loop may not run at all.
 * -> Best when you don't know in advance how many times to loop.
 *
 */

package com.fundamental.loops.whileLoop;

public class BasicsOfWhileLoop {
    public static void main(String[] args) {
        //while loop demo
        int i =0;
        while(i<100){
            System.out.println(i++);
        }
    }
}
