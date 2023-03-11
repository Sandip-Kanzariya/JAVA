package com.learn.zonlyjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

//@ComponentScan(basePackages = "com.learn.zonlyjavaconfig")  // Work in without @Bean annotation

public class JavaConfig {

	@Bean
	public Drink getDrink() {
		return new Drink();
	}

	@Bean(name = { "sandip", "student" }) // Multiple names are allow
//	@Bean
	public Student getStudent() {
		Student student = new Student(getDrink());
		return student;
	}

}
