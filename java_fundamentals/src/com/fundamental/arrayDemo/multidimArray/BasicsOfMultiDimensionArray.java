/*
===============================================================================
Multidimensional Arrays in Java
===============================================================================

What is a Multidimensional Array:
    A multidimensional array in Java is essentially an array of arrays.
    The most commonly used form is the two-dimensional array (2D), but Java also
    supports arrays with more than two dimensions (3D, 4D, etc.).

Syntax:
dataType[][]...[] arrayName = new dataType[size1][size2]...[sizeN];

Use Cases:
- 2D: Matrix, tables, grid-based problems
- 3D: 3D graphics, layered data (e.g., multiple pages of a spreadsheet)
- Higher dimensions: Rare but possible in scientific computations or simulations

-------------------------------------------------------------------------------
Declaration and Initialization
-------------------------------------------------------------------------------

// 2D array (matrix of 3 rows, 4 columns)
int[][] matrix2D = new int[3][4];

// 3D array (2 blocks, 3 rows, 4 columns)
int[][][] matrix3D = new int[2][3][4];

// Initialization at declaration (2D)
int[][] initialized2D = {
    {1, 2, 3},
    {4, 5, 6}
};

// Initialization at declaration (3D)
int[][][] initialized3D = {
    {
        {1, 2}, {3, 4}
    },
    {
        {5, 6}, {7, 8}
    }
};

-------------------------------------------------------------------------------
Accessing and Modifying Elements
-------------------------------------------------------------------------------

// 2D example
matrix2D[1][2] = 10;
int val2D = matrix2D[1][2];

// 3D example
matrix3D[0][1][2] = 99;
int val3D = matrix3D[0][1][2];

-------------------------------------------------------------------------------
Array Length in Multidimensional Arrays
-------------------------------------------------------------------------------

// Length of outer array (first dimension)
int outer = matrix3D.length;

// Length of second dimension (rows in first block)
int rows = matrix3D[0].length;

// Length of third dimension (columns in first row of first block)
int cols = matrix3D[0][0].length;

-------------------------------------------------------------------------------
Iterating Over Multidimensional Arrays
-------------------------------------------------------------------------------

// Iterating a 2D array
for (int i = 0; i < matrix2D.length; i++) {
    for (int j = 0; j < matrix2D[i].length; j++) {
        System.out.print(matrix2D[i][j] + " ");
    }
    System.out.println();
}

// Iterating a 3D array
for (int i = 0; i < matrix3D.length; i++) {
    for (int j = 0; j < matrix3D[i].length; j++) {
        for (int k = 0; k < matrix3D[i][j].length; k++) {
            System.out.print(matrix3D[i][j][k] + " ");
        }
        System.out.println();
    }
    System.out.println("-----");
}

-------------------------------------------------------------------------------
Default Values
-------------------------------------------------------------------------------
// Just like 1D and 2D arrays, multidimensional arrays are initialized with:
// int       → 0
// double    → 0.0
// boolean   → false
// Object    → null

-------------------------------------------------------------------------------
Important Notes
-------------------------------------------------------------------------------

- Java doesn't have true multidimensional arrays like C/C++; instead, it uses
  arrays of arrays (each dimension is an array of references).
- Arrays can be jagged — rows or deeper dimensions can have different lengths.
- Out-of-bound access throws ArrayIndexOutOfBoundsException.
- Useful method: Arrays.deepToString(array) for printing nested structures.

Example:
System.out.println(Arrays.deepToString(matrix3D));
*/


package com.fundamental.arrayDemo.multidimArray;

public class BasicsOfMultiDimensionArray {
}
