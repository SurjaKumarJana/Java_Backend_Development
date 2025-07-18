package org.surja.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIoCDemo {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("projectbeans.xml");

        Engine engine = applicationContext.getBean("engine1",Engine.class);
        System.out.println(engine);
        Engine engine1 = applicationContext.getBean("engine1",Engine.class);
        System.out.println(engine1);

        System.out.println(engine == engine1);//true as the scope of engine1 is singleton

        Engine engine2 = applicationContext.getBean("engine2", Engine.class);
        System.out.println(engine2);
        Engine engine3 = applicationContext.getBean("engine2", Engine.class);
        System.out.println(engine3);

        System.out.println(engine2 == engine3);// false  as the scope of engine2 is prototype
        // all the instances will be different

    }
}
