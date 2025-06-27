/*
================================================================================
                            TYPES OF EXCEPTIONS IN JAVA
================================================================================

    In Java, exceptions are events that disrupt the normal flow of execution.
    They are represented by objects derived from the Throwable class.
    Throwable has two direct children: Exception and Error.

================================================================================
THROWABLE CLASS HIERARCHY WITH SUBTYPES:


                         java.lang.Object
                               |
                         java.lang.Throwable
                               |
        --------------------------------------------------------------------
        |                                                                  |
   java.lang.Error                                                  java.lang.Exception
        |                                                                  |
    ---------------------------                                    -------------------------------
    |                         |                                    |                             |
VirtualMachineError      LinkageError                     Checked Exceptions        Unchecked Exceptions
    |                         |                              (Compile-Time)             (Runtime)
    |                         |                                   |                       |
    |                         |                                   |                  RuntimeException
    |                         |                                   |                       |
OutOfMemoryError     NoClassDefFoundError                IOException            ArithmeticException
StackOverflowError   UnsatisfiedLinkError                SQLException           NullPointerException
                                                        FileNotFoundException   ArrayIndexOutOfBoundsException
                                                        InterruptedException    ClassCastException
                                                                                NumberFormatException


================================================================================
1. CHECKED EXCEPTIONS (Compile-Time):

    - Must be declared in method signature or handled via try-catch.
    - Typically caused by external resources: files, databases, threads, etc.

    Common Classes:
        → IOException
        → SQLException
        → ClassNotFoundException
        → FileNotFoundException
        → InterruptedException

================================================================================
2. UNCHECKED EXCEPTIONS (Runtime):

    - Subclasses of RuntimeException.
    - Not checked by the compiler.
    - Usually indicate bugs in the program.

    Common Classes:
        → ArithmeticException
        → NullPointerException
        → ArrayIndexOutOfBoundsException
        → NumberFormatException
        → ClassCastException
        → IllegalArgumentException
        → IllegalStateException

================================================================================
3. ERRORS:

    - Represent critical system-level problems.
    - Not intended to be caught or handled.
    - Occur due to issues in the JVM or environment.

    Common Classes:
        → OutOfMemoryError
        → StackOverflowError
        → NoClassDefFoundError
        → InternalError
        → AssertionError

================================================================================
4. CUSTOM EXCEPTIONS:

    - User-defined exceptions created by extending Exception or RuntimeException.
    - Useful for enforcing application-specific rules.

    Example:
        class MyException extends Exception {
            public MyException(String msg) {
                super(msg);
            }
        }

================================================================================
KEY DIFFERENCES SUMMARY:

| Feature              | Checked Exception         | Unchecked Exception              | Error                         |
|----------------------|---------------------------|----------------------------------|-------------------------------|
| Checked by Compiler  | Yes                       | No                               | No                            |
| Inheritance          | Extends Exception         | Extends RuntimeException         | Extends Error                 |
| Handling Required    | Must handle or declare    | Optional                         | Not meant to be handled       |
| Occurs Due To        | External resources        | Logical/programming errors       | System/JVM failures           |
| Examples             | IOException, SQLException | NullPointerException, Arithmetic |OutOfMemoryError, StackOverflow|

================================================================================
*/



package com.surja.exceptionHandling.basices;

public class HiracheyDemo {
}
