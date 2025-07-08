package com.surja.multiThreading.create.RunnableInterface;

public class MyTask implements Runnable {

    // by implementing the Runnable interface
    // we can create a task or work
    // but we can not create a new thread
    // we still need a new thread to run this task

    public void run(){
        System.out.println("Hello is printed by ... : "+Thread.currentThread().getName());
    }

}
