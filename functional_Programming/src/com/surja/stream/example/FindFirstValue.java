/*
in this program we will print he first odd value after the given number
 */

package com.surja.stream.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class FindFirstValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int value = sc.nextInt();
        sc.close();

        Stream.iterate(value+1,x->x+1)
                .filter(x->x%2!=0)
                .limit(1)
                .forEach(System.out::println);
    }
}
