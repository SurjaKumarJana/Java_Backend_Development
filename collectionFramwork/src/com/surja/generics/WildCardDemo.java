
/*
 Java Generics - Wildcards ( ? ) Notes

--------------------------------------------------------------------------------
 What is a Wildcard?

-- A wildcard is represented by a question mark: `?`
-- It is used in generics to represent an unknown type.
-- Wildcards provide flexibility when working with generic classes, methods, or interfaces.

--------------------------------------------------------------------------------
 Types of Wildcards:

1. Unbounded Wildcard: <?>
2. Upper Bounded Wildcard: <? extends T>
3. Lower Bounded Wildcard: <? super T>

--------------------------------------------------------------------------------
 1. Unbounded Wildcard <?>
 
- Use <?> when you are working with unknown types and don’t care about specific operations.
-- Accepts any type.
-- Useful when you don’t care about the type parameter.
-- Mainly used for reading data only.


--------------------------------------------------------------------------------
 2. Upper Bounded Wildcard <? extends T>

- Use <? extends T> when you only need to read from a structure.
-- Accepts T and any subclass of T.
-- You can read from the collection safely.
-- You cannot add elements (except null) due to type safety.


--------------------------------------------------------------------------------
 3. Lower Bounded Wildcard <? super T>

- Use <? super T> when you only need to write to a structure.
-- Accepts T and any superclass of T.
-- You can safely write to the collection.
-- Reading is limited to Object type.


--------------------------------------------------------------------------------
 Wildcard (`?`) vs Generic Type (`<T>`)

 Both represent "any type", but they are used differently:

| Feature               | <T> (Generic Type)                   | ? (Wildcard)                        |
|-----------------------|--------------------------------------|-------------------------------------|
| Purpose               | Used when defining a class/method    | Used when using a generic type      |
| Used in               | Class/method definition              | Method arguments, return types      |
| Can write (add)       | Yes                                  | No (except in <? super T>)          |
| Can read              | Yes                                  | Yes (usually as Object)             |
| Type is known         | Yes (`T`, `E`, etc.)                 | No (only unknown `?`)               |

Summary:
- Use <T> when you **build** something generic.
- Use ? when you **use** something generic and you’re not sure about the exact type.

--------------------------------------------------------------------------------
 Note:

- Wildcards are mainly used with methods (parameters or return types), not while defining classes.
- Helps make code more flexible and reusable.

*/

package com.surja.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardDemo {



    public static void main(String[] args) {
        //generic method
        add(2,4);

        // examples of wildCards
        List<?> list ; // this means this list can refer to any type of list
        list = new ArrayList<Integer>();// this can refer to an ArrayList of type Integer
        list = new ArrayList<String>();// this can refer to an ArrayList of type String
        list = new ArrayList<Float>();// this can refer to an ArrayList of type Float
        //list.add(232);//not allowed
        list.get(0);

        //upper bounded wildcard
        List<? extends Number> numbers; // now this list will refer to a list of numbers
        numbers = new ArrayList<Integer>();
        // numbers = new ArrayList<String>();// this will show compilation error
        numbers = new ArrayList<Float>();
        //list.add(232);//not allowed
        list.get(0);

        
        // lower bounded wildcard
        List<? super Number> values; // now this list will refer to a list containing Numbers object
        /*// this will show compilation error
        values = new ArrayList<Integer>();
        values = new ArrayList<String>();
        values = new ArrayList<Float>();
         */
        values = new ArrayList<Number>();
        values.add(124); // allowed
        values = new ArrayList<Object>();
    }


    //generic method
    public static <T extends Number> void add(T a,T b){
        System.out.println(a.doubleValue()+b.doubleValue());
    }
}
