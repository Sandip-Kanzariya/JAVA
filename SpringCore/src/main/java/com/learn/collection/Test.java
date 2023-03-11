package com.learn.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/learn/collection/cconfig.xml");

		Emp emp1 = (Emp) context.getBean("emp1");

		System.out.println("Name : " + emp1.getName());
		System.out.println("Phone : " + emp1.getPhones());
		System.out.println("Addresses : " + emp1.getAddresses());
		System.out.println("Courses : " + emp1.getCourses());
		System.out.println("Properties : " + emp1.getProp());

		System.out.println("==++++++++++++++++++++++++++++++==");
		System.out.println("For Standalone Collections : " + emp1.getPhones().getClass().getName());
		System.out.println("For Standalone Collections : " + emp1.getAddresses().getClass().getName());
		System.out.println("For Standalone Collections : " + emp1.getCourses().getClass().getName());
	}

}
