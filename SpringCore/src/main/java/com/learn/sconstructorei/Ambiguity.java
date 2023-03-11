package com.learn.sconstructorei;

public class Ambiguity {

	private int a, b;

	public Ambiguity(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;

		System.out.println("Call double, double");
	}

	public Ambiguity(int a, int b) {
		this.a = a;
		this.b = b;

		System.out.println("Call int, int");
	}

	public Ambiguity(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);

		System.out.println("Call String, String");
	}

	public void doSum() {
		System.out.println(a + b);
	}

	@Override
	public String toString() {
		return "Ambiguity [a=" + a + ", b=" + b + "]";
	}

}
