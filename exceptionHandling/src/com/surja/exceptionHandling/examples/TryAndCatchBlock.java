
/*
in this program we will see the example of exception handling using the try and catch block

 */


package com.surja.exceptionHandling.examples;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryAndCatchBlock {
    public static void main(String[] args) {

        // try and catch block
        try{
            // this is unchecked exception
            Scanner sc  = new Scanner(System.in);
            System.out.print("Enter a interger : " );
            System.out.println(sc.nextInt());

            // this is an checked  exception
            FileInputStream fi=new FileInputStream("E:\\Java_Programs\\mytext.txt");


        }catch (InputMismatchException e){
            System.out.println(e);

        }catch (IOException e){
        System.out.println(e);
    }

    }
}
