package com.learn.slifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

//		ApplicationContext context = new ClassPathXmlApplicationContext("com/learn/slifecycle/lconfig.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/learn/slifecycle/lconfig.xml");

		System.out.println("+++++++++++++++++++++Using XML : ++++++++++++++++++++++++++++++++===================== ");
		Thing thing = (Thing) context.getBean("thing");

		System.out.println(thing);

		// For call destroy method
		context.registerShutdownHook();

		System.out.println(
				"+++++++++++++++++++++Using Interfaces : ++++++++++++++++++++++++++++++++===================== ");

		Drink drink = (Drink) context.getBean("d1");
		System.out.println(drink);

		System.out.println(
				"+++++++++++++++++++++Using Annotations : ++++++++++++++++++++++++++++++++===================== ");

		Annotation ann = (Annotation) context.getBean("exp");
		System.out.println(ann);

	}

}
