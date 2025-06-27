/*
the below program is a example of nested try and catch block
 */
package com.surja.exceptionHandling.examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryAndCatchDemo {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the divisior : ");
            int num = sc.nextInt();
            try{
                int value =45;
                System.out.println("Division result : "+value/num);
            }catch (ArithmeticException e){
                System.out.println("Zero cann't be entered...");
            }
        }catch (InputMismatchException e ){
            System.out.println("Only integer value is allowed ! ");
        }
    }

}
