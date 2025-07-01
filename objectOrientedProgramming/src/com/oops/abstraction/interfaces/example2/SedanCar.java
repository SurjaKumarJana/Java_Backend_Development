package com.oops.abstraction.interfaces;

class SedanCar implements Car {


    @Override
    public void start() {
        System.out.println("Sedan car is started...");

    }
    @Override
    public void stop() {
        System.out.println("Sedan car is stopped...");

    }
}
