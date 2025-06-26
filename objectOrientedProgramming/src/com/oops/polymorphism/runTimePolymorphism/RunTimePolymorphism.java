package com.oops.polymorphism.runTimePolymorphism;

public class RunTimePolymorphism {
    public static void main(String[] args) {

        // creating a new car object using the super class Car referrence
        Car car = new Car();
        // calling the sound method
        car.sound();

        // changing the referrence now car is referring an object of sedan car
        car = new SedanCar();
        car.sound();

        // changing the referrence now car is referring an object of sedan car
        car = new HatchbackCar();
        car.sound();

        // here we are calling car.sound(); , methods for both three cases
        // but there output is different
        // at the runtime , the jvm will decide which .sound() method is to be invoked based on the
        // type of object

        // this is runtime polymorphism

    }
}
