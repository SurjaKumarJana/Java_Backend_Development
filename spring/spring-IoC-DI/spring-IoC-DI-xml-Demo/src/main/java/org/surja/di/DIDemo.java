package org.surja.di;

public class DIDemo {

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println(car1);
        System.out.println(car2);

        Engine engine = new Engine("Xyz to sppeed", 2500);
        Car car3 = new Car("Tata Hexa",engine);// Constructor-based DI
        Car car4 = new Car("Thar", engine);
        System.out.println(car3);
        System.out.println(car4);

        car1.setName("Tata Tiago");// setter based DI
        car1.setEngine(engine);
        System.out.println(car1);


    }
}
