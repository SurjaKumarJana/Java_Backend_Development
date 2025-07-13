/*
The Iterable interface is the root of the collection hierarchy.
It provides an iterator() method to iterate through collections.
Since Collection extends Iterable, all collection classes support iteration.

    iterator(): Returns an iterator to traverse the elements.
    Iterator iterator();

    forEach(action): Performs the given action for each element of the collection.
 */


package com.surja.collection.iterableInterface;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class InterableInterfaceDemo {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.addAll(List.of(1,2,3,4,5,6,7,8,9));


        Iterator<Integer> it = list.iterator();
        /*
            -------------------------------------------
            Relationship Between Iterable and Iterator
            -------------------------------------------
                    Iterable provides the iterator() method
                    That method returns an object of a class that implements Iterator
                    So: Iterable depends on Iterator
         */

        list.forEach((x) ->{
            System.out.print(x*10 +" ");
        });
        System.out.println();// extra line

        // .hasNext() & .next() methods
//        while(it.hasNext()){
//            System.out.print(it.next()+" ");
//        }
//        System.out.println( );// extra line



        //removing the even numbers
        // Checks for the next element to the it
        while(it.hasNext()) {
            // Returns the next element to Iterator
            // Moves the iterator to next position
            int x = (Integer)it.next();

            // Check whether x is even or not
            if(x % 2 == 0){
                // Removes the element just before the it
                it.remove();

            }
        }

        list.forEach(x ->
                System.out.print(x+" ")
        );


    }
}
