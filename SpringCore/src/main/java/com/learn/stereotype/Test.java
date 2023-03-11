package com.learn.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/learn/stereotype/stereotypeconfig.xml");

//		Student student = context.getBean("student", Student.class);
		Student student = context.getBean("ob", Student.class);

		System.out.println(student);

		System.out.println(student.getAddress());

		System.out.println(student.getAddress().getClass().getName());

		System.out.println(
				"+++++++++++++++++++++++++++++++ Scope : Singleton / Prototype [Change Annotation ]++++++++++++++++++++++++++++");

		System.out.println("0 : " + student.hashCode());
		Student student1 = context.getBean("ob", Student.class);
		System.out.println("1 : " + student1.hashCode());

		System.out.println(
				"+++++++++++++++++++++++++++++++ Scope : Prototype (Scope in xml) +++++++++++++++++++++++++++++++++++++++++");
		Teacher t1 = context.getBean("t", Teacher.class);
		Teacher t2 = context.getBean("t", Teacher.class);

		System.out.println("1. : " + t1.hashCode());
		System.out.println("2. : " + t2.hashCode());
	}

}
