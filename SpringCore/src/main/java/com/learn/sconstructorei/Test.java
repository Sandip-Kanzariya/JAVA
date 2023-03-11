package com.learn.sconstructorei;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/learn/sconstructorei/ciconfig.xml");

		Person person = (Person) context.getBean("person");

		System.out.println(person.getPersonId());
		System.out.println(person.getName());

		System.out.println(person);

		Person p = (Person) context.getBean("p");
		System.out.println(p);

		Ambiguity add = (Ambiguity) context.getBean("add");
		System.out.println(add);
		add.doSum();

	}

}
