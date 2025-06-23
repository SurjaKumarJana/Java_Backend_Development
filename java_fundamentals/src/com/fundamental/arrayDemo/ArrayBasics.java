/*
===============================================================================
Arrays in Java
===============================================================================

What is an Array:
    An array is a linear data structure used to store multiple values of the same
    data type in contiguous memory locations. Each element is accessed using an
    index starting from 0.

Why Use Arrays:
    - To manage a group of related data with a single variable.
    - Reduces the need for multiple individual variables.
    - Supports indexed access and easy iteration using loops.

Advantages:
    - Efficient access using index-based referencing.
    - Cleaner and more maintainable code.
    - Works well with loops and algorithms.

Disadvantages:
    - Fixed size (cannot be resized dynamically).
    - Insertion and deletion operations can be inefficient.
    - No built-in support for advanced operations (like search or insert in middle).

-------------------------------------------------------------------------------
Declaration and Initialization
-------------------------------------------------------------------------------

    int[] a = new int[5];               // Array of size 5, default values: 0
    int[] b = {1, 2, 3, 4, 5};          // Array with predefined values

    Accessing and Modifying Elements:
    int x = b[2];                       // Accessing 3rd element → 3
    b[1] = 100;                         // Updating 2nd element → [1, 100, 3, 4, 5]

-------------------------------------------------------------------------------
Iteration Techniques
-------------------------------------------------------------------------------

    // Traditional for loop:
    for (int i = 0; i < b.length; i++) {
        System.out.println(b[i]);
    }

    // Enhanced for loop:
    for (int val : b) {
        System.out.println(val);
    }

-------------------------------------------------------------------------------
Multidimensional Arrays
-------------------------------------------------------------------------------

    int[][] matrix = new int[2][3];     // 2 rows, 3 columns
    matrix[0][1] = 10;                  // Assign value to [0][1]

    int[][] grid = {
        {1, 2, 3},
        {4, 5, 6}
    };                                  // Declare and initialize

-------------------------------------------------------------------------------
Default Values for Array Elements
-------------------------------------------------------------------------------

    Data Type     Default Value
    ----------------------------
    int           0
    double        0.0
    boolean       false
    Object        null

-------------------------------------------------------------------------------
Common Operations using java.util.Arrays
-------------------------------------------------------------------------------

    import java.util.Arrays;

    int[] arr = {4, 2, 7, 1};

    Arrays.sort(arr);                        // Sort array → [1, 2, 4, 7]
    int index = Arrays.binarySearch(arr, 4); // Search for element
    Arrays.fill(arr, 0);                     // Fill array with 0s
    int[] copy = Arrays.copyOf(arr, arr.length); // Copy array

-------------------------------------------------------------------------------
Key Notes
-------------------------------------------------------------------------------

    - Arrays are objects in Java and stored in heap memory.
    - Accessing an out-of-bound index throws ArrayIndexOutOfBoundsException.
    - Array length is accessed using .length (not a method).
    - Arrays can store primitives or object references.
    - For dynamic sizing and more flexibility, use ArrayList.
*/



package com.fundamental.arrayDemo;

public class ArrayBasics {
    public static void main(String[] args) {
        String[] companies = {"Samsung", "Apple", "LG", "Nokia"};
    }

}
// let's see how it looks like in the memory
/*
===========================================================
      Java Memory Layout — String[] companies (Detailed)
===========================================================

               [ Call Stack ]
               ┌                            ┐
               │ Call Stack                 │
               │ ┌────────────────────────┐ │
               │ │ main() Stack Frame     │ │
               │ │                        │ │
               │ │ companies |            │ │
               │ └───────────|───────────── |
               │             |              │
               │             |              │
               └─────────────|──────────────│
          --------------------
          |
          |            [ Heap Memory ]
 ┌────────|────────────────────────────────────────────────────┐
 │  Addres|s: 0xA1                                             │
 │  Object|: String[4] (Array object)                          │
 │        ▼                                                    │
 │   ┌────────────┬────────────┬────────────┬────────────┐    │
 │   │  Index [0] │ Index [1]  │ Index [2]  │ Index [3]  │    │
 │   ├────────────┼────────────┼────────────┼────────────┤    │
 │   │   0xB1     │   0xB2     │   0xB3     │   0xB4     │    │
 │   └────┬───────┴────┬───────┴────┬───────┴────┬───────┘    │
 │        │             │             │             │         │
 │        ▼             ▼             ▼             ▼         │
 │    "samsung"     "apple"        "lg"         "nokia"       │
 │     (0xB1)        (0xB2)        (0xB3)         (0xB4)      │
 └────────────────────────────────────────────────────────────┘

===========================================================
Explanation:
- The **call stack** holds method frames; here, we only show `main()`.
- Inside `main()`, the variable `companies` holds a reference to 0xA1.
- At address `0xA1` in heap: a **String array** is allocated in contiguous
  memory to hold 4 references.
- Each slot (index [0] to [3]) stores a reference to a `String` object.
- The `String` objects ("samsung", etc.) live **elsewhere in the heap**.

Key Memory Behaviors:
- Arrays are always stored in the **heap**.
- Reference types (like `String`) are not stored in array slots directly;
  only **references** are stored.
- The `companies` variable points to the **start of the array (index 0)**.

===========================================================
*/

