package com.surja.multiThreading.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo3 {

    public static void main(String[] args) {

        //implementing new ExecutorService
        int corePoolSize = 5; //the number of threads to keep in the pool, even if they are idle
        int maxPoolSize = 10; // the maximum number of threads to allow in the pool
        long keepAliveTime = 2000; //when the number of threads is greater than the core,
        // this is the maximum time that excess idle threads will wait for new tasks before terminating.
        ExecutorService executorService = new ThreadPoolExecutor(
                corePoolSize,
                maxPoolSize,
                keepAliveTime,
                TimeUnit.MICROSECONDS,
                new LinkedBlockingQueue<Runnable>(200)//queue size
        );

        /*
        -------------------------------------------------------------------------------------------
        this below code can throw RejectedExecutionException
        when this exception occur?
            when we have a queue size that is not capable in storing the requests
            then this executorService can reject the new submit request by throwing an exception

            in this case after the exception main thread will be terminated but the application
            remain running as this code is unable to execute this line
                    //closing the ExecutorService
                    executorService.shutdown();

             as it is an runtime execution compiler will not force to handle it

        -------------------------------------------------------------------------------------------
        //submitting tasks
        int totalTask=100;
        for(int i =0; i<totalTask; i++){
            executorService.submit(task);
        }

         */
        // optimized way
        long start = System.currentTimeMillis();

        try {
            //submitting tasks
            int totalTask = 1000;// the load is high so the poolSize will me the maxPoolSize
            for (int i = 1; i <= totalTask; i++) {
                int taskNo = i;
                executorService.submit(
                        () -> {
                            System.out.println(taskNo + ". Task done by : " + Thread.currentThread().getName());
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                System.out.println("Rejected...");
                            }

                        });

            }
        } catch (RuntimeException e) {
            System.out.println(e);
        }

        /*
        let's see the keepAlive Time importance
         */
        try {
            Thread.sleep(6000);// waiting to reduce the load 6000>keepAliveTime
            //submitting new task with less load
            // we can see that to Thread pool Size reduced to corePoolSize
            int totalTask = 6;
            for (int i = 1; i <= totalTask; i++) {
                int taskNo = i;
                executorService.submit(
                        () -> {
                            System.out.println(taskNo + ". New Task done by : " + Thread.currentThread().getName());
                        }
                );
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }



        //closing the ExecutorService
        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long end = System.currentTimeMillis();
        System.out.println("Time Taken : " + (end - start) + " second");


    }
}
