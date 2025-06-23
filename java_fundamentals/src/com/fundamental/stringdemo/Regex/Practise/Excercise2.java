
// take three input check first one is binary or not
// second one is hexadecimal and third one is date and the formate is [dd]/[mm]/[yyyy]



package com.fundamental.stringdemo.Regex.Practise;

import java.util.Scanner;



public class Excercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        String bNum = sc.nextLine();
        System.out.print("Enter the hexadecimal Number :");
        String hexNum =sc.nextLine();
        System.out.print("Enter the date :");
        String date =sc.nextLine();

        if(bNum.matches("[01]*")){
            System.out.println("Yeah , it's a binary number");
        }
        else{
            System.out.println("Not a binary number");
        }

        if(hexNum.matches("[0-9A-F]*")){
            System.out.println("Yeah , it's a hexadecimal number");
        }
        else{
            System.out.println("Not a hexadecimal number");
        }

        if(date.matches("[\\d]{2}/[\\d]{2}/[\\d]{4}")){
            System.out.println("Yeah , it's a valid date");
        }
        else{
            System.out.println("Not a valid date ");
        }

    }


    
}
