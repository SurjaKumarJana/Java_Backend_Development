/*
iteration on a collection
1.using iterator()
2.using enhanced for() loop
3.using forEach()
4.using strem()
 */

package com.surja.collection.iterableInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteration {

    public static void main(String[] args) {
        List<String> companies  = new ArrayList<>();
        companies.addAll(List.of("Samsung", "Apple", "Lenovo", "Asus", "Dell", "HP"));

        // Method 1.
        Iterator<String> it = companies.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println("- - -- - -- - -- - -- - -- - -- - -- - -- - -");

        // Method 2
        for(String x : companies){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("- - -- - -- - -- - -- - -- - -- - -- - -- - -");

        // Method 3
        companies.forEach(x->
                System.out.print(x+" ")
        );
        System.out.println();
        System.out.println("- - -- - -- - -- - -- - -- - -- - -- - -- - -");

        // Method 4
        companies.stream().forEach(x->
                System.out.print(x+" ")
        );
        System.out.println();
        System.out.println("- - -- - -- - -- - -- - -- - -- - -- - -- - -");
    }
}
