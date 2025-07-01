

package com.surja.funtionalInterface.buildInFunctionalnterface.consumer;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {


        // consumer is a funtioanal interface that doesn't return any thing
        // it has only one abstract method .accept()
        // it simple take a single input
        // we can add our own implementation

        Consumer<String> convToLower = (s)-> System.out.println(s.toLowerCase());
        Consumer<String> findLength = (s)-> System.out.println(s.length());
        convToLower.accept("SurJA kUMaR JaNA");
        System.out.println();

        // useful methods
        // it is helpful for chainning multipule consumers
        // it execute the other consumer after the current one
        convToLower.andThen(findLength).accept("SurJA kUMaR JaNA");


    }
}
