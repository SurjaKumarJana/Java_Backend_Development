// take input of array elements and find the maximun value in it

package com.fundamental.arrayDemo.array1D.practice;


import java.util.Scanner;

public class FindMaxInArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking input
        System.out.print("please enter the elements with space separated :");
        String elements = sc.nextLine();  
        sc.close();

        //converting the string into and integer array;
        String[] data = elements.split(" ");
        int arr[] = new int[data.length];
        
        for(int i=0;i<data.length; i++){
            arr[i]=Integer.valueOf(data[i]);
            //integer.valueof(String s) is method will convert the string value to an integer value
        }

        //searching for the maximum value
        int max =arr[0];
        for(int x:arr){
            if(x>max){
                max =x;
            }
        }

        // displaying the result
        System.out.println("The maximun value is :"+max);
    }
}
