

/*
 * in this program we will see an example of PriorityQueue
 * we will add element and the delete the element and then we will create our own comparator that we use to change the
 * heap priority
 *
 */

package com.surja.collection.iterableInterface.collectionInterface.QueueInterface.priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

 class MyComparator implements Comparator<Integer>{
    public int compare(Integer o1, Integer o2){
        if((int)o1>(int)o2){return 1;}
        else if((int)o2>(int)o1){return -1;}
        else {return 0;}
    }
 }
public class BasicsOfPriorityQueue{
    public static void main(String[] args) {
    
        // as the smallest element gets the highest priority it is mean heap
        // creating and object of PriorityQueue
        PriorityQueue<Integer> p = new PriorityQueue<Integer>();
        // adding element in the priority queue using offer method --> befinite of this method is that is doesn't throw exception 
        p.offer(10);
        p.offer(5);
        p.offer(2);
        p.offer(8);
        p.offer(3);
        
        // displaying the object using a foreach loop with lambda expression
        System.out.println("Displaying the PriorityQueue before Deletation .... ");
        p.forEach((x)->System.out.print(x+" "));
        System.out.println();// adding extra line
        //deletation
        p.poll();
        // displaying after deletation
        System.out.println("Displaying the PriorityQueue after Deletation .... ");
        p.forEach((x)->System.out.print(x+" "));
        System.out.println();// adding extra line

        // after changing the priority of heap
        // if the highest value element get most priority then that heep is called max heap
        // use max heap we have to override the compare method 
        // and we have to pass object of this new comparator class to the PriorityQueue
        PriorityQueue<Integer> p2 = new PriorityQueue<>(new MyComparator());
        p2.offer(10);
        p2.offer(5);
        p2.offer(2);
        p2.offer(8);
        p2.offer(3);
        
        // displaying the object using a foreach loop with lambda expression
        System.out.println("Displaying the PriorityQueue before Deletation .... ");
        p2.forEach((x)->System.out.print(x+" "));
        System.out.println();// adding extra line
        //deletation
        p2.poll();
        // displaying after deletation
        System.out.println("Displaying the PriorityQueue after Deletation .... ");
        p2.forEach((x)->System.out.print(x+" "));
        System.out.println();// adding extra line

    }
}