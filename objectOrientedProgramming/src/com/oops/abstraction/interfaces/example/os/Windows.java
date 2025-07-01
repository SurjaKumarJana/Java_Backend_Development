package com.oops.abstraction.interfaces.example.os;

import com.oops.abstraction.interfaces.example.OS;
/*
 here the Windows is a OS , that means it promises to give the services that  an os must have

 this Windows class must implement all the methods of OS ,each and every  method
 */
public class Windows implements OS {
    @Override
    public void manageCPU() {

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

