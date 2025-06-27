/*
 * finally block is written after the catch block or if we don't have a catch block then
 * just after the try block
 *
 * when ever we have to something must be done whether there is an exception appeares or not
 * like if we are open in a file and want to read the first line of it
 * if it is empty then the method that read the firstline will throw and exception
 * and the program controll will move from that particular method  to it's  calling method
 * but the resource will be still opened.
 * to close them we can use finally block
 *
 * whatever is written in finally block will be executed whether this an exception that is catched by
 * the catch block or not it must be executed
 */

package com.surja.exceptionHandling.finallyBlock;

public class FinallyDemo {

    static void throwException() throws Exception{
        throw new Exception("New exception created ");
        
    }
    public static void main(String[] args) throws Exception{
        try{throwException();}


        finally{
            System.out.println("The finally block is executed");
            System.out.println("And the resources are closed..");
        }
    }
    
}
