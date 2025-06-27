/*
================================================================================
EXCEPTION HANDLING IN JAVA
================================================================================

Purpose:
    Exception handling provides a way to detect and manage runtime errors
    in Java programs, allowing the application to continue running or fail
    gracefully with meaningful error messages.

--------------------------------------------------------------------------------
WHAT IS AN EXCEPTION?
    - An exception is an event that disrupts the normal flow of the program.
    An Exception is an unwanted or unexpected event that occurs during the execution of a program,
    i.e., at runtime, and disrupts the normal flow of the program's instructions. It occurs when
    something unexpected happens, like accessing an invalid index, dividing by zero, or trying to
    open a file that does not exist.
    - It is an object that represents an error or unexpected behavior.

    Examples:
        → ArithmeticException
        → NullPointerException
        → IOException
        → ArrayIndexOutOfBoundsException

--------------------------------------------------------------------------------
TYPES OF EXCEPTIONS:

1. Checked Exceptions:
    - Checked at compile-time.
    - Must be handled using try-catch or declared using `throws`.
    - Examples: IOException, SQLException, FileNotFoundException

2. Unchecked Exceptions:
    - Occur at runtime.
    - Not checked at compile-time.
    - Examples: ArithmeticException, NullPointerException

--------------------------------------------------------------------------------
KEYWORDS USED IN EXCEPTION HANDLING:

| Keyword   | Description                                                                 |
|-----------|-----------------------------------------------------------------------------|
| try       | Wraps code that might throw an exception                                    |
| catch     | Catches and handles the exception                                           |
| finally   | Executes cleanup code (always runs, regardless of exception)                |
| throw     | Used to explicitly throw an exception                                       |
| throws    | Declares exceptions that a method might throw                               |

--------------------------------------------------------------------------------
SYNTAX OVERVIEW:

    try {
        // Code that might throw an exception
    } catch (ExceptionType e) {
        // Handling code
    } finally {
        // Optional cleanup code
    }

    throw new ExceptionType("Error message");

    returnType methodName() throws ExceptionType {
        // Method logic
    }

--------------------------------------------------------------------------------
BEST PRACTICES:

    → Catch specific exceptions before generic ones.
    → Never leave catch blocks empty.
    → Use finally or try-with-resources to release resources.
    → Avoid using exceptions for control flow.
    → Use custom exceptions to represent application-specific issues.

--------------------------------------------------------------------------------
BENEFITS:

    - Improves program reliability and stability.
    - Makes debugging and maintenance easier.
    - Separates error-handling logic from normal logic.

================================================================================
*/


package com.surja.exceptionHandling.basices;

public class BasicsOfException {
    public static void main(String[] args) {
        //let's create an exception and handled it
        try{
            int a =1;
            int b =0;
            System.out.println("a / b = "+ a/b);

        }catch (ArithmeticException e){
            System.out.println("Zero division exception...");
        }
    }
}
