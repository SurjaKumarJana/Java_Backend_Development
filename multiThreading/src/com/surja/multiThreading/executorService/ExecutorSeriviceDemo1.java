package com.surja.multiThreading.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ExecutorSeriviceDemo1 {
    public static void main(String[] args) {

        // creating a ExecutorService object
        ExecutorService executorService = Executors.newFixedThreadPool(3);// this the number of threads

        Runnable task1 = () -> {
            System.out.println("This is task-01 , done by : " + Thread.currentThread().getName());
        };
        Runnable task2 = () -> {
            System.out.println("This is task-02 , done by : " + Thread.currentThread().getName());
        };

        executorService.submit(task1);
        executorService.submit(task2);

        // shuting down the executor service
        executorService.shutdown();
    }
}
