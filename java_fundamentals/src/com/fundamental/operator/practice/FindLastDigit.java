package com.fundamental.operator.practice;

import java.util.Scanner;

public class FindLastDigit {
    public static void main(String[] args) {
        // taking input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        num = Math.abs(num);// if we don't take absolute value then for -ve values we get -3 modulous but
        // we want last digit only so we use absolute value(+ve value )
        int mod = num%10;
        System.out.println("The last digit is : "+mod);

    }
}
