/*
in this program we will take a input string and check if the user exists or not, if not exists then add
other wise display error
 */
package com.surja.exceptionHandling.userDefineException;

public class UserCheckProgram {
    public static void main(String[] args) {
        // creating new user list
        UserList ul = new UserList();
        ul.addUser("Ram");
        ul.addUser("Arun");
        ul.addUser("Tarup");
        ul.addUser("Viki");

        try {
            ul.findUser("Arun");
        }catch (CustomException ex){
            System.out.println(ex.getMessage());
        }

    }
}
