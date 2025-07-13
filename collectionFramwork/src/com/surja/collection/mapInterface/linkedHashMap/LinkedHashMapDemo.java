/*
    LinkedHashMap:
    --------------
    When to Use:
    - When you need insertion-order iteration.
    - When you want fast access with predictable ordering.
    - When caching (can be used for LRU Cache).

    When NOT to Use:
    - When memory overhead for maintaining order is a concern.
    - When sorting of keys is required.
*/


package com.surja.collection.mapInterface.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        // in hashmap , insertion order is not maintained
        Map<Integer,String> pinCode = new LinkedHashMap<>();

        pinCode.put(700120,"kolkata");
        pinCode.put(700012,"DumDum");
        pinCode.put(700521,"Sonarpur");
        pinCode.put(700901,"KaliGhat");
        pinCode.put(700001,"Rubi");

        System.out.println(pinCode);//we can see that insertion order is n't maintained



    }
}
