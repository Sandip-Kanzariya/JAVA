package com.learn.zonlyjavaconfig;

import org.springframework.stereotype.Component;

//@Component // useful when we have For xml file and without method in JavaConfig.java

public class Student {

	private Drink drink;

	public Student(Drink drink) {
		super();
		this.drink = drink;
	}

	public Drink getDrink() {
		return drink;
	}

	public void setDrink(Drink drink) {
		this.drink = drink;
	}

	public void study() {
		drink.print();
		System.out.println("Hey you are in study room !");
	}
}
