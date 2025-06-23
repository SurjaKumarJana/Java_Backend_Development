/*
in java String is not a primitive datatype , it is an class
===============================================================================
                                        String in Java
===============================================================================

What is a String:
    In Java, a String is an object that represents a sequence of characters.
    It is part of the `java.lang` package and is widely used for text processing.
    Strings in Java are immutable, meaning once created, they cannot be changed.

    A string in Java is a sequence of characters stored using UTF-16 encoding,
    where every character occupies 16 bits.

Declaration and Initialization:

String s1 = "Hello";                        // String literal (stored in String Pool)
String s2 = new String("World");            // String object (stored in heap memory)

-------------------------------------------------------------------------------
String Immutability
-------------------------------------------------------------------------------

- Once a String is created, its content cannot be modified.
- All operations that appear to modify a String actually return a new object.

Example:
String s = "Java";
s.concat(" Language");     // Returns a new String, original `s` is unchanged.

-------------------------------------------------------------------------------
String Length and Access
-------------------------------------------------------------------------------

- s.length()               → Returns number of characters.
- s.charAt(index)          → Returns the character at given index (0-based).
- IndexOutOfBoundsException is thrown if index is invalid.

Example:
String name = "Java";
int len = name.length();       // 4
char c = name.charAt(1);       // 'a'

-------------------------------------------------------------------------------
Common String Methods
-------------------------------------------------------------------------------

// Comparison
s1.equals(s2);                 // Content comparison
s1.equalsIgnoreCase(s2);       // Case-insensitive comparison
s1.compareTo(s2);              // Lexicographic comparison

// Searching
s1.contains("lo");             // true if substring exists
s1.indexOf("a");               // Returns first index of 'a'
s1.lastIndexOf("a");           // Last occurrence of 'a'

// Substring
s1.substring(1);               // From index 1 to end
s1.substring(1, 3);            // From index 1 to 2 (end index excluded)

// Case Conversion
s1.toUpperCase();              // Converts to uppercase
s1.toLowerCase();              // Converts to lowercase

// Trimming and Replacing
s1.trim();                     // Removes leading/trailing spaces
s1.replace('a', 'x');          // Replaces all 'a' with 'x'

// Splitting
String[] words = s1.split(" ");  // Splits string by spaces

-------------------------------------------------------------------------------
String Concatenation
-------------------------------------------------------------------------------

- Using + operator:            String result = "Hello" + " World";
- Using concat():              s1.concat(" World");
- Using StringBuilder/StringBuffer for performance in loops.

-------------------------------------------------------------------------------
Conversion Between String and Other Types
-------------------------------------------------------------------------------

// To char array
char[] chars = s1.toCharArray();

// To byte array
byte[] bytes = s1.getBytes();

// From primitives
String val = String.valueOf(123);           // "123"
String bool = String.valueOf(true);         // "true"

-------------------------------------------------------------------------------
String Pool vs Heap
-------------------------------------------------------------------------------

- String literals are stored in a special memory area called the String Pool.
- Using `new String("text")` creates a new object in heap even if identical
  literal exists in pool.
- Use `intern()` method to move string to pool:
  String interned = s2.intern();

-------------------------------------------------------------------------------
Important Notes
-------------------------------------------------------------------------------

- Strings are immutable and thread-safe by design.
- Use StringBuilder or StringBuffer for frequent modifications.
- Avoid `==` for comparing strings; use `.equals()` instead.
- Strings support Unicode and can handle international characters.

Example:
String message = "Welcome";
System.out.println(message.toUpperCase());   // Output: WELCOME
*/


package com.fundamental.stringdemo;

public class BasicsOfString {
    public static void main(String[] args) {
        String str = new String("Welcome to My Java repo    ");
        String str2 = new String("python");
        String str3 = new String("Welcome to My Java repo");

        String str_low = str.toLowerCase();
        String str_upper = str.toUpperCase();
        String str_trim = str.trim();
        String str_sub1 = str.substring(6);
        String str_sub2 = str.substring(5,12);
        String str_replace = str.replace('w', 'e' );




        System.out.println(str.length());
        System.out.println(str_low);
        System.out.println(str_upper);
        System.out.println(str_trim);
        System.out.println(str_sub1);
        System.out.println(str_sub2);
        System.out.println(str_replace);
        System.out.println(str.startsWith("Wel"));
        System.out.println(str2.endsWith("on"));
        System.out.println(str.charAt(5));
        System.out.println(str.equals(str3));
    }
}
