package com.learn.zonlyjavaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

//		Student student = context.getBean("sandip", Student.class); // Without Bean name

		// With Bean name
		Student student = context.getBean("sandip", Student.class); //
		System.out.println(student);
		student = context.getBean("student", Student.class); //
		System.out.println(student);

		student.study();

	}

}
