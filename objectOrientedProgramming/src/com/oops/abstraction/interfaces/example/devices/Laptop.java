package com.oops.abstraction.interfaces.example.devices;


import com.oops.abstraction.interfaces.example.*;
/*
here Laptop extends the Device means , a Laptop is a Device . By extending the Device class
we autometically get all the propertise of Device now we can also add some more propertise and also
extra functionality

here Laptop implements the IndianGovNorm, IndianITDeptNorm interfaces means it promises to serve
what is mention in this contracts , this is also an example of multiple interface

as it implements this interfaces it must implements the methods of those interfaces by itself;


if there are two methods with the same name, then a ambiguity will occured which one should be used,
to remove this ambiguity java has a rule , to implement this method by the class itself

like here this two interface have two methods with same name , so in this Laptop class we must implement the method
for this class itself
 */
public class Laptop extends Device implements IndianGovNorm, IndianITDeptNorm {

    // By default this class gets all the propertise of Device , but we can add more
    final String screenSize="1920x1080";

    public Laptop(String modelname, OS os) {
        this.modelName = modelname;
        this.os = os;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screenSize='" + screenSize + '\'' +
                ", modelName='" + modelName + '\'' +
                ", IMEINo='" + IMEINo + '\'' +
                ", os=" + os.getClass() +
                '}';
    }

    // resolving the ambiguity
    @Override
    public void method1() {

    }

    @Override
    public void indianGovtNorm() {

    }
}
