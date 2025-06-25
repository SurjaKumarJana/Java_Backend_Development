/*
Design a class as described below.

class: MyUser
instance variable: name(String)
constructor:
First: { parameter: none, task: initialize the instance variable to "Default".}
Second: { parameter: name(String), task: initialize the instance variable to
the value provided in the parameter.}
 */
package com.oops.classAndObject.classDemo.practice;

class MyUser{
    String name;
    public MyUser(){
        this.name = "Default";
    }
    public MyUser(String name){
        this.name = name;
    }
}

public class ConstractorOverLoading {
}
