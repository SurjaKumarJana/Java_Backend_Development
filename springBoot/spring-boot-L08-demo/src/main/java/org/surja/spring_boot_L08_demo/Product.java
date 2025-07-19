package org.surja.spring_boot_L08_demo;

public class Product {

    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
