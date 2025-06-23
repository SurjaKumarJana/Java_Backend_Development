package com.fundamental.stringdemo.Regex.Practise;


import java.util.Scanner;

public class CheckingGmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Your Gmail :");
        String gmail = sc.nextLine();

        if(gmail.matches("[\\w.]+@gmail(.*)")){
            //the regex will contain digit and alphabets for any number of times then @gmail then any thing like .com, .in for any number of times
            System.out.println("Yeah, it's a valid gmail ");
        }
        else{
            System.out.println("Not a valid gmail id");
        }

    }
    
}
