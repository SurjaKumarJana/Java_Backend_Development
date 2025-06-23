/*
Given an array arr[], check whether it is sorted in non-decreasing order. Return true if it is sorted otherwise false.

Examples:

Input: arr[] = [10, 20, 30, 40, 50]
Output: true
Explanation: The given array is sorted.
 */


package com.fundamental.arrayDemo.array1D.practice;

public class CheckSorting {

    public static void main(String[] args) {

    }

    public boolean arraySortedOrNot(int[] arr) {

        boolean isSort =true;

        for(int i =1 ; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                isSort = false;
                return isSort;
            }
        }

        return isSort;
    }
}
