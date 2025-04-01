package com.rbu.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig object");
	}

	@Bean
	public Date createDate() {
		System.out.println("createDate method");
		return new Date();
	}

}
