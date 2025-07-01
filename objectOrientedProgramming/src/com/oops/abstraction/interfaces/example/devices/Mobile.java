package com.oops.abstraction.interfaces.example.devices;

import com.oops.abstraction.interfaces.example.IndianGovNorm;
import com.oops.abstraction.interfaces.example.IndianITDeptNorm;
import com.oops.abstraction.interfaces.example.OS;

public class Mobile extends Device implements IndianGovNorm, IndianITDeptNorm {

    final String screenSize="16:9";

    public Mobile(String modelname, OS os) {
        this.modelName = modelname;
        this.os = os;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "modelName='" + modelName + '\'' +
                ", IMEINo='" + IMEINo + '\'' +
                ", screenSize='" + screenSize + '\'' +
                ", os=" + os.getClass() +
                '}';
    }

    @Override
    public void method1() {

    }

    @Override
    public void indianGovtNorm() {
        
    }
}
