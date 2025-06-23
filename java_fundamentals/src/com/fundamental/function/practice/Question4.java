/*
Given a number n, find the first digit of the number.

Examples:

Input: n = 123
Output: 1
 */

package com.fundamental.function.practice;

public class Question4 {
    public static void main(String[] args) {
        //this is my main function
        System.out.println("The first digit of 999 is : "+firstDigit(999));
    }

    public static int firstDigit(int n) {

        while(n>=10){
            n =n/10;
        }
        return n;

        //logic is this
        /*
        if we continuously divid the number by 10 , the at the end we get a number that is less than 10
        it is the first digit
        like,
        step 1.
            num =999/10;
        step 2.
            now the number is 99 , and it is greated then 10 so we repeat the process
            num = 99/10;
         step 3.
            now it becomes 9 that is less than 10 so stop the process
            and return 9
         */
    }
}
