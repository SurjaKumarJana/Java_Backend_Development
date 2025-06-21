package com.fundamental.function;
// this is a simple java program
public class FunctionWorking {
    public static void main(String[] args) {
        int x =5;
        fun2(x);
        System.out.println(x);
    }
    static void fun2(int x ){

        x = x*2;
        fun3(x);
    }
    static void fun3(int x ){
        int y = x*2;

        x = x+y;
    }

}
// now break down each steps how it is working
/*
 Java Call Stack Execution Flow

-> Step 0:
Program starts
Nothing on the stack yet

-> Step 1: main() is called → main stack frame is created
|----------------------|
|      main()          |
|  x = 5               |
|----------------------|     -> main starts, variable x is created and assigned 5

-> Step 2: fun2(x) is called → fun2 stack frame is created
|----------------------|
|      fun2()          |
|  x = 10              |
|----------------------|
|      main()          |
|  x = 5               |
|----------------------|
                            -> fun2's stack frame is created
                            -> fun2's local variable x is created
                            -> value of main's x (5) is copied into fun2's x
                            -> then fun2's x is updated: x = x * 2 → 10

-> Step 3: fun3(x) is called → fun3 stack frame is created
|----------------------|
|      fun3()          |
|  x = 30              |
|  y = 20              |
|----------------------|
|      fun2()          |
|  x = 10              |
|----------------------|
|      main()          |
|  x = 5               |
|----------------------|
                            -> fun3's x is created with the value of fun2's x (10)
                            -> y is created as y = x * 2 = 20
                            -> x is updated: x = x + y = 30

-> Step 4: fun3() returns → fun3 stack frame is removed
|----------------------|
|      fun2()          |
|  x = 10              |
|----------------------|
|      main()          |
|  x = 5               |
|----------------------|
                            -> fun3 ends, its local x and y are discarded

-> Step 5: fun2() returns → fun2 stack frame is removed
|----------------------|
|      main()          |
|  x = 5               |
|----------------------|
                            -> fun2 ends, its local x is discarded

-> Step 6: System.out.println(x)
Output → 5                     -> main's original x is printed (unchanged)
*/
