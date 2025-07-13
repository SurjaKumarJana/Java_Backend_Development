package com.surja.generics;

import java.util.ArrayList;
import java.util.List;

public class Box {
    //dummy class
    List<Object> items = new ArrayList<>();//in this box we can put any thing

    public  void put(Object obj){
        items.add(obj);
    }

    // this is a generic method
    public  <T extends Number> void putSpecific (T t){
        items.add(t);
    }

    public  void show(){
        System.out.println(items);
    }
}
