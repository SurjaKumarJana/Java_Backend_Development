

/*
 * HashSet class implements the set interface and it works using the hashing techniques
 * as it implements the set interface the values can't be present in this set more than one time
 * let's see how the numbers are stored in the hashset and explore this class
 *
 */

package com.surja.collection.iterableInterface.collectionInterface.setInterface.hashSet;

import java.util.HashSet;
public class BasicsOfHashSet {
   public static void main(String[] args) {
    HashSet<Integer> hs = new HashSet<>();

    hs.add(10);
    hs.add(20);
    hs.add(4);
    hs.add(2);
    hs.add(10);

    // displaying the HashSet
    System.out.print("HashSet ==> ");
    System.out.println(hs);
   } 
}
