/*
╔═══════════════════════════════════════════════
║            Functions in Java                 ║
╚═══════════════════════════════════════════════

What is a Function?
- A function (called "method" in Java) is a block of code that performs a specific task.
- It helps reduce code repetition and improves readability.

Syntax:
returnType functionName(parameters) {
    // code
    return value; // if not void
}

Example:

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sum = add(4, 6);
        System.out.println("Sum: " + sum);
    }

Key Points:
- 'void' means the method does not return anything.
- 'static' allows you to call the method without creating an object.
- Parameters are optional — methods can take zero or more inputs.
- The return type must match the value returned.

Common Mistakes:
- Missing return value for non-void methods.
- Forgetting to mark the method as 'static' when calling it from 'main'.

Tips:
- Use meaningful and descriptive function names.
- Keep functions short and focused on one task.

*/


package com.fundamental.function;

public class BasicsOfFunction {

    // this is our main method
    public static void main(String[] args) {
        // calling a method
        printHello(10);
        // we can see that hello is printed on the screen 10 times

    }

    // this is a method that is inside the class BasicsOfFunction
    // as it is called by a static method (main), hence it is declared as static
    static void printHello(int times){
        for(int i =1;i<=times; i++){
            System.out.println("Hello "+ i);
        }
    }
}
