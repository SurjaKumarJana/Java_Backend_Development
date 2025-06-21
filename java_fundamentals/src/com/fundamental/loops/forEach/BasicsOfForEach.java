/*
 * =============================================
 *             FOR-EACH LOOP IN JAVA
 * =============================================
 *
 * -> The `for-each` loop is used to iterate over arrays or collections.
 * -> It is also called the enhanced for loop.
 *
 * -> Syntax:
 *    for (type variable : arrayOrCollection) {
 *        // use variable
 *    }
 *
 * -> Example:
 *    int[] numbers = {1, 2, 3, 4, 5};
 *    for (int num : numbers) {
 *        System.out.println(num);
 *    }
 *
 * -> Output: 1 2 3 4 5
 *
 *
 * KEY POINTS:
 * ---------------------------------------------
 * -> Automatically iterates through all elements
 * -> Easy to use, but cannot modify index directly
 * -> Best for reading elements from arrays/lists
 *
 */

package com.fundamental.loops.forEach;

public class BasicsOfForEach {
    public static void main(String[] args) {
        String[] company = {"Samsung", "Oppo", "Vivo", "Lava", "Sony","LG"};
        for (String x : company){
            System.out.println(x);

        }
    }
}
