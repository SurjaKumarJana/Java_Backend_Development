
/*
===============================================================================
Two-Dimensional Arrays in Java
===============================================================================

What is a 2D Array:
    A two-dimensional (2D) array in Java is an array of arrays. It is used to
    store data in a tabular form consisting of rows and columns. Each element
    is accessed using two indices: one for the row and one for the column.

Syntax:
dataType[][] arrayName = new dataType[rows][columns];

Why Use 2D Arrays:
- To represent matrix-like or tabular data (e.g., a chessboard, marksheet).
- Allows organization of data with two dimensions (e.g., grid-based problems).

-------------------------------------------------------------------------------
Declaration and Initialization
-------------------------------------------------------------------------------

// Declaration with size
int[][] matrix = new int[3][4];        // 3 rows, 4 columns (default values)

// Declaration with initialization
int[][] numbers = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Jagged Array (rows of unequal length)
int[][] jagged = new int[3][];
jagged[0] = new int[]{1, 2};
jagged[1] = new int[]{3, 4, 5};
jagged[2] = new int[]{6};

-------------------------------------------------------------------------------
Accessing and Modifying Elements
-------------------------------------------------------------------------------

matrix[0][1] = 10;       // Set value at row 0, column 1
int val = matrix[2][3];  // Get value at row 2, column 3

-------------------------------------------------------------------------------
Array Length
-------------------------------------------------------------------------------

- matrix.length gives number of rows.
- matrix[i].length gives number of columns in row i.

Example:
int rows = matrix.length;
int cols = matrix[0].length;

-------------------------------------------------------------------------------
Iterating Over a 2D Array
-------------------------------------------------------------------------------

// Using nested for loops
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}

// Using nested enhanced for loops
for (int[] row : matrix) {
    for (int element : row) {
        System.out.print(element + " ");
    }
    System.out.println();
}

-------------------------------------------------------------------------------
Default Values in 2D Arrays (when only size is defined)
-------------------------------------------------------------------------------

Data Type     Default Value
----------------------------
int           0
double        0.0
boolean       false
Object        null

-------------------------------------------------------------------------------
Important Notes
-------------------------------------------------------------------------------

- 2D arrays are arrays of arrays; rows can have different lengths (jagged arrays).
- Indexing starts at 0. Invalid access throws ArrayIndexOutOfBoundsException.
- 2D arrays are stored in heap memory as arrays of references.
- You can use java.util.Arrays.deepToString(array) to print 2D arrays.
- For flexible matrix operations, consider using nested ArrayLists.

Example (printing a 2D array):
System.out.println(Arrays.deepToString(matrix));
*/


package com.fundamental.arrayDemo.array2D;

public class BasicsOf2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[4][7];
    }
}
