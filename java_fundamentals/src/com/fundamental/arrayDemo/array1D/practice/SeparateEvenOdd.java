/*
You are given an array numbers that contains integers. You need to return one array of the same length,
first filled with even numbers and then by odd numbers.

Example 1:

Input:
numbers = [54, 43, 2, 5, 14, 17, 18, 19]
Output:
54 2 14 18 43 5 17 19
 */

package com.fundamental.arrayDemo.array1D.practice;

public class SeparateEvenOdd {
    public static void main(String[] args) {

    }

    public static int[] evenOdd(int[] numbers) {
        int[] ans = new int[numbers.length];
        int index =0;
        for(int i =0 ; i<numbers.length ; i++){
            if(numbers[i]%2 == 0){
                ans[index++] = numbers[i];
            }
        }

        for(int i =0 ; i<numbers.length ; i++){
            if(numbers[i]%2 != 0){
                ans[index++] = numbers[i];
            }
        }

        return ans;
    }
}