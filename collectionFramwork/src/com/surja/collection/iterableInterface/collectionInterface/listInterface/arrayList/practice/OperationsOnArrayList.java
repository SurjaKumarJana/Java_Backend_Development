
/*
In this question we will be implementing q number operations on ArrayList. There will be different type of queries.
A query can be of five types:
1. a x (Adds an element x to the ArrayList A at the end)
2. b (Sorts the ArrayList A in ascending order)
3. c (Reverses the ArrayList A)
4. d (prints the size of the ArrayList)
5. e (Sorts the ArrayList A in descending order)
6. f  (prints space separated values of the ArrayList)
 */
package com.surja.collection.iterableInterface.collectionInterface.listInterface.arrayList.practice;

import java.util.ArrayList;
import java.util.Collections;

public class OperationsOnArrayList {

    public static void main(String[] args) {

    }

    public static void add_to_ArrayList(ArrayList<Integer> A, int x) {
        A.add(x);
    }

    public static void sort_ArrayList_Asc(ArrayList<Integer> A) {
        Collections.sort(A);
    }


    public static void reverse_ArrayList(ArrayList<Integer> A) {
        Collections.reverse(A);
    }


    public static int size_Of_ArrayList(ArrayList<Integer> A) {
        return A.size();
    }

    public static void sort_ArrayList_Desc(ArrayList<Integer> A) {
        Collections.sort(A, Collections.reverseOrder());
    }

    public static void print_ArrayList(ArrayList<Integer> A) {
        A.forEach(x ->
                System.out.print(x+" ")
        );
    }
}
