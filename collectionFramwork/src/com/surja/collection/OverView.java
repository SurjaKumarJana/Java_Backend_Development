/*
                                Collection Framework in Java

==> Introduction:
    The Java Collection Framework  is a unified architecture for storing, retrieving,
    and manipulating groups of objects. It provides interfaces, classes, and algorithms
    to handle data efficiently.

==> What Does Collection Mean?
    Collection means a **group of objects**. In Java, a collection is a **container** that
    holds multiple elements together. Instead of dealing with individual variables for each
    object, collections allow us to handle a set of related objects as a single unit.

==>What Does Framework Mean?

    A **framework** is a **predefined set of classes and interfaces** that provides a structure
    for developing software applications. It offers **reusable code, design patterns, and utilities**
    to solve common programming problems.

In Java, the Collection Framework provides a **standard structure to store, manipulate, and
retrieve groups of objects**, without having to build data handling mechanisms from scratch.

Key points:
- Framework = Ready-made tools + guidelines
- It speeds up development and ensures code consistency
- Helps developers focus on business logic rather than infrastructure code

==>  Why Collection Framework is Needed:

1. To manage dynamic data:
   - Unlike arrays, collections can **grow or shrink** in size as needed.
   - You don’t have to define a fixed size at the time of declaration.

2. To avoid writing custom data structures:
   - Java provides **ready-made classes** like ArrayList, HashSet, and HashMap.
   - This saves time and effort in building complex data structures from scratch.

3. To achieve code reusability, flexibility, and performance:
   - The framework uses **well-tested and optimized** classes and interfaces.
   - It ensures better performance with **minimal lines of code**.

4. To provide built-in sorting, searching, and iteration utilities:
   - Utility classes like `Collections` and interfaces like `Iterable` provide
     **easy-to-use methods** for sorting, searching, shuffling, and iterating.
   - Reduces manual effort and chances of error.



==> Core Interfaces in Collection Framework:

1. Collection (Root Interface)
2. List – Ordered collection with duplicates allowed
3. Set – Unordered collection with no duplicates
4. Queue – Used to hold elements for processing (FIFO)
5. Map – Key-value pairs (not part of Collection interface)

==> Important Classes:

List Implementations:
---------------------
- ArrayList         → Dynamic array, fast random access
- LinkedList        → Doubly-linked list, good for frequent insert/delete
- Vector            → Synchronized version of ArrayList
- Stack             → LIFO (Last In First Out) structure

Set Implementations:
--------------------
- HashSet           → No order, no duplicates, uses hash table
- LinkedHashSet     → Maintains insertion order
- TreeSet           → Sorted set using Red-Black tree

Queue Implementations:
----------------------
- PriorityQueue     → Elements ordered by priority
- ArrayDeque        → Double-ended queue

Map Implementations:
--------------------
- HashMap           → Key-value pair, no order
- LinkedHashMap     → Maintains insertion order
- TreeMap           → Sorted keys
- Hashtable         → Thread-safe, legacy class

                    java.util
                    ├── Collection<E>
                    │   ├── List<E>
                    │   │   ├── ArrayList<E>
                    │   │   ├── LinkedList<E>
                    │   │   ├── Vector<E>
                    │   │   └── Stack<E>
                    │   ├── Set<E>
                    │   │   ├── HashSet<E>
                    │   │   ├── LinkedHashSet<E>
                    │   │   └── TreeSet<E> (implements SortedSet, NavigableSet)
                    │   └── Queue<E>
                    │       ├── LinkedList<E>
                    │       ├── PriorityQueue<E>
                    │       └── ArrayDeque<E>
                    │
                    ├── Map<K, V>
                    │   ├── HashMap<K, V>
                    │   ├── LinkedHashMap<K, V>
                    │   ├── TreeMap<K, V> (implements SortedMap)
                    │   ├── Hashtable<K, V>
                    │   └── Properties
                    │
                    ├── Utility
                    │   ├── Collections
                    │   ├── Arrays
                    │   ├── Comparator<T>
                    │   └── Enumeration<T> (legacy)

==> Useful Methods (From Collection Interface):
- boolean add(E e);
- boolean remove(Object o);
- boolean contains(Object o);
- void clear();
- int size();
- boolean isEmpty();
- Iterator<E> iterator();

==> Iterator:

- `Iterator` is an interface used to **traverse or loop** through elements in a collection.
- It replaces older looping methods like `for` with index and avoids errors like `ConcurrentModificationException`.

Key Methods:
------------
1. `boolean hasNext()`:
   - Returns `true` if there are more elements to iterate.

2. `E next()`:
   - Returns the next element in the collection.

3. `void remove()`:
   - Removes the current element from the collection (optional operation).

==> Advantages:

1. Reusability:
   - Collection classes like ArrayList, HashSet, HashMap, etc. are **ready to use**.
   - Saves time and effort in writing custom code.

2. Performance:
   - Classes in the framework are **highly optimized** for performance.
   - For example, HashMap provides near-constant time performance for basic operations.

3. Interoperability:
   - Since all collections implement standard interfaces, they can work **together smoothly**.
   - Example: Switching from ArrayList to LinkedList requires minimal code change.

4. Flexibility:
   - You can store **any type of object** using generics.
   - It supports a wide range of data structures like stacks, queues, sets, and maps.

5. Built-in Utility Methods:
   - Java provides utility classes like `Collections` and `Arrays` for operations
     such as sorting, searching, reversing, shuffling, etc.

==> Limitations:

1. Complexity:
   - Too many interfaces and classes can be **confusing for beginners**.
   - Understanding when to use which class needs practice and experience.

2. Overhead:
   - Collections use **objects instead of primitives**, which may cause memory overhead.
   - Example: `ArrayList<Integer>` uses Integer objects, not primitive `int`.

3. Type Safety Issues (before Java 5):
   - Before generics, collections could store any object,
     leading to **ClassCastException** at runtime.

4. Not Always Thread-Safe:
   - Most collection classes are **not synchronized** by default.
   - Developers need to use synchronization manually or use concurrent collections.

==> Conclusion:
The Java Collection Framework simplifies data handling by providing
efficient, reusable, and flexible data structures. It is essential for
building scalable and maintainable Java applications.
*/


package com.surja.collection;

public class OverView {
}
