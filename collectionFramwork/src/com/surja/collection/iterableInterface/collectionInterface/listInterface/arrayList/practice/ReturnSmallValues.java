package com.surja.collection.iterableInterface.collectionInterface.listInterface.arrayList.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReturnSmallValues {

    public static void main(String[] args) {

        //creating a list
        List<Integer> list = new ArrayList<>();
        list.addAll(List.of(2,46,8,5,7,9,101,75,2,46,8,5,7,102,4,3,56,1,756,1,75,2,46,8,5,7,9,10));

        //this list contains all the small values
        long start = System.currentTimeMillis();
        List<Integer> smallItems = getSmall(list,10);
        System.out.println(smallItems);

        long end = System.currentTimeMillis();
        System.out.println("Time taken : "+(end - start));
    }
//time complexity is O(n)
    static List<Integer> getSmall(List<Integer> list, int k){
        List<Integer> result = new ArrayList<>();
        for(Integer x : list){
            if(x<k){
                result.add(x);
            }
        }
        return  result;


    }
}
