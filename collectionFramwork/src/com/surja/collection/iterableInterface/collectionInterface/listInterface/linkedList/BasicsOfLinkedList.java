/*
 * ===============================
 *                      LinkedList in Java
 * ===============================

 *
 * . Overview:
 *    - LinkedList is a part of the Java Collection Framework.
 *    - It is available in the java.util package.
 *    - Internally, it uses a **doubly linked list** structure.
 *        => Each node contains:
 *           - Data (the actual element),
 *           - A reference to the previous node,
 *           - A reference to the next node.
 *    - It allows:
 *        ✔ Duplicate elements,
 *        ✔ Null elements,
 *        ✔ Maintains insertion order.
 *    - It is **not synchronized** by default.
 *    - Because of its structure, it is good for fast insertion/deletion,
 *      but slower when accessing elements by index (compared to ArrayList).
 *
 * 3. Declaration:
 *    Syntax to create a LinkedList:
 *    --------------------------------
 *    LinkedList<Type> list = new LinkedList<>();
 *
 *    Example:
 *    --------------------------------
 *    LinkedList<String> names = new LinkedList<>();
 *    names.add("Alice");
 *    names.add("Bob");
 *
 * 4. Key Features:
 *    - Maintains insertion order.
 *    - Allows duplicate values.
 *    - Fast at insertion and deletion (O(1) at ends).
 *    - Slower access by index (O(n) time).
 *    - Supports both List and Queue operations.
 *    - Doubly linked list under the hood.
 *
 * 5. Common Constructors:
 *    - LinkedList<>(): Creates an empty list.
 *    - LinkedList(Collection c): Creates a list with the elements of the specified collection.
 *
 * 6. Important Methods:
 *    - add(E e): Adds element at the end.
 *    - addFirst(E e): Adds element at the beginning.
 *    - addLast(E e): Adds element at the end.
 *    - get(int index): Returns the element at specified index.
 *    - remove(): Removes first element.
 *    - removeFirst(): Removes first element.
 *    - removeLast(): Removes last element.
 *    - size(): Returns number of elements.
 *    - clear(): Removes all elements.
 *    - contains(Object o): Checks if an element is present.
 *    - iterator(): Returns an iterator to traverse the list.
 *    - listIterator(): Returns a list iterator (can traverse both ways).
 *
 * 7. Use Cases:
 *    - When you need:
 *         Frequent insertion/deletion,
 *         Adding/removing elements from both ends,
 *         Queue or Stack behavior (since it supports Deque).
 *    - Not suitable when you frequently need to access elements by index.
 *
 * 8. Example Usage:
 *    ------------------------------------------------
 *    LinkedList<String> animals = new LinkedList<>();
 *    animals.add("Dog");             // add to end
 *    animals.addFirst("Cat");        // add to front
 *    animals.addLast("Elephant");    // add to end
 *    animals.remove();               // remove first
 *    System.out.println(animals.get(1)); // get element at index 1
 *
 * 9. Differences with ArrayList:
 *    ------------------------------------------------
 *    | Feature          | LinkedList         | ArrayList         |
 *    |------------------|--------------------|-------------------|
 *    | Access Time      | Slow (O(n))        | Fast (O(1))       |
 *    | Insert/Delete    | Fast               | Slow              |
 *    | Memory Usage     | More (extra links) | Less              |
 *    | Internal Storage | Doubly Linked List | Dynamic Array     |
 * 
 *10. Thread Safety :
 * -----------------------------------------
 *
 * ❖ What is Thread Safety?
 *    - In a multithreaded program, multiple threads may access or modify a collection at the same time.
 *    - Thread safety ensures that data is not corrupted when multiple threads use the same object.
 *
 * ❖ Is LinkedList thread-safe?
 *    -  No. LinkedList is **NOT** thread-safe by default.
 *    - If one thread is adding an element and another is removing at the same time,
 *      it can cause **data inconsistency**, **exceptions**, or even **program crash**.
 *
 * ❖ How to make LinkedList thread-safe?
 *    You can wrap it using `Collections.synchronizedList()` method.
 *
 *    Example:
 *    -----------------------------------
 *    List<String> safeList = Collections.synchronizedList(new LinkedList<>());
 *
 *    Now, all methods of `safeList` are synchronized internally.
 *
 * ❖ Important Note:
 *    - Even with synchronizedList, you must **manually synchronize** during iteration.
 *
 *    Example (safe iteration):
 *    -----------------------------------
 *    synchronized(safeList) {
 *        Iterator<String> it = safeList.iterator();
 *        while(it.hasNext()) {
 *            System.out.println(it.next());
 *        }
 *    }
 *
 * ❖ Alternative:
 *    - If thread safety is a must and performance is critical,
 *      you can use **concurrent collections** like:
 *        → CopyOnWriteArrayList
 *        → ConcurrentLinkedQueue
 *      (These are thread-safe and optimized for concurrency.)
 *
 *  Summary:
 *    - LinkedList is not thread-safe.
 *    - Use `Collections.synchronizedList()` for basic safety.
 *    - For iteration, use synchronized block manually.
 *    - Prefer concurrent collections for high-performance multithreading.
 *
 * 11. Internal Structure:
 *    - Doubly linked list:
 *        Each node:
 *        [Previous Node] ←→ [Current Node] ←→ [Next Node]
 *    - Allows bidirectional traversal.
 *
 * 
 */

package com.surja.collection.iterableInterface.collectionInterface.listInterface.linkedList;

import java.util.LinkedList;
import java.util.List;

public class BasicsOfLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();// creating and empty LinkedList object
        LinkedList<Integer> list2 = new LinkedList<Integer>(List.of(1,3,5,7,11,13,17,19,23,29,31));// creating a LinkedList object with a collection of objects

        // adding elements in list 
        list.add("apple");
        list.add("Google");
        list.addLast("Flipkart");
        list.add("Meta");
        list.addFirst("samsung");
        
        System.out.println(list);
    
        // accessing the elements using foreach loop with lambda expression
        list2.forEach((x)->System.out.println(x));



    }
    
}
