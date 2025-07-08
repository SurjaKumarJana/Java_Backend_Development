package com.surja.multiThreading.synchronization;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CountTask implements Runnable{

    //method 1;
    /*
    private int count ;

    synchronized private void incrementCount(){
        count++;
    }

    public int getcounter(){
        return count;
    }

    @Override
    public void run() {
        incrementCount();
    }
    */

    //method 2:
    /*
    private AtomicInteger count = new AtomicInteger();

    public void incrementCount(){
        // we can have lines that can't need synchronization
        count.incrementAndGet();// this part is only Synchronize
        // we can have lines that can't need synchronization
    }

    public int getcounter(){
        return count.get();
    }

    @Override
    public void run() {
        incrementCount();
    }
     */
    //method 3:
    private int count ;

    private Lock lock = new ReentrantLock();
    public void incrementCount(){
        lock.lock();
        count++;
        lock.unlock();
    }

    public int getcounter(){
        return count;
    }

    @Override
    synchronized public void run() {
        incrementCount();
    }


}
