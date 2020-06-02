package com.aws.beanstack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsBeanstackApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsBeanstackApplication.class, args);
	}
	
	@GetMapping("/test")
public String testController() {
	return "testing";
	
}
}
