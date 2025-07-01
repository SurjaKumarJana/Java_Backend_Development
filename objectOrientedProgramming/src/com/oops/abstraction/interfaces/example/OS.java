package com.oops.abstraction.interfaces.example;
/*
what does it mean by OS here?

            it is just like a contract which promises to give the services like
            and os must manage ram, cpu, HD , SSD etc.
            this is the meaning of interface

            it also means that  it is saying the  os must have this functionality
            but how it will provide this things, it is the responsibility of  the specific os itself,

 */
/*
    in an interface all the data members are public, static, final
            we can have
                      1 abstract
                      2 default -> to support backward compatibility
                      3 static methods

                      default and static methods must have bodies with it
 */
/*
    now what is backward compatibility?
        backward compatibility means when we make a change on the old code used in the software , that does
        not make issues with it's implementations,
        means the new version of the code is campatible with it's older implementations

    like if we add and extra feature in the OS , then we can see issues with all the implemetations
    we have to implement this new feature to all of this classes
    too resolve that we use default method
    when we
 */
public interface OS {

    public void manageCPU();

    public void manageRAM();

    public void manageHD();

    public void manageSSD();

    public void manageNIC();

    default String getGps(){
        return "Not Supported...";
    }
}
