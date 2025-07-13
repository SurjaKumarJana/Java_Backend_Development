/*
    TreeMap:
    --------
    When to Use:
    - When you need keys in sorted (natural or custom) order.
    - When range-based operations or navigation methods are required.

    When NOT to Use:
    - When you don’t need sorted keys (TreeMap is slower than HashMap).
    - When null keys are needed (TreeMap doesn't allow null keys).
*/


package com.surja.collection.mapInterface.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeHashMapDemo {

    public static void main(String[] args) {

        //this will map roll no to a student details
        Map<Integer,Student> classDetails = new TreeMap<>();

        //student obj
        Student s1 = new Student(11,"Rick","CSE");
        Student s2 = new Student(9,"Viki","CSE");
        Student s3 = new Student(1,"Suresh","CSE");
        Student s4 = new Student(23,"John","CSE");

        classDetails.put(s1.getRollNo(),s1);
        classDetails.put(s2.getRollNo(),s2);
        classDetails.put(s3.getRollNo(),s3);
        classDetails.put(s4.getRollNo(),s4);
        classDetails.put(s1.getRollNo(),s1);

        for(Integer x : classDetails.keySet()){
            System.out.println(classDetails.get(x));
        }


    }
}
