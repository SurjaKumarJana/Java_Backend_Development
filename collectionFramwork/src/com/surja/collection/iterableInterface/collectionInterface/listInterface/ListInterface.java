/*
 * in this program we will see the methods that are present in the List interface , as it is interface we have to
 * implement it in order to use it
 * 
 * so List interface is extending from the interface Collection so it has all the methods of Collection Interface
 * besides that it also have indexing and it can have duplicate values so it has some extra methods also ,
 * 
 */
/*
                Methods that are inheriting from the previous interface Collection

*   Method's name                               description
---------------------------------------------------------------
.*      .add(E object)                           adds an new object in the collection

        .addAll(collection<E> c)                 all a collection of objects in the collection and usely at the end 
        
        .remove(object   )                       this method will remove and object from the collection
        
        .removeAll(collection<E> c)              this will remove a collection of objects from our collection
        
        retainAll(collection<E> c)              this is just like the compliment of previous one this will delete all the objects
                                                 .from this collection except which are present in collection C
                                                 
        .clear()                                 this well clear the collection 
        
        .isEmpty()                               this will return true if the collections doesn't have any object
        
        .contains()                              this will check for and object is present in the collection or not
        
        .equals(object)                          this will check if all the objects of two collection is equal or not
        
        .size()                                  this we return the size of the collection
        
        itertor()                               this will help us to iterate over the collection , means accesssing the element one by one

        .toArray()                               this will convert a collection into an array
        
*/
                            // New Methods
/*
*   Method's name                               description
---------------------------------------------------------------
.*      .add(int index , E object)               add an object at the specific location

        .addAll(int index, collection<E> c)      adds all that collection of objects from that particular location 
        
        .remove(int index)                       this method will remove and object particular index        
        
        .get(int index)                          this will return the object at that particular index    
        
        .set(int index, E element)               this is set the element at that particular index
                                                 
        .subList(int from , int to)              return a list that has copy of objects that will starting from the index and upto that one 
        
        .indexOf(E object)                       return index of that particular object     
        
        .lastIndexOf(object)                     this will serch for the object from the last 

        .listItertor()                          this will help us to iterate over the collection , means accesssing the element one by one

        .listIterator(int index)                 this will help us to iterate over the collection starting from the given index
*/



package com.surja.collection.iterableInterface.collectionInterface.listInterface;

public class ListInterface {
    
}
