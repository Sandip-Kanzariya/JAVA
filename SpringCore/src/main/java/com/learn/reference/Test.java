package com.learn.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/learn/reference/refconfig.xml");

		A temp = (A) context.getBean("aref");

		System.out.println("X in A : " + temp.getX());
		System.out.println("Y in B (B is in A) : " + temp.getOb().getY());
		System.out.println(temp);
	}

}
