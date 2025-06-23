/*
You are given a number k and a array numbers that contains integers.
You need to return array of numbers that are less than k.
 */

package com.fundamental.arrayDemo.array1D.practice;

public class FindLessValues {

    public static void main(String[] args) {

    }

    // my approach
    public static int[] lessThan(int[] numbers, int k) {

        int count =0;

        for(int i =0 ; i<numbers.length ; i++){
            if(numbers[i] < k){
                count++;
            }
        }

        int[] ans = new int[count];
        int index =0;
        for(int i =0;i<numbers.length; i++){
            if(numbers[i] < k){
                ans[index++]= numbers[i];
            }

        }

        return ans;
    }
}
