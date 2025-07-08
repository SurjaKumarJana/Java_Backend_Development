package com.surja.multiThreading.executorService;

import java.util.concurrent.*;

public class ExecutorServiceDemo2 {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        // creating the task
        Runnable task =()-> {
            System.out.println("Task is completed by : "+Thread.currentThread().getName());
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        //without using the ExecutorService
        /*

        long start = System.currentTimeMillis();

        for(int i =0; i<1000; i++){
            Thread thread = new Thread(task);
            thread.start();
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }




        long end = System.currentTimeMillis();

        System.out.println("The process take time :" +(end -start)+"Seconds");

         */


        // with ExecutableService
        long start = System.currentTimeMillis();

        for(int i =0; i<1000; i++){
            executorService.submit(task);

        }

        executorService.shutdown();

        try {
            executorService.awaitTermination(4, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long end = System.currentTimeMillis();

        System.out.println("The process take time :" +(end -start)+"Seconds");


    }


}

