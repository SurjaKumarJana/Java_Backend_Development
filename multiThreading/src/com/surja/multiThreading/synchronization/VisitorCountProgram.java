// suppose we are creating a feature that counts the number of visitors
// in a mall , this mall have four gate ,all of them are open
// if we use multi Threading to count all of them
// a problem can arrive , when a thread is accessing the count variable
// other can also try to access it

// this can leads to a error in counting

// to solve this we can use
//1. synchronization keyword
//2. automicNumber
//3. locking mechanism

package com.surja.multiThreading.synchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class VisitorCountProgram {
    public static void main(String[] args) {

        ExecutorService  executorService = Executors.newFixedThreadPool(4);
        CountTask countTask = new CountTask();

        int visitors =1000;
        for(int i =0; i<visitors;i++){
            executorService.submit(countTask);
        }

        executorService.shutdown();

        try {
            executorService.awaitTermination(4, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Total visitors ; "+countTask.getcounter());
        System.out.println("Done !");


    }
}
