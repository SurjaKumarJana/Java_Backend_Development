package org.surja.spring_boot_L08_demo;
/**
 * in this program
 *
 * 1.we will learn how to write API using the Spring Boot framework
 *
 * 2. then change the port using application.properties file
 *
 * 3. then change the default tomcat server with jetty or undertow .
 * To achive this , we have to exclude the tomcat's dependency from spring-boot-starter-web
 * and add a jetty's dependency
 *
 * 4. we will modify the application property file in such way that it will run on differnent url
 * depending on different profile
 * API Call to indigo server.
 * a. Developer Machine: dev-testing-API
 * b. Stage Env: stage-API (Testing)
 * c. live ENV: prod indigo API
 *
 *
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //It is the main annotation used to start a Spring Boot application.
public class SpringBootL08DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootL08DemoApplication.class, args);
    }

}
