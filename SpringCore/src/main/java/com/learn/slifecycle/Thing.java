package com.learn.slifecycle;

public class Thing {
	private int price;

	public Thing() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Thing(int price) {
		super();
		System.out.println("Set Properties");
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
		return "Thing [price=" + price + "]";
	}

//	 you can given any name
	public void init() {
		System.out.println("spring init method");
	}

//	 you can given any name
	public void destroy() {
		System.out.println("spring destroy method");
	}

}
