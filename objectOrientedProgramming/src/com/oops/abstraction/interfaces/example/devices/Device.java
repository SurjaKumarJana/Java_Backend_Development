package com.oops.abstraction.interfaces.example.devices;

import com.oops.abstraction.interfaces.example.OS;

// this class defines a Device means what propertise does a device have
// and what a device can do
public class Device {

    String modelName;
    String IMEINo;
    OS os;


    public void turnOn(){
        System.out.println("Device started...");
    }
    public void turnOff(){
        System.out.println("Device turned off...");
    }
}
