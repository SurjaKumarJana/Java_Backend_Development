/*
================================================================================
USER-DEFINED EXCEPTION IN JAVA
================================================================================

Purpose:
    Java allows us to define our own exception classes to represent specific
    error conditions that are not covered by built-in exceptions.

    These are called "User-Defined Exceptions" or "Custom Exceptions".

--------------------------------------------------------------------------------
WHY CREATE A USER-DEFINED EXCEPTION?
--------------------------------------------------------------------------------

    - To handle application-specific errors
    - To provide meaningful exception messages
    - To improve code readability and maintainability

--------------------------------------------------------------------------------
TYPES:
--------------------------------------------------------------------------------

    1. Checked Exception (extends Exception)
    2. Unchecked Exception (extends RuntimeException)


--------------------------------------------------------------------------------
HOW TO CREATE A USER-DEFINED EXCEPTION
--------------------------------------------------------------------------------

1. Extend the `Exception` class (for **checked exceptions**), or
   extend `RuntimeException` (for **unchecked exceptions**).

2. Provide constructors to initialize the exception with or without a custom message.


*/
package com.surja.exceptionHandling.userDefineException;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try{
            throw new CustomException("this is my exception");
        }catch (CustomException ex){
            System.out.println(ex.getMessage());
        }
    }


}
