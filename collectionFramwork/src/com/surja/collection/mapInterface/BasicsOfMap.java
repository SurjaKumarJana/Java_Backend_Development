/*
    When to Use Map Interface:
    --------------------------
    - When you need to store key-value pairs.
    - When each key must be unique.
    - When you want fast lookups based on a key.
    - When you need to maintain mappings like ID-to-Name, RollNo-to-Student, etc.
    - When you want to check presence of a key or get a value quickly.

    When NOT to Use Map Interface:
    ------------------------------
    - When order of elements is important (use List instead).
    - When duplicate keys are needed (Map doesn't allow duplicate keys).
    - When you're only working with single values (use Set or List).
    - When iteration of elements without key-value relation is required.
*/


package com.surja.collection.mapInterface;

import java.util.HashMap;
import java.util.Map;

public class BasicsOfMap {

    public static void main(String[] args) {

        //creatin a map
        Map<String ,Integer> map = new HashMap<>();
        // adding key, values
        map.put("Rahul", 1254);
        map.put("Avishek", 1254);
        map.put("Viki", 1254);
        map.put("Bijoy", 1254);
        map.put("John", 1254);

        System.out.println(map);//order is not maintained



    }
}
