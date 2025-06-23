
// Java Program to show
// Passing Objects by Reference vs. Reassigning Objects

package com.fundamental.function;

class Point {
    // Declaring two integer fields for x and y coordinates
    int x;
    int y;
}

public class PassByValue {
    public static void main(String[] args) {
        // Creating a Point object
        Point p = new Point();

        // Assigning values to the coordinates
        p.x = 5;
        p.y = 10;

        // Calling the fun method and passing the Point
        // object
        fun(p);

        // Printing the unchanged coordinates of p
        System.out.println(p.x + " " + p.y);
    }

    // fun method that creates a new Point object and
    // modifies it
    public static void fun(Point p) {
        // Creating a new Point object
        p = new Point();

        // Modifying the new Point object
        p.x = 10;
        p.y = 10;
    }

}

// Why we see the unchanged values , instead of new ones ?
// let's break  down it
/*
QUESTION:
If we pass the reference 'p' into fun(), and inside fun() we write:
    p = new Point();
why doesn't the original 'p' in main() now point to the new object?

==> ANSWER:
Because Java passes **a copy of the reference**, not the reference itself.
So reassigning that copy does NOT affect the original.

==> MEMORY VISUALIZATION (REFERENCE BEHAVIOR)

Before calling fun(p):

   +------------------+           +----------------------+
   |     main()       |           |   Heap Memory        |
   |------------------|           |----------------------|
   | p  ------------+ |           |  [Point@100]         |
   |                | |---------> |  x = 5               |
   +------------------+           |  y = 10              |
                                  +----------------------+

Inside fun(p): (copy of reference)

   +------------------+           +----------------------+
   |     fun()        |           |   Heap Memory        |
   |------------------|           |----------------------|
   | p  ------------+ |           |  [Point@100]         |
   |  (copy of main) || --------->|  x = 5               |
   +------------------+           |  y = 10              |
                                  +----------------------+

Then inside fun(), we write:

   p = new Point();
   p.x = 10;
   p.y = 10;

Now memory looks like:

   +------------------+           +----------------------+
   |     fun()        |           |   Heap Memory        |
   |------------------|           |----------------------|
   | p  ------------+ |           |  [Point@100]         |
   | (reassigned)    ||-------    |  x = 5               |
   +------------------+      |    |  y = 10              |
                             |    +----------------------+
                             |
                             |    +----------------------+
                             +--> |  [Point@200]         |
                                  |  x = 10              |
                                  |  y = 10              |
                                  +----------------------+

After fun() ends:

   +------------------+           +----------------------+
   |     main()       |           |   Heap Memory        |
   |------------------|           |----------------------|
   | p  ------------+ |           |  [Point@100]         |
   |                | |---------> |  x = 5               |
   +------------------+           |  y = 10              |
                                  +----------------------+

   --> The new object at [Point@200] is lost unless returned.
   --> main.p still points to the original object.

==> KEY TAKEAWAYS:
- Java passes references **by value** (copy of reference).
- Reassigning a parameter inside a method does NOT affect the caller’s reference.
- To reflect changes in the original object:
    --> Modify the object's fields (e.g., p.x = 100)
    --> Or return the new object and assign it in main()

*/


