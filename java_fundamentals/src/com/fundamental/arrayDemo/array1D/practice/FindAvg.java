/*
You are given an array arr[] that contains integers. You need to return average of the non negative integers
in double format.

Examples:

Input: arr[] = [-12, 8, -7, 6, 12, -9, 14]
Output: 10.0
Explanation: The positive numbers are 8 6 12 14. The sum is 8+6+12+14 = 40, Average = 40/4 = 10.0
 */

package com.fundamental.arrayDemo.array1D.practice;

public class FindAvg {
    public static void main(String[] args) {

    }
    public static double posAverage(int[] arr) {
        // Code here
        double sum =0;
        int count=0;
        for(int i =0 ; i<arr.length; i++){
            if(arr[i]>=0){
                sum += arr[i];
                count++;
            }
        }

        if(count == 0 ){
            return 0.0;
        }
        return (double)sum/count;
    }
}
