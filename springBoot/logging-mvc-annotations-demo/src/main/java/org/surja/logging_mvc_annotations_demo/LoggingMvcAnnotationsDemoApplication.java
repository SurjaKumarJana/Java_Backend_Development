package org.surja.logging_mvc_annotations_demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.surja.loginService","org.surja.logging_mvc_annotations_demo"})
/* when we needs bean of different package , we have to mention about those packages here
by default spring framework scan for the bean in the same package where main class present
 */
public class LoggingMvcAnnotationsDemoApplication {
	/*
       Logging provides a chronological record of
       what happens inside the application, similar to a diary or journal for software
        */
	private static Logger LOGGER = LoggerFactory.getLogger(LoggingMvcAnnotationsDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LoggingMvcAnnotationsDemoApplication.class, args);

		LOGGER.error("Logging error level");
		LOGGER.warn("Logging warn level");
		LOGGER.info("Logging Info level");
		LOGGER.debug("Logging debug level");
		LOGGER.trace("Logging trace level");

	}

}
