package com.surja.lambda;

import com.surja.funtionalInterface.CalculateValue;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the number a :");
        int a = sc.nextInt();
        System.out.println("Enter the number b :");
        int b = sc.nextInt();
        System.out.println("1. addition \n"+"2. substraction \n"+"3. multiply \n"+"4. Division \n");
        System.out.println("Enter choice :" );
        int choice = sc.nextInt();
        sc.close();

        CalculateValue ca;


        switch (choice){
            case 1:
                ca =(x, y) -> x+y;

                System.out.println(ca.calculate(a,b));
                break;
            case 2:
                ca =(x, y) -> x-y;

                System.out.println(ca.calculate(a,b));
                break;

            case 3:
                ca =(x, y) -> x*y;

                System.out.println(ca.calculate(a,b));
                break;
            case 4:
                ca =(x, y) -> x/y;

                System.out.println(ca.calculate(a,b));
                break;
            default:
                System.out.println("Invalid input...");


        }

    }
}
