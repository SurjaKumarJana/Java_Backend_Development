
/*
You are given an array arr[] that contains integers.
You need to print the elements of the array with in reverse order with a in a single line with space between them.
Note: Don't print a new line at the end.
 */


package com.fundamental.arrayDemo.array1D.practice;

public class ArrayTraversalReverse {
    public static void main(String[] args) {

    }
    public static void arrayTraversalReverse(int[] arr) {

        for(int i = arr.length-1; i>=0;i--){
            System.out.print(" "+arr[i]);

        }

    }
}
