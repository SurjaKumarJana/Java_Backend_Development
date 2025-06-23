/*
You are given an array arr[] that contains integers. You need to return the length of the array.
 */

package com.fundamental.arrayDemo.array1D.practice;

public class FindLength {
    public static void main(String[] args) {
        int[] arr ={1,3,4,55,6,43,2,66};
        System.out.println(arrayLength(arr));

    }

    public static int arrayLength(int[] arr) {

        return arr.length;
    }
}
