package com.oops.abstraction.interfaces.example.os;

import com.oops.abstraction.interfaces.example.OS;
/*
 here the Android is a OS , that means it promises to give the services that  an os must have

 this Andriod class must implement all the methods of OS ,each and every  method

 */
public class Android implements OS {
    @Override
    public void manageCPU() {
        System.out.println();
    }

    @Override
    public void manageRAM() {

    }

    @Override
    public void manageHD() {

    }

    @Override
    public void manageSSD() {

    }

    @Override
    public void manageNIC() {

    }
}
