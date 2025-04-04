package com.rbu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@SpringBootApplication having component scan power on and
//it will scan classes from default package and its child
// and the classes should have annotations
//@Controller, @Service, @Repository, @Component, @Configuration, @Bean,@RestController,

@SpringBootApplication(scanBasePackages = {"com.rbu","com.abcd"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
