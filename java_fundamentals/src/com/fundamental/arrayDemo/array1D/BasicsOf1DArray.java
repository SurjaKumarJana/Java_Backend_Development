/*
===============================================================================
One-Dimensional Arrays in Java
===============================================================================

What is a 1D Array:
    A one-dimensional array is a linear structure that stores elements of the same
    data type in a single row (linearly). It uses a single index to access elements.

Why Use 1D Arrays:
    - Efficient way to group and process multiple values of the same type.
    - Useful for storing sequences, lists, or collections of items.
    - Makes iteration, searching, and sorting easier.

-------------------------------------------------------------------------------
Declaration and Initialization
-------------------------------------------------------------------------------

    // Declaration with size (default values assigned)
    int[] numbers = new int[5];        // [0, 0, 0, 0, 0]

    // Declaration with initialization
    int[] scores = {10, 20, 30, 40};   // [10, 20, 30, 40]

    // Using a loop for input (example):
    Scanner sc = new Scanner(System.in);
    int[] inputArray = new int[3];
    for (int i = 0; i < inputArray.length; i++) {
        inputArray[i] = sc.nextInt();
    }

-------------------------------------------------------------------------------
Accessing and Modifying Elements
-------------------------------------------------------------------------------

int x = scores[2];                 // Access element at index 2 → 30
scores[0] = 99;                    // Modify first element → [99, 20, 30, 40]

-------------------------------------------------------------------------------
Array Length
-------------------------------------------------------------------------------

- Use arrayName.length to get the number of elements.
- It's a property, not a method (no parentheses).

Example:
int len = scores.length;          // len = 4

-------------------------------------------------------------------------------
Iterating Over a 1D Array
-------------------------------------------------------------------------------

// Traditional for loop
for (int i = 0; i < scores.length; i++) {
    System.out.println(scores[i]);
}

// Enhanced for loop (for-each)
for (int score : scores) {
    System.out.println(score);
}

-------------------------------------------------------------------------------
Default Values in 1D Arrays (when size is specified but not initialized)
-------------------------------------------------------------------------------

Data Type     Default Value
----------------------------
int           0
double        0.0
boolean       false
char          '\u0000'
Object        null

-------------------------------------------------------------------------------
Common Operations with java.util.Arrays
-------------------------------------------------------------------------------

import java.util.Arrays;

int[] data = {5, 1, 9, 3};

Arrays.sort(data);                      // Sorts array → [1, 3, 5, 9]
int index = Arrays.binarySearch(data, 5); // Searches for value 5
Arrays.fill(data, 0);                   // Sets all elements to 0
int[] copy = Arrays.copyOf(data, data.length); // Creates a copy

-------------------------------------------------------------------------------
Important Notes
-------------------------------------------------------------------------------

- Index starts from 0 and goes to array.length - 1.
- Accessing an invalid index throws ArrayIndexOutOfBoundsException.
- 1D arrays are fixed in size. Use ArrayList for resizable collections.
- Arrays can be of primitive or reference types (e.g., int[], String[]).
- Arrays are objects in Java and stored in heap memory.
*/

package com.fundamental.arrayDemo.array1D;

public class BasicsOf1DArray {
    public static void main(String[] args) {
        int[] arr = new int[10];//example of 1D array
    }
}
