package com.surja.funtionalInterface.buildInFunctionalnterface.function;

public class Student extends Person{

    long rollNo;

    public Student( String name ,int age, long rollNo) {
        super( name, age);
        this.rollNo = rollNo;
    }

    public void study(){
        System.out.println("Student is studying");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", age=" + age +
                '}';
    }
}
