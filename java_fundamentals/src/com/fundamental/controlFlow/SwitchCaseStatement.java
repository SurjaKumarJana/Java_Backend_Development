/*
 * =============================================
 *          FLOW CONTROL - SWITCH CASE
 * =============================================
 *
 * -> The `switch` statement is used to select one of many blocks of code
 *    to be executed based on the value of a variable or expression.
 *
 * -> It is an alternative to multiple if-else-if statements when comparing the same variable.
 *
 *
 * SYNTAX:
 * ---------------------------------------------
 *    switch (expression) {
 *        case value1:
 *            // code block
 *            break;
 *        case value2:
 *            // code block
 *            break;
 *        ...
 *        default:
 *            // default block
 *    }
 *
 *
 * -> The `expression` must result in one of the following types:
 *    - byte, short, int, char, String, or enum
 *
 *
 * EXAMPLE:
 * ---------------------------------------------
 *    int day = 3;
 *    switch (day) {
 *        case 1:
 *            System.out.println("Monday");
 *            break;
 *        case 2:
 *            System.out.println("Tuesday");
 *            break;
 *        case 3:
 *            System.out.println("Wednesday");
 *            break;
 *        default:
 *            System.out.println("Other day");
 *    }
 *
 * -> Output: Wednesday
 *
 *
 * IMPORTANT POINTS:
 * ---------------------------------------------
 * -> Each `case` must end with a `break;` to prevent fall-through.
 * -> If `break` is not used, the control continues to next case(s).
 * -> `default` block is optional and runs when no case matches.
 * -> `switch` is more readable and faster than multiple if-else chains.
 *
 *
 * SWITCH WITH STRING (Java 7+):
 * ---------------------------------------------
 *    String role = "admin";
 *    switch (role) {
 *        case "admin":
 *            System.out.println("Access granted");
 *            break;
 *        case "user":
 *            System.out.println("Limited access");
 *            break;
 *        default:
 *            System.out.println("No access");
 *    }
 *
 *
 * FALL-THROUGH EXAMPLE (Without break):
 * ---------------------------------------------
 *    int x = 2;
 *    switch (x) {
 *        case 1:
 *        case 2:
 *        case 3:
 *            System.out.println("x is 1, 2, or 3");
 *            break;
 *        default:
 *            System.out.println("x is something else");
 *    }
 *
 */

package com.fundamental.controlFlow;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        // lets see a simple switch case statement
        int dayIndex = 3;
        switch (dayIndex){
            case 0:
                System.out.println("Today is Sunday");
                break;
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thusday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Wrong input");
                break;
            // not needed as this is the default condition
            // it will be checked if any one of the above is not satisfied





        }
    }
}
