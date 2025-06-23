//input a gmail id and find whether it is on gmail or not and
// if it is on gmail then separate out user name and domain name

package com.fundamental.stringdemo.Regex.Practise;

import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Your Gmail id :");
        String gmail = sc.nextLine();
        
        if(gmail.matches("[\\w.]+@(.*)")){
            
            System.out.println("Yeah! it's a valid Gmail Id");

            if(gmail.matches("[\\w.]+@gmail(.*)")){
                System.out.println("Yeah! it's on gmail");
                String userName = gmail.substring(0,gmail.indexOf("@"));
                String domainName =gmail.substring(gmail.indexOf("@"));
                System.out.println("User   Name : "+ userName);
                System.out.println("Domain Name : "+ domainName);
    
            }
            else{
                System.out.println("Not not on gmail !");
            }


        }        
        else{
            System.out.println("Not a valid gmail Id !");
        }
        
    }
    
}
