
// take input of the array elements and search elements then search the element
package com.fundamental.arrayDemo.array1D.practice;


import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //taking input
        System.out.print("please enter the elements with space separated :");
        String elements = sc.nextLine();
        System.out.print("Enter the element to Search :");
        int a = sc.nextInt();
        sc.close();

        // this will split them on the basis of space and return a array of strings
        String[] data = elements.split(" ");
        int arr[] = new int[data.length];
        int  position=0;
        boolean result =false;

        for(int i=0;i<data.length; i++){
            arr[i]=Integer.valueOf(data[i]);
            //integer.valueof(String s) is method will convert the string value to an integer value
        }

        for(int i=0; i<arr.length; i++){
            position++;
            if(arr[i]==a){
                result = true;

                break;
            }
        }

        // displaying result
        if(result){
            System.out.format("Element %d found at %d position\n",a,position-1);
        }
        else{
            System.out.format("Element %d not found \n",a);
        }

        
    }
    
}
