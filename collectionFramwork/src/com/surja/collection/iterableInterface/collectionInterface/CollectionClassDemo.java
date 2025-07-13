

 /*
        the Collection interface give us some utility methods

        The Collections class is a utility class in java.util that provides various
        static methods to operate on collections
        Methods:

            sort(List): Sorts a list.
            reverse(List): Reverses a list.
            shuffle(List): Randomly shuffles elements.
            binarySearch(List, key): Searches an element using binary search.


 */
package com.surja.collection.iterableInterface.collectionInterface;

 import java.util.ArrayList;
 import java.util.Collections;
 import java.util.List;

 public class CollectionClassDemo {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.addAll(List.of(10,20,2541,30,40,50,60,70));

        //Collections.shuffle(list);

        //Collections.sort(list);

       //Collections.reverse(list);
        System.out.println(Collections.binarySearch(list, 60));
        list.forEach(x ->
                System.out.print(x+" ")
        );
    }
}
