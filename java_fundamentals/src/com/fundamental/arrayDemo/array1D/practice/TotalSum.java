/*
You are given an array that contains integers. You need to return the sum of all array elements.

Examples:

Input: arr[] = [54, 43, 2, 1, 5]
Output: 105
Explanation: Just sum it 54+43+2+1+5=105.
 */


package com.fundamental.arrayDemo.array1D.practice;

public class TotalSum {
    public static void main(String[] args) {

    }

    public static int arraySum(int[] arr) {
        // code here
        int sum =0;
        for(int i =0; i<arr.length ; i++){
            sum += arr[i];
        }

        return sum;
    }
}