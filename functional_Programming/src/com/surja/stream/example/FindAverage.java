package com.surja.stream.example;

import java.util.Arrays;

public class FindAverage {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};


        double avg = Arrays.stream(arr)
                .average()
                .getAsDouble();
        //if our list is empty then this average method will return NULL that can't be stored as double
        // so we have to use this funtion as it will return double if it is possible

        System.out.println(avg);
    }
}
