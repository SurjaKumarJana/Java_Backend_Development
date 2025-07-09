/*
 * in this program we will see how to write an object an ArrayList means how to use the class ArrayList and also
 * use various method of it
 *
 */

package com.surja.collection.iterableInterface.collectionInterface.listInterface.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        
        ArrayList<Integer> a = new ArrayList<>(20);// this is the initial capacity it can be increase with time
        ArrayList<Integer> b = new ArrayList<>(List.of(1,2,3,4,5,6,7));
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        a.add(60);

        // displaying the list
        for (Integer x:a) {
            System.out.print(x+" ");
        }
        System.out.println();//line break
        System.out.println("----------------------------------------");
    
        a.addAll(b);
        // displaying the list
        for (Integer x:a) {
            System.out.print(x+" ");
        }
        System.out.println();//line break
        System.out.println("----------------------------------------");


        // checking for element
        System.out.println(a.contains(20));
        System.out.println("----------------------------------------");
        a.set(5, 846464);
        // displaying the list
        for (Integer x:a) {
            System.out.print(x+" ");
        }
        System.out.println();//line break
        System.out.println("----------------------------------------");
    }

}
