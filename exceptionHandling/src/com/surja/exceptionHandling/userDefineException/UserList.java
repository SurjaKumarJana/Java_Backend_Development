package com.surja.exceptionHandling.userDefineException;

import java.util.ArrayList;
import java.util.List;

class UserList {

    // list of user
    List<String> userList = new ArrayList<>();

    // check if user exits or not...
    public void findUser(String name) throws CustomException{
        if(userList.contains(name)){
            throw new CustomException("Falied..."+name+"  already Exists");
        }
        else{
            addUser(name);
        }

    }
    //add user to list
    public void addUser(String name){
        userList.add(name);
        System.out.println(name +" is added successfully...");
    }

}
