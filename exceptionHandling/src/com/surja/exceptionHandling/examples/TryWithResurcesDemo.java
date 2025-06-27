/*
 * Java has introduce a new feature for the simplification of resource closing
 * we don't need to close the resources if there an exception happend we can use try with resource block
 * that will do the task for us
 * the try block will autometically close the resources after the execution of try block
 * and all the resources will be local to the try block we cann't use then out side of the try block
 */
package com.surja.exceptionHandling.examples;

import java.io.*;
import java.util.*;

public class TryWithResurcesDemo{
    
    static void Divide() throws Exception
    {
        
        
        try(FileInputStream fi=new FileInputStream("E:\\mytext.txt");Scanner sc=new Scanner(fi) )
        {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(a/c);
        }
        
    }
    
    public static void main(String[] args) throws Exception
    {
        try
        {
        Divide();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
        
    }
    
}