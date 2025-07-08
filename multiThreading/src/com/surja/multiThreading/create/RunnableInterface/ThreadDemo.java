package com.surja.multiThreading.create.RunnableInterface;


public class ThreadDemo {
    public static void main(String[] args) {
        // creating new task
        MyTask myTask = new MyTask();

        // we are assinging this myTask to the new Thread
        Thread thread = new Thread(myTask);
        thread.setName("Worker-01");

        // still now we don't have any runnable thread
        // so this will be executed by main thread
        thread.run();

        // now we have a runnable thread so this will be executed in worker-01
        thread.start();




        //method 2.
        Runnable run  = () -> System.out.println("Hello is printed by : "+Thread.currentThread().getName());
        thread = new Thread(run);
        thread.setName("Worker-02");
        thread.start();

    }
}
