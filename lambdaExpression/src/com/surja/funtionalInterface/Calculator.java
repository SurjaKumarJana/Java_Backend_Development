package com.surja.funtionalInterface;

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



        CalculateValue result;
        switch (choice){
            case 1:
                result = new CalculateValue() {
                    // this are anonymous class
                    @Override
                    public int calculate(int a, int b) {
                        return a+b;
                    }
                };
                System.out.println("Result : "+ result.calculate(a,b));
                break;
            case 2:
                result = new CalculateValue() {
                    // this are anonymous class
                    @Override
                    public int calculate(int a, int b) {
                        return a-b;
                    }
                };
                System.out.println("Result : "+ result.calculate(a,b));
                break;

            case 3:
                result = new CalculateValue() {
                    // this are anonymous class
                    @Override
                    public int calculate(int a, int b) {
                        return a*b;
                    }
                };
                System.out.println("Result : "+ result.calculate(a,b));
                break;
            case 4:
                result = new CalculateValue() {
                    // this are anonymous class
                    @Override
                    public int calculate(int a, int b) {
                        return a/b;
                    }
                };
                System.out.println("Result : "+ result.calculate(a,b));
                break;
            default:
                System.out.println("Invalid input...");


        }

    }
}
