

/*
Definition:
-----------
The Stream API, introduced in Java 8, is a feature of the
java.util.stream package that allows functional-style
operations on collections of data.

 */

/*
Why Use Streams?
    Before Java 8, working with collections required external iteration using loops.
    Streams simplify this by enabling internal iteration, reducing boilerplate code,
    and improving readability.

The key benefits of streams include:

No storage – Streams do not store data; they process elements from a source.
Pipelining of functions – Multiple operations can be chained together.
Lazy execution – Operations are performed only when needed.
Parallel execution – Can be executed concurrently for better performance.
Support for multiple data sources – Can work with collections, arrays, file lines, and more.
 */

/*
Understanding Stream Components
        A Java stream consists of three parts:

    Source – The origin of data, such as a list, array, or file.
    Intermediate operations – Functions that transform the data (e.g., filter(), map()).
    Terminal operation – A function that produces a result (e.g., forEach(), collect()).

A stream can have multiple intermediate operations but only one terminal operation.
 */

/*
How Streams Work in Java
        A stream processes data in a sequence of operations.

    It follows a pipeline structure:

    Source: The input data (e.g., List, Set, Array).
    Intermediate Operations: Transformations like filtering, mapping, sorting, and finding distinct elements.
    Terminal Operation: Collecting results, summing values, or printing output.

Operations are chainable, creating clean and structured code.
Data flows through the pipeline without being stored, ensuring efficiency.
 */

/*
==========================================================
        Understanding Terminal and Intermediate Operations
==========================================================

Intermediate Operations:
                Return a modified stream.
                Examples: filter(), map(), sorted(), distinct().

Terminal Operations:
                Process elements and produce a result (not a stream).
                Examples: forEach(), collect(), reduce(), count().
 */

/*

==========================================================
        Java Stream API - Class Hierarchy
==========================================================

        java.lang.Object
        └── java.util.stream.BaseStream<T, S extends BaseStream<T, S>>
        |
        |-- Stream<T>              // For objects (e.g., Stream<String>)
        |
        |-- IntStream              // For primitive int
        |
        |-- LongStream             // For primitive long
        |
        └-- DoubleStream           // For primitive double

        ----------------------------------------------------------


 */

/*
==========================================================
       Common Methods in Stream Interfaces
==========================================================

All four subinterfaces share several key methods:

1.  filter(Predicate<T>) → Filters elements based on a condition.
2.  forEach(Consumer<T>) → Iterates over elements and performs an action (Terminal Operation).
3.  min(Comparator<T>) / max(Comparator<T>) → Finds the minimum or maximum element.
4.  skip(long n) → Skips the first n elements.
5.  findFirst() → Retrieves the first element.
6.  count() → Returns the number of elements.
7.  distinct() → Removes duplicate elements.
8.  sorted() → Sorts the stream elements.
9.  reduce(BinaryOperator<T>) → Reduces elements into a single result.
10. collect(Collector<T>) → Converts stream elements into a collection (e.g., List, Set).
 */

/*
==========================================================
        Special Methods for Numeric Streams
==========================================================

The first three subinterfaces (IntStream, LongStream, DoubleStream) have unique methods:

sum() → Computes the sum of elements.
average() → Computes the average of elements.
boxed() → Converts a primitive stream into an object-based stream (e.g., IntStream → Stream<Integer>).
 */

package com.surja.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
//collection
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        List<String> stringList = Arrays.asList("Akash", "Viki", "Rahul", "Abhinav", "Sashank");

        // traditional method of accessing the elements
        // we have to write external loops
        for (String str : stringList) {
            System.out.println(str + " : " + str.length());
        }
        System.out.println("----------------------------");

        // in the functional programming style
        Consumer<String> consumer = (str) -> System.out.println(str + " : " + str.length());
        stringList.forEach(consumer);
        System.out.println("----------------------------");


        /*
        1. No storage – Streams do not store data; they process elements from a source.
        example : we have to display to even numbers from the array
         */
        // traditional approach
        List<Integer> evenNum = new ArrayList<>();
        for (Integer i : integerList) {
            if (i % 2 == 0) {
                evenNum.add(i);
            }
        }
        //displaying them
        for (Integer i : evenNum) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------------------");


        // now using the functional programming

        Predicate<Integer> evenCheck = (x) -> x % 2 == 0;
        integerList.stream().filter(evenCheck).forEach((x) -> System.out.print(x + " "));

        System.out.println();
        System.out.println("----------------------------");



        /*
        2. Pipelining of functions – Multiple operations can be chained together.
        we can use more then one function together to filer the result
        we are filtering even numbers that are greater than 10
         */
        integerList.stream()
                .filter(evenCheck)
                .filter((x) -> x > 10)
                .forEach((x) -> System.out.print(x + " "));


        System.out.println();
        System.out.println("----------------------------");


        /*
        3. Lazy execution – Operations are performed only when needed.

         */
        // though we have created the stream here... it doesn't mean the function will
        // start executing ... they only started executing when the terminal function call them
        Stream<Integer> stream = integerList.stream()
                .filter(x -> {
                    System.out.println("filtering " + x);
                    return x % 2 == 0;
                });
        System.out.println("Stream is created....");//first it will be executed...
        stream.forEach(x -> {
            System.out.println();
            System.out.println(x);
        });
        System.out.println();
        System.out.println("----------------------------");

        /*
        4.Parallel execution – Can be executed concurrently for better performance.


         */
        List<String> newStringList = Arrays.asList("Akash", "Viki", "Rahul", "Abhinav", "Sashank",
                "Akash", "Viki", "Rahul", "Abhinav", "Sashank", "Akash", "Viki", "Rahul",
                "Abhinav", "Akash", "Viki", "Rahul", "Abhinav", "Sashank", "Akash", "Viki",
                "Rahul", "Abhinav", "Sashank", "Sashank"
        );
        newStringList.parallelStream().forEach(str -> {
            System.out.println(str + "    " + Thread.currentThread().getName());
        });


    }
}

