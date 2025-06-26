package com.oops.polymorphism.compileTimePolymorphism;

public class compileTimePolymorphismDemo {
    public static void main(String[] args) {
        // Creating an object of CalculateSum class
        CalculateSum cs = new CalculateSum();

        //this is compile time polymorphism
        // here compiler  decides which method to call at the compilation time
        // based on the method's signature
        System.out.println(cs.sum(5,7));
        System.out.println(cs.sum(8,5,9));
        System.out.println(cs.sum(2.3,77.5));
    }
}
