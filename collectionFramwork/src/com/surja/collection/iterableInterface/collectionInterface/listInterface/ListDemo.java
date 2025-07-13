package com.surja.collection.iterableInterface.collectionInterface.listInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        /*
        in this program we will implement the List interface
         */
        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(10);
        integers.add(40);
        System.out.println(integers);


        List<String> stringList = new LinkedList<>();
        stringList.add("abc");
        stringList.addAll(List.of("def", "xyz", "asd"));
        System.out.println(stringList);





    }
}
