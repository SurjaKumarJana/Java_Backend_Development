package com.surja.funtionalInterface.buildInFunctionalnterface.predicate;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        // if we have a Functional interface whose return type is boolean
        // instead of creating our own functional interface we can use Presdicate interface
        // which is avaaible from java 1.8
        // this interface have only one single method test(T t);

        //below is the example of the code we have created to check the odd or even number

        Check<Integer> checkEven = (x)-> x%2==0;
        Check<Integer> checkOdd = (x)->  x%2!=0;
        System.out.println("checkEven x =5 :"+checkEven.check(5));
        System.out.println("checkOdd x =5 :"+checkOdd.check(5));


        // we can do the same operation without creating a new functional interface
        // by using Predicate<T> interface

        Predicate<Integer> checkEven2 = (x)-> x%2==0;
        Predicate<Integer> checkOdd2 = (x)->  x%2!=0;
        System.out.println("checkEven by Predicate x =5 :"+checkEven2.test(5));
        System.out.println("checkOdd by Predicatex =5 :"+checkOdd2.test(5));

        Predicate<Person> checkVoterEligibility = (person) -> person.age>=18;
        Person person = new Person("Rahul",18);
        System.out.println(checkVoterEligibility.test(person)?"yes elgibile":"not eligible");



        // we can have three usefull methods in predicate
        /*
        .add(predicate)
        .or(predicate)
        .nagate(predicate)
         */

        Predicate<Integer> checkSingleDigit = (x) -> x<10;

        Predicate<Integer> check = checkEven2.and(checkSingleDigit);
        System.out.println(check.test(5));// output = false : false && true

        check = checkOdd2.and(checkSingleDigit);
        System.out.println(check.test(5));//output true : true || true

        check = checkEven2.negate();
        System.out.println(check.test(5));//output true :  !false
    }

}
