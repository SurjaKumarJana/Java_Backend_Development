package com.oops.abstraction.interfaces;

class HatchbackCar implements Car {


    @Override
    public void start() {
        System.out.println("HatchbackCar  is started...");

    }
    @Override
    public void stop() {
        System.out.println("HatchbackCar  is stopped...");

    }
}