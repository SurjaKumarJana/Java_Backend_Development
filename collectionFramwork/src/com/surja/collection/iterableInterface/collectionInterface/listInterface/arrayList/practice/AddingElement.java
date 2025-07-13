/*
Given an array arr[] containing integers.
The task is to insert elements of given array to an ArrayList and return that ArrayList.
 */

package com.surja.collection.iterableInterface.collectionInterface.listInterface.arrayList.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class AddingElement {
    public static ArrayList<Integer> fillArrayList(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int x : arr) {
            result.add(x);
        }

        return result;
    }

}