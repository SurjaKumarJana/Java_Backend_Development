
/*
 * =============================================
 *               DO-WHILE LOOP IN JAVA
 * =============================================
 *
 * -> The `do-while` loop is used to execute a block of code at least once,
 *    even if the condition is false.
 *
 * -> Syntax:
 *    do {
 *        // code to run
 *    } while (condition);
 *
 * -> Example:
 *    int i = 1;
 *    do {
 *        System.out.println(i);
 *        i++;
 *    } while (i <= 5);
 *
 * -> Output: 1 2 3 4 5
 *
 *
 * KEY POINTS:
 * ---------------------------------------------
 * -> Code inside the loop executes first.
 * -> Condition is checked after the first run.
 * -> Runs at least once, even if condition is false initially.
 *
 */

package com.fundamental.loops.doWhile;

public class BasicsOfDoWhile {
    public static void main(String[] args) {
        int i =0;
        // dowhile loop
        do{
            System.out.println(i++);
        }while (i<200);
    }
}
