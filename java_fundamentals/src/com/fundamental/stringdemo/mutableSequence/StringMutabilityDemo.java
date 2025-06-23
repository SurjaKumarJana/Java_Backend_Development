/*
===============================================================================
StringBuilder and StringBuffer in Java
===============================================================================

Overview:
	StringBuilder and StringBuffer are classes used to create mutable
	sequences of characters.

	Unlike String (which is immutable), these allow modification without
	creating new objects each time — making them efficient for frequent changes.

-------------------------------------------------------------------------------
Difference Between String, StringBuilder, and StringBuffer
-------------------------------------------------------------------------------

| Feature         | String       | StringBuilder        | StringBuffer         |
|-----------------|--------------|-----------------------|----------------------|
| Mutability      | Immutable    | Mutable               | Mutable              |
| Thread-Safety   | No           | No                    | Yes (Synchronized)   |
| Performance     | Slow         | Fast (Single-thread)  | Slower (Thread-safe) |
| Use Case        | Read-only    | Text manipulation     | Multi-threaded apps  |

-------------------------------------------------------------------------------
1. StringBuilder (Introduced in Java 5)
-------------------------------------------------------------------------------

	- Non-synchronized (Not thread-safe)
	- Fastest option for single-threaded programs
	- Provides all common string operations (append, insert, delete, etc.)

Declaration:
	StringBuilder sb = new StringBuilder();
	StringBuilder sb2 = new StringBuilder("Hello");

Common Methods:
	sb.append(" World");              // → "Hello World"
	sb.insert(0, "Java ");           // → "Java Hello World"
	sb.replace(0, 4, "Hey");         // → "Hey Hello World"
	sb.delete(0, 4);                 // → "Hello World"
	sb.reverse();                    // → "dlroW olleH"
	sb.setCharAt(0, 'h');            // → "hello World"
	String result = sb.toString();  // Convert to String

-------------------------------------------------------------------------------
2. StringBuffer (Thread-Safe)
-------------------------------------------------------------------------------

	- Synchronized methods (safe for use in multi-threaded environments)
	- Slower than StringBuilder due to synchronization
	- Same API as StringBuilder

Declaration:
	StringBuffer sbuf = new StringBuffer();
	StringBuffer sbuf2 = new StringBuffer("Hello");

Common Methods:
	sbuf.append(" Java");
	sbuf.insert(0, "Welcome ");
	sbuf.replace(0, 7, "Hi");
	sbuf.delete(0, 3);
	sbuf.reverse();
	String res = sbuf.toString();

-------------------------------------------------------------------------------
Capacity and Performance Optimization
-------------------------------------------------------------------------------

	- Default capacity = 16 characters
	- Grows automatically as content increases
	- Use ensureCapacity() to improve performance for large operations

Example:
	StringBuilder sb = new StringBuilder();
	sb.ensureCapacity(100);   // Allocates memory ahead of time

-------------------------------------------------------------------------------
When to Use What?
-------------------------------------------------------------------------------

	- Use String:
		When the text doesn't change (safe, simple, and memory-efficient)

	- Use StringBuilder:
		When you need to build or modify strings frequently in a single thread

	- Use StringBuffer:
		When working with multiple threads and string modification is needed

-------------------------------------------------------------------------------
Important Notes
-------------------------------------------------------------------------------

	- Always convert to String using `.toString()` when needed
	- Avoid using `+` operator in loops — it's inefficient
	- Prefer StringBuilder for loops and dynamic content generation
	- Both classes reside in java.lang (no need to import)

Example:
	StringBuilder sb = new StringBuilder("Hello");
	sb.append(" World");
	System.out.println(sb);    // Output: Hello World
*/


package com.fundamental.stringdemo.mutableSequence;

public class StringMutabilityDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("Initial capacity "+sb.capacity());
        sb.append("This is a java repo .");
        System.out.println(sb);
        sb.append(" Where i write code ");
        System.out.println(sb);// we can see that this object is now modified
        System.out.println("The capacity left : "+sb.capacity());

    }
}
