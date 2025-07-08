package com.surja.multiThreading.create.ThreadClass;

public class MyThread extends  Thread{

    public void run(){
        System.out.println("Hello is printed by : "+Thread.currentThread().getName());
    }
}
