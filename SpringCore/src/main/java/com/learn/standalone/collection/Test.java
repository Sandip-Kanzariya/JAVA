package com.learn.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/learn/standalone/collection/aloneconfig.xml");

		Person p = context.getBean("person1", Person.class);

		System.out.println(p);

		System.out.println("Type : " + p.getFriends().getClass().getName());
		System.out.println("Type : " + p.getFee().getClass().getName());

		System.out.println("Type : " + p.getProp().getClass().getName());
	}
}
