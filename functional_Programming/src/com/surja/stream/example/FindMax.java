/*
find the max of a given list
 */

package com.surja.stream.example;

import java.util.Arrays;
import java.util.List;

public class FindMax {
    public static void main(String[] args) {

        int[] arr = {1,2,5,4564,25,65,52,36};
        int max = Arrays.stream(arr)
                .max()
                .getAsInt();
        int min = Arrays.stream(arr)
                .min()
                .getAsInt();
        System.out.println(max);
        System.out.println(min);

    }
}
