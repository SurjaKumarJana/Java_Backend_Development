package com.surja.generics;

import java.util.ArrayList;
import java.util.List;

// this is a generic class
public class TypeSafeBox<T> {
    //dummy class
    List<T> items = new ArrayList<>();//in this box we can put any thing

    public  void put(T obj){
        items.add(obj);
    }

    public  void show(){
        System.out.println(items);
    }
}
