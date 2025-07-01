package com.oops.abstraction.interfaces.example;

import com.oops.abstraction.interfaces.example.devices.Laptop;
import com.oops.abstraction.interfaces.example.devices.Mobile;
import com.oops.abstraction.interfaces.example.os.Android;
import com.oops.abstraction.interfaces.example.os.Ubantu;
import com.oops.abstraction.interfaces.example.os.Windows;

public class ExampleDemo {
    public static void main(String[] args) {

        // creating an os object
        Ubantu ubantu = new Ubantu();
        Windows windows = new Windows();
        Android android = new Android();

        // creating an Laptop object
        Laptop laptop1 = new Laptop("Hp victous",ubantu);
        System.out.println(laptop1);
        Laptop laptop2 = new Laptop("Asus ROG",windows);
        System.out.println(laptop2);
        // creating Mobile object
        Mobile mobile = new Mobile("Samsung s23", android);
        System.out.println(mobile);
    }
}
