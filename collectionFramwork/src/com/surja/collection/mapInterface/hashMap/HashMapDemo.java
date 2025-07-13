/*
    HashMap:
    --------
    When to Use:
    - When you need fast access using keys (constant-time performance).
    - When order of insertion is not important.
    - When null keys/values are acceptable.

    When NOT to Use:
    - When predictable iteration order is needed.
    - When keys must be sorted.

*/


package com.surja.collection.mapInterface.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        // in hashmap , insertion order is not maintained
        Map<Integer,String> pinCode = new HashMap<>();

        pinCode.put(700120,"kolkata");
        pinCode.put(700012,"DumDum");
        pinCode.put(700521,"Sonarpur");
        pinCode.put(700901,"KaliGhat");
        pinCode.put(700001,"Rubi");

        System.out.println(pinCode);//we can see that insertion order is n't maintained



    }
}
