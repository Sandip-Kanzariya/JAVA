package com.learn.slifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Drink implements InitializingBean, DisposableBean {
	private int price;

	public Drink() {
		super();
	}

	public Drink(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Drink [price=" + price + "]";
	}

	// init
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init : starting drink");
	}

	// Distroy
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy : ending drink");
	}

}
