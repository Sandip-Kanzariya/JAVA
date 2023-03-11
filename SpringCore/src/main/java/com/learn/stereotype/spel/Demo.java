package com.learn.stereotype.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("#{25 + 89}")
	private int x;

	@Value("#{45 + 87}")
	private int y;

//	@Value("#{T(java.lang.Math).sqrt(36)}") // Static Method

//	@Value("#{T(java.lang.Math).E}") // Static Variable
	@Value("#{T(java.lang.Math).PI}") // Static Variable

	private double z;

	// Object of any class

	@Value("#{new java.lang.String('Sandip')}")
	private String name;

	@Value("#{ 6 > 8 - 4}")
	private boolean isFlag;

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", name=" + name + ", isFlag=" + isFlag + "]";
	}

}
