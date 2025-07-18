package org.surja.di;

public class Car {
    private String name;
    private Engine engine;

    //this is an example of tight coupling
    public Car() {
        this.name = "Tata Punch";
        this.engine = new Engine("Punch Engine",1200);

    }
    // this is example of loss coupling
    public Car(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }
}
