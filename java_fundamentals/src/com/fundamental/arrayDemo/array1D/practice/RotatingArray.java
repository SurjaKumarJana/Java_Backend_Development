

//take input of array elements and rotate the array for user given times

package com.fundamental.arrayDemo.array1D.practice;

import java.util.Scanner;

public class RotatingArray {
    public static void main(String[] args) {
        
        //taking input
        Scanner sc = new Scanner(System.in);        
        System.out.print("please enter the elements with space separated :");
        String elements = sc.nextLine(); 
        System.out.print("How many position do you want to rotate :");
        int n =sc.nextInt(); 
        sc.close();

        //converting the string into and integer array;
        String[] data = elements.split(" ");
        int arr[] = new int[data.length];        
        for(int i=0;i<data.length; i++){
            arr[i]=Integer.valueOf(data[i]);
            //integer.valueof(String s) is method will convert the string value to an integer value
        }

        //coping elements of arr to an new array as we don't want any change to the main array
        int result[] =new int[arr.length];

        for(int i=0; i<arr.length;i++){
            result[i]=arr[i];
        }

        //changing the position of array elements
        int temp;       

        for(int i=0; i<n;i++){
            temp =result[0];
            for(int j=0; j<arr.length-1;j++){
                
                result[j]=result[j+1];
            }
            result[result.length-1]=temp;

        }


        //displaying result
        System.out.print("      Initial array    :");
        for(int x: arr){
            System.out.print(x+" ");
        }
        System.out.println();//adding blank line

        System.out.print("After rotating "+n+" times :");
        
        for(int x: result){
            System.out.print(x+" ");
        }
        System.out.println();//adding blank line
    }
    
}
