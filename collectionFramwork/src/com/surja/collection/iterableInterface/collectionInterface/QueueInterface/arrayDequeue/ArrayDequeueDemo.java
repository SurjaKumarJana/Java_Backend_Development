
/*
 * in this program we will se how to use the ArrayDequeue class in java
 * the working of it is done by array but it implements dequeue interface
 * it supports both side insertion and declaration
 *
 */
package com.surja.collection.iterableInterface.collectionInterface.QueueInterface.arrayDequeue;

import java.util.ArrayDeque;

public class ArrayDequeueDemo{
    public static void main(String[] args) {
        // now we will create an object of ArrayDequeue class and use it as queue and stack also
        //creating an object of ArrayDequeue class
        ArrayDeque<Integer> nums = new ArrayDeque<>();

        // using it as an queue
        nums.addLast(10);
        nums.addLast(20);
        nums.addLast(30);
        nums.addLast(40);
        nums.addLast(50);
        nums.removeFirst();
        System.out.println(nums);

        //using it as an stack
        nums.addLast(60);
        nums.addLast(70);
        nums.addLast(80);
        nums.removeLast();
        System.out.println(nums);
    }
}