package com.oops.polymorphism.compileTimePolymorphism;

class CalculateSum {
    // methods that returns the sum

    // this is an example of method overloading
    // methdds having same name but differnet number or type of parameter
    // here the return type doesn't matther , the above condition matters

    int sum(int x, int y){
        return  x+y;
    }
    int sum(int x, int y,int z){
        return  x+y+z;
    }
    double sum(double x, double y){
        return x+y;
    }
}
