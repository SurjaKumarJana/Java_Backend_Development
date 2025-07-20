package org.surja.logging_mvc_annotations_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.surja.loginService","org.surja.logging_mvc_annotations_demo"})
// when we needs bean of different package , we have to mention about those packages here
// by default spring framework scan for the bean in the same package where main class present
public class LoggingMvcAnnotationsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggingMvcAnnotationsDemoApplication.class, args);
	}

}
