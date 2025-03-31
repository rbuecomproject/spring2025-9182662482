package com.rbu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//disable DataSourceAutoConfiguration
public class DiSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiSbApplication.class, args);
	}

}
