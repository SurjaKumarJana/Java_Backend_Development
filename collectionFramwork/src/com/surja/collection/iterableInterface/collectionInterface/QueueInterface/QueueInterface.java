/*
 * Queue is an interface that is Extending from the interface Collection 
 * it has all the methods that are inheriting from Collection interface and also have some new methods
 */
/*
                Methods that are inheriting from the previos interface Collection

*   Method's name                               description
---------------------------------------------------------------
.*      .add(E object)                           adds an new object in the collection

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
        
*/
                            // New Methods
/*
*   Method's name                               description
-------------------------------------------- -------------------
.*      .add(E object)                        add an object in the Queue , definatly at the end

        .poll()                               remove the object that is present in the first possition return Null as a result if empty 
        
        .remove()                             remove the object that is present in the first possition , throws NoSuchElementException if empty
        
        .peek()                               use to know what is the first element , it will return the first element , return null if empty

        .element()                            return first elenment , throws NoSuchElementException i empty

        
*/

package com.surja.collection.iterableInterface.collectionInterface.QueueInterface;

public class QueueInterface {
    
}
