package com.surja.multiThreading.create.ThreadClass;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {

        //method 1.
        // creating new thread
        MyThread myThread = new MyThread();
        myThread.setName("Worker-01");

        // still now we don't have  a runnable thread
        // this run() method will be executed by the main thread
        myThread.run();

        // now this will make the new thread runnable
        // and depending the cpu priority it will be executed by the new thread
        myThread.start();

        System.out.println("1. main is still running ....");
        // when we call this method this will make the main thread in waiting state and
        // run the new thread
        myThread.join();

        System.out.println("2. main is still running ....");
        System.out.println("3. main is still running ....");
        System.out.println("4. main is still running ....");
        System.out.println("5. main is still running ....");
        System.out.println("6. main is still running ....");





        // method 2.

        MyThread myThread1 = new MyThread();

    }
}
