/*
The task is to find the sum of the array using streams.
 */

package com.surja.stream.example;


import java.util.Arrays;

public class SumOfElements {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};

        // it is a premitive type of array so we have to pass the reference to stream funciton
        int sum = Arrays.stream(arr)
                .sum();

        System.out.println(sum);

    }
}
