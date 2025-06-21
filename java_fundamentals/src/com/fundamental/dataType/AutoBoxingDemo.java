/*
 * ============================================
 *         AUTOBOXING AND UNBOXING IN JAVA
 * ============================================
 *
 * WHAT IS AUTOBOXING?
 * --------------------------------------------
 * Autoboxing is the automatic conversion of a primitive data type
 * into its corresponding wrapper class by the Java compiler.
 *
 * Example:
 * int a = 10;
 * Integer obj = a;   // Autoboxing: int to Integer
 *
 * WHEN DOES AUTOBOXING HAPPEN?
 * --------------------------------------------
 * - When a primitive is assigned to a wrapper type variable
 * - When a primitive is passed to a method expecting a wrapper
 * - When adding a primitive to a collection (like ArrayList)
 *
 * Example:
 * ArrayList<Integer> list = new ArrayList<>();
 * list.add(5);  // Autoboxing: int 5 → Integer object
 *
 *
 * WHAT IS UNBOXING?
 * --------------------------------------------
 * Unboxing is the automatic conversion of a wrapper class object
 * back to its corresponding primitive data type.
 *
 * Example:
 * Integer obj = 20;
 * int b = obj;   // Unboxing: Integer to int
 *
 * WHEN DOES UNBOXING HAPPEN?
 * --------------------------------------------
 * - When a wrapper object is assigned to a primitive variable
 * - When a wrapper is used in a place that expects a primitive
 * - During arithmetic or logical operations with wrapper objects
 *
 * Example:
 * Integer x = 15, y = 10;
 * int sum = x + y;  // Unboxing both x and y to int, then adding
 *
 * BENEFITS:
 * --------------------------------------------
 * - Makes code cleaner and easier to read
 * - Reduces manual conversion code between primitives and wrappers
 *
 * NOTE:
 * --------------------------------------------
 * Autoboxing and Unboxing can lead to NullPointerException
 * if the wrapper object is null during unboxing.
 *
 * Example:
 * Integer obj = null;
 * int n = obj;  // Throws NullPointerException
 *
 */


package com.fundamental.dataType;

import java.util.ArrayList;

public class AutoBoxingDemo {
    public static void main(String[] args) {

        // Autoboxing
        int a = 134;
        Integer b = a;
        System.out.println(b);
        show(b);
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(a);
        System.out.println(myList);// displaying the list

        // Unboxing
        Integer obj = new Integer(122);
        int  c = obj;
        show(c);
        System.out.println(c+obj);


    }

    // method that is expecting an object
    public static void  show(Object obj){
        System.out.println(obj);
    }
    // this method is expecting a double type primitive value,
    public static void  show(double obj){
        System.out.println(obj);
    }
}
