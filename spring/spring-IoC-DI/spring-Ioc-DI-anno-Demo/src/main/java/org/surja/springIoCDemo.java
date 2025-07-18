package org.surja;
/**
 * this is a demo spring project to learn about dependency injection using annotations
 */
/*
===============================
What is Inversion of Control (IoC)?
===============================

- **Inversion of Control (IoC)** is a design principle where the responsibility for creating and managing objects is
given to a framework or container—instead of being handled directly in your code.
- In the context of Spring, the **IoC Container** manages object creation, wiring dependencies, and the overall
lifecycle of these objects (called "beans").

===============================
Why Do We Use IoC?
===============================

- **Decoupling:** IoC reduces direct dependencies between classes, making code easier to maintain.
- **Testability:** Classes are easier to test because their dependencies can be provided externally, allowing
for simpler mocking.
- **Centralized Configuration:** Object creation and configuration are handled in one place, either in XML,
annotation, or Java config.
- **Improved Modularity:** Promotes reusable and modular code by separating configuration from business logic.
- **Reduces Boilerplate:** You don't need to manually manage object dependencies or lifecycle; Spring handles
it for you.

===============================================
Dependency Injection (DI) in Java Spring Framework
===============================================

What is Dependency Injection?
-----------------------------
- Dependency Injection (DI) is a design pattern where the dependencies (objects) a class needs are provided
by an external source rather than the class creating them itself.
- In Spring, DI improves code modularity, testability, and maintainability.

Types of Dependency Injection in Spring
----------------------------------------
1. Constructor Injection:
   - Dependencies are provided via class constructors.
   - Recommended for mandatory dependencies (helps with immutability and testing).


2. Setter Injection:
   - Dependencies are injected as JavaBean properties via setter methods.
   - Useful for optional dependencies.

3. Field Injection:
   - Dependencies are injected directly into fields.
   - Quick to use, but not recommended for testing or immutability.


Configuration Methods
----------------------
- XML-Based DI:
  * Define beans and dependencies in XML files (e.g., applicationContext.xml).
  * Example:
    <bean id="userService" class="com.example.UserService">
        <property name="userRepository" ref="userRepository"/>
    </bean>

- Annotation-Based DI (Preferred for Spring Boot):
  * Use annotations: @Component, @Service, @Repository, @Autowired.
  * Automatically detect and wire beans during component scanning.


*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class springIoCDemo {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("org.surja");
        // org.surja is the package , where all the beans are present

        NotificationService notificationService = applicationContext.getBean("notificationService", NotificationService.class);
        SmsGatewayService smsGatewayService = applicationContext.getBean("smsGatewayService",SmsGatewayService.class);

        notificationService.sendSms("Password : 125478");

        //as the scope is singleton by default , so when notification service bean is created then
        // a smsService bean also created and thats why the below code will get true
        System.out.println(notificationService.getSmsGatewayService() == smsGatewayService);//true



    }
}
