package com.surja.funtionalInterface.buildInFunctionalnterface.supplier;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {


        // this interface is helpfull when we have to get the output only
        // like generating some test cases
        // it has a abstract method .get()

        Supplier<Double> randomNum = () -> Math.random();
        System.out.println(randomNum.get());
    }
}
