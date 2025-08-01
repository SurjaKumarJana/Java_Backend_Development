package com.surja.aop_jdbc_demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/*
 AOP in Spring Boot

 AOP (Aspect-Oriented Programming) is used to separate cross-cutting concerns
 such as logging, security, and transactions from the main business logic.
*/

/*
 Key Terms:
 - Aspect       : Class that contains cross-cutting logic (@Aspect)
 - Advice       : Code that runs at a specific join point (@Before, @After, etc.)
 - Join Point   : A specific point in execution (e.g., method call)
 - Pointcut     : Expression that matches join points
 - Weaving      : Linking aspects to target code at runtime
*/

/*
 Common Annotations:
 - @Aspect          : Declares the class as an aspect
 - @Component       : Registers the aspect as a Spring bean
 - @Before          : Runs before the target method
 - @After           : Runs after the target method
 - @AfterReturning  : Runs if method completes successfully
 - @AfterThrowing   : Runs if method throws an exception
 - @Around          : Runs before and after the method execution
*/


@Aspect
@Component
public class SampleAspect {

    private static Logger LOGGER = LoggerFactory.getLogger(SampleAspect.class);

    // drawback of these lines of code is
    // ----> we have to do this for every methods and also mention the method

//    @Before("execution(* com.surja.aop_jdbc_demo.service.ProductService.getById(..))")
//    public void beforeMethod(){
//        LOGGER.info("Executing  some code before calling ProductService.getID(..) method");
//
//        //any thing that we want to perform
//        // before calling the ProductService.getID(..) method we will do here
//    }

//    @After("execution(* com.surja.aop_jdbc_demo.service.ProductService.getById(..))")
//    public void beforeMethod(){
//        LOGGER.info("Executing  some code after calling ProductService.getID(..) method");
//
//        //any thing that we want to perform
//        // before calling the ProductService.getID(..) method we will do here
//    }

    // solution
    // -----> use annotation

    @Before("@annotation(com.surja.aop_jdbc_demo.aspect.LogDetails)")
    public void aroundMethod(){
        LOGGER.info("Executing some code before and after method");
    }



}
