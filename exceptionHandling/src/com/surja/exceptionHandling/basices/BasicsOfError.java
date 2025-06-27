/*
================================================================================
                                ERRORS IN JAVA
================================================================================

Purpose:
    Errors in Java represent serious problems that arise beyond the control
    of the application. Unlike exceptions, errors usually indicate system-level
    issues that cannot or should not be handled by the program.

--------------------------------------------------------------------------------
WHAT IS AN ERROR?
        Errors represent irrecoverable conditions such as Java virtual machine (JVM)
running out of memory, memory leaks, stack overflow errors, library incompatibility,
infinite recursion, etc. Errors are usually beyond the control of the programmer,
and we should not try to handle errors.

    - An error is a subclass of Throwable.
    - Represents critical issues in the JVM or environment.
    - Errors are unchecked (not required to be caught or declared).



--------------------------------------------------------------------------------
ERROR vs EXCEPTION:

| Feature           | Error                                 | Exception                            |
|---------------- --|---------------------------------------|--------------------------------------|
| Severity          | Critical (usually unrecoverable)      | Less severe (can often be handled)   |
| Package           | java.lang.Error                       | java.lang.Exception                  |
| Handling          | Not meant to be handled in code       | Can be caught and handled            |
| Example           | OutOfMemoryError                      | IOException, ArithmeticException     |
| Cause             | JVM or system-related issues          | Program logic or external conditions |

--------------------------------------------------------------------------------
WHEN TO HANDLE ERRORS:

    - Generally, you should NOT catch Errors in your code.
    - They signal problems that should be fixed in the environment or JVM.
    - However, in some specific cases (like logging OutOfMemoryError),
      they can be caught for graceful shutdown or alerts.

--------------------------------------------------------------------------------
BEST PRACTICES:

    → Avoid catching Error unless you have a very specific reason.
    → Focus on writing efficient, memory-safe code to prevent common errors.
    → Use profiling and monitoring tools to detect memory leaks or deep recursion.

--------------------------------------------------------------------------------
COMMON ERROR EXAMPLES:

    - OutOfMemoryError: When the JVM runs out of heap memory.
    - StackOverflowError: When a recursive call goes too deep.
    - NoClassDefFoundError: When the class definition is missing at runtime.

================================================================================
*/

package com.surja.exceptionHandling.basices;

public class BasicsOfError {
}
