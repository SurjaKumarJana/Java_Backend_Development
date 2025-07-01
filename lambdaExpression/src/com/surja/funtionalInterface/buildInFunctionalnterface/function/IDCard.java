package com.surja.funtionalInterface.buildInFunctionalnterface.function;

public class IDCard {
    String StdID ;

    public IDCard(String stdID) {
        StdID = stdID;
    }

    @Override
    public String toString() {
        return "IDCard{" +
                "StdID='" + StdID + '\'' +
                '}';
    }
}
