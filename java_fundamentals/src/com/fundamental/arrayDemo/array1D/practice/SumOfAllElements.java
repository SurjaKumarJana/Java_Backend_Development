//take input of 7 array elements and print their sum
package com.fundamental.arrayDemo.array1D.practice;


import java.util.Scanner;

public class SumOfAllElements {
    public static void main(String[] args) {

        // input
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter the elements with space separated :");
        String elements = sc.nextLine();
        sc.close();

        // this will split them on the basis of space and return a array of strings 
        String[] data = elements.split(" ");
        

        int sum =0;
        
        for (String x: data){
            sum = sum + Integer.valueOf(x);
            //integer.valueof(String s) is method will convert the string value to an integer value

        }
        //displaying the result
        System.out.format("The sum of the elements is %d \n", sum);

    }
    
}
