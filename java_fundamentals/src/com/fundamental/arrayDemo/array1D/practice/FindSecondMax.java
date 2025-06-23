package com.fundamental.arrayDemo.array1D.practice;
// take input of array elements and show the second largest element

import java.util.Scanner;

public class FindSecondMax {
    public static void main(String[] args) {

        //taking input
        Scanner sc = new Scanner(System.in);        
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

        //searching for the second maximum value
        int max1 =arr[0],max2=max1;
        for(int x:arr){
            if(x>max1){
                max2=max1;
                max1 =x;
            }
            else if(x>max2){
                max2 =x;
            }
        }

        // displaying the result
        System.out.println("The second maximun value is :"+max2);
    }
    
}
