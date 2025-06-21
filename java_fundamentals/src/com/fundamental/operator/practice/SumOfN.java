package com.fundamental.operator.practice;



import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        // taking input of how many numbers will be added
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number of Terms : ");
        int n = sc.nextInt();
        int sum =0;
        // method 1:
//        for(int i =1;i<=n;i++){
//            sum +=i;
//        }
        // method 2:
        sum = (n*(n+1))/2;
        System.out.println("Sum of "+n+" natural number is : "+sum);
    }
}
