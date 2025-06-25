package com.oops.accessmodifiers;

public class Person {
    private String name;            // Accessible only inside Person
    int age;                        // Default access → package-level
    protected String address;       // Accessible to subclasses and same package
    public String nationality;      // Accessible from anywhere

    public void showInfo() {
        System.out.println(name + ", " + age + ", " + address + ", " + nationality);
    }
}
