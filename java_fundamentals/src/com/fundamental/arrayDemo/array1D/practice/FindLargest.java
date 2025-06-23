/*
Given an array arr[]. The task is to find the largest element and return it.

Examples:

Input: arr[] = [1, 8, 7, 56, 90]
Output: 90
Explanation: The largest element of the given array is 90.
 */
package com.fundamental.arrayDemo.array1D.practice;

public class FindLargest {

    public static void main(String[] args) {

    }

    public static int largest(int[] arr) {
            // code here
            int ans = Integer.MIN_VALUE;
            for(int i =0 ;i <arr.length; i++){
                if(arr[i]>ans){
                    ans = arr[i];
                }
            }

            return ans;
    }
}

