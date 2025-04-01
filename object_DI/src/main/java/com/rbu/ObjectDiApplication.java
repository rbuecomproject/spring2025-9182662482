package com.rbu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rbu.util.ApplicationConstants;

@SpringBootApplication
public class ObjectDiApplication {

	public static void main(String[] args) {
	ApplicationContext ap=SpringApplication.run(ObjectDiApplication.class, args);
	ApplicationConstants apc=ap.getBean(ApplicationConstants.class);
	System.out.println(apc.toString());
	}

}
