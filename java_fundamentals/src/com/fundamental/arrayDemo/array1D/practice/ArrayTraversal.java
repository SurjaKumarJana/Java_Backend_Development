/*
You are given an array arr[] that contains integers.
 You need to print the elements of the array in a single line with a space between them.
Note: Don't add a new line at the end.
 */

package com.fundamental.arrayDemo.array1D.practice;

public class ArrayTraversal {

    public static void main(String[] args) {

    }

    public static void arrayTraversal(int[] arr) {

        for(int i =0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
    }
}
