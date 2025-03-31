package com.rbu.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DBConfig {
	@Value("${rbu.datasource.driver-class-name}")
	private String driver;
	@Value("${rbu.datasource.url}")
	private String url;
	@Value("${rbu.datasource.username}")
	private String username;
	@Value("${rbu.datasource.password}")
	private String password;
	
//	<bean class="HikariDource">
//	<proerty name="driverClass" value="">
//	</bean>
	@Bean
	public DataSource getDataSource() {
		HikariDataSource ds = new HikariDataSource();
		ds.setDriverClassName(driver);
		ds.setJdbcUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		ds.setMaximumPoolSize(10);
		ds.setMinimumIdle(1000*10);
		ds.setConnectionTimeout(1000*10);
		ds.setIdleTimeout(1000*10);
		ds.setAutoCommit(true);
		return ds;
	}
	
	
	
	
}
