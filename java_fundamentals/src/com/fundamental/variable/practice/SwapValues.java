// in this program we are trying to swap two user given numbers

package com.fundamental.variable.practice;

import java.util.Scanner;

public class SwapValues {
    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking the input
        System.out.print("Enter the number 1 :");
        int a = sc.nextInt();
        System.out.print("Enter the number 2 :");
        int b = sc.nextInt();

        //method 1 : swaping using third variable
        int c = a ;
        a = b;
        b =c;
        c =0;
        System.out.println(" a : "+a+" , b : "+ b +" , c : "+c);

        //method 2 : swaping with out using third variable
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(" a : "+a+" , b : "+ b );

        //method 3 : bitwise manupulation
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(" a : "+a+" b : "+ b );

    }
}
