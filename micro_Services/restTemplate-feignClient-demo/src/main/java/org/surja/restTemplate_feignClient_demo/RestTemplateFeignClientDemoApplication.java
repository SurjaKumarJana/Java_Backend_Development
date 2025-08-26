package org.surja.restTemplate_feignClient_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RestTemplateFeignClientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestTemplateFeignClientDemoApplication.class, args);
	}

}
