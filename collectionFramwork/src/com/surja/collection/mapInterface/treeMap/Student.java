package com.surja.collection.mapInterface.treeMap;

public class Student {
    private String name;
    private int rollNo;
    private String deptName;


    public Student(int rollNo, String name, String deptName) {
        this.rollNo = rollNo;
        this.name = name;
        this.deptName = deptName;
    }

    public int getRollNo() {
        return rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
