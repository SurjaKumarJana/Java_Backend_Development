package com.fundamental.inputOutput;


import java.util.Scanner;

public class HasNextDemo {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);


        int sum = 0, count = 0;


        while (sc.hasNextInt()) {

            int num = sc.nextInt();
            sum += num;
            count++;
        }
        float mean = (float) sum /count;
        System.out.println("Mean: " + mean);
    }
}
