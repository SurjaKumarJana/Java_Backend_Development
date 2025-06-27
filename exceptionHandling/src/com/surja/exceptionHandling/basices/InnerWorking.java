/*
When an Exception occurs, the JVM creates an exception object containing the error name,
description, and program state. Creating the exception object and handling it in the
run-time system is called throwing an exception.

There might be a list of the methods that had been called to get to the method where
 an exception occurred.
This ordered list of methods is called call stack.

Now the following procedure will happen:

=> The run-time system searches the call stack for an exception handler
=> It starts searching from the method where the exception occurred and
   proceeds backward through the call stack.
=> If a handler is found, the exception is passed to it.
=> If no handler is found, the default exception handler terminates the program and prints the stack trace.
 */


package com.surja.exceptionHandling.basices;



public class InnerWorking {

    public static void division() throws Exception{
        throw new Exception("division Error");
    }

    static void intDivision() throws Exception{
        division();
    }
    public static void main(String[] args) throws Exception{
        try{
            int a =8;
            int b =8;
            int c = a/b;
            intDivision();
        }catch (ArithmeticException e ){
            System.out.println(e);
        }
    }
}
