/*
The encapsulation helps us to restrict the access of states or properties of an object
,means hidding the internal implementation to the out side world and only allow the communication
using methods
this concept is data hiding

example:
if we create an object of student , then the name and roll number must be immutable, we have to
make sure that the name and rollno of the student must be assigned only while creating the object
, after that the this properties can not be modifed
means we have to restrict their access to the out side world ,

how we can achieve this?

we can achive data hiding by using access modifiers and getter and setter methods
if we want to allow to change the state or property of the object , we will provide the  methods to change
or modify the data
if we doesn't want that a perticular data will be changed , then we will not provide the method to change it

 */

package com.oops.encapsulation.dataHiding;

// exmaple class
class Student{

    private String name;
    private int rollNo;
    int age;
    String dept;

    //constractor
    public Student(String name, int rollNo, int age, String dept){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.dept = dept;

    }

    // setter methods
    // we will provide setter methods for those data which we allow to be modifies
    // else we will not provide the setter method for this data
    public void setAge(int age) {
        this.age = age;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    // getter methods
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getAge() {
        return age;
    }

    public String getDept() {
        return dept;
    }

    // methods
    void printDetails(){
        System.out.println("Student name : "+this.name );
        System.out.println("Student rollNo : "+this.rollNo );
        System.out.println("Student age : "+this.age );
        System.out.println("Student dept : "+this.dept );
        System.out.println();
    }
}

public class DataHiding {
    public static void main(String[] args) {
        //creating objects of that student class
        Student s1 = new Student("Ramesh", 1346, 45, "ECE");
        Student s2 = new Student("Arnav", 458, 25, "Data Science");

        s1.printDetails();
        // modifing the details of the student
        s1.setAge(21);
        s1.setDept("CSE AI");

        // now displaying the modified details
        s2.printDetails();
        s1.printDetails();

    }
}
