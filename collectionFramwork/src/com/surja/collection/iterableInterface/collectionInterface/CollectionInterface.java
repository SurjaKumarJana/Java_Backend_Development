/*
===========================
      Collection Interface
==========================
. **Overview**:
   - The `Collection` interface is the **root interface** of the Java Collections Framework (JCF).
   - It defines the basic operations for all types of collections, such as **insertion**, **deletion**, **searching**, and **traversal**.
   - Collection is a generic interface: `Collection<E>` where E is the type of objects stored.

 **Why Use Collection Interface?**
   - To define a standard architecture for representing groups of objects.
   - Allows polymorphic handling of different data structures.
   - Enables code reusability and flexibility.

5. **Key Subinterfaces**:
   - **List** (e.g., ArrayList, LinkedList): Ordered collection, allows duplicates.
   - **Set** (e.g., HashSet, TreeSet): No duplicate elements.
   - **Queue** (e.g., LinkedList, PriorityQueue): Used for holding elements before processing.
   - **Deque** (e.g., ArrayDeque, LinkedList): Double-ended queue.

6. **Common Methods in Collection Interface**:
   | Method Signature                       | Description                                |
   |----------------------------------------|--------------------------------------------|
   | boolean add(E e)                       | Adds element to the collection.            |
   | boolean addAll(Collection<? extends E>)| Adds all elements from another collection. |
   | void clear()                           | Removes all elements.                      |
   | boolean contains(Object o)             | Checks if element is present.              |
   | boolean containsAll(Collection<?>)     | Checks if all elements are present.        |
   | boolean equals(Object o)               | Compares two collections.                  |
   | int hashCode()                         | Returns hash code value.                   |
   | boolean isEmpty()                      | Checks if collection is empty.             |
   | Iterator<E> iterator()                 | Returns iterator for traversal.            |
   | boolean remove(Object o)               | Removes a specific element.                |
   | boolean removeAll(Collection<?>)       | Removes all matching elements.             |
   | boolean retainAll(Collection<?>)       | Retains only the matching elements.        |
   | int size()                             | Returns number of elements.                |
   | Object[] toArray()                     | Converts to Object array.                  |
   | <T> T[] toArray(T[] a)                 | Converts to typed array.                   |

        .add(E object)                           adds an new object in the collection

        .addAll(collection<E> c)                 all a collection of objects in the collection and usely at the end

        .remove(object   )                       this method will remove and object from the collection

        .removeAll(collection<E> c)              this will remove a collection of objects from our collection

        retainAll(collection<E> c)              this is just like the compliment of previous one this will delete all the objects
                                                 .from this collectiion except which are present in collection C

        .clear()                                 this well clear the collection

        .isEmpty()                               this will return true if the collections doesn't have any object

        .contains()                              this will check for and object is present in the collection or not

        .equals(object)                          this will check if all the objects of two collection is equal or not

        .size()                                  this we return the size of the collection

        itertor()                               this will help us to iterate over the collection , means accesssing the element one by one

        .toArray()                               this will convert a collection into an array

7. **Default Methods (Since Java 8)**:
   - `default boolean removeIf(Predicate<? super E> filter)`
   - `default Spliterator<E> spliterator()`
   - `default Stream<E> stream()`
   - `default Stream<E> parallelStream()`
   - `default void forEach(Consumer<? super E> action)`

8. **Important Notes**:
   - It does **not allow primitive types** like `int`, `char`. Use wrapper classes (`Integer`, `Character`).
   - `Collection` interface cannot be instantiated directly since it is an **interface**.
   - Most methods throw **UnsupportedOperationException** if the underlying collection is immutable.






/*
 * in this program we will discous about the collection interface that is the mother of all the interfaces present in java
 * collection framwork
 * it  extends from the interface Itarator
 *
 * mainly in this program we will all the methods that present in the interface Collection
 *
 */





package com.surja.collection.iterableInterface.collectionInterface;

public class collectionInterface {

}
