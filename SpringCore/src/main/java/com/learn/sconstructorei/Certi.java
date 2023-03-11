package com.learn.sconstructorei;

public class Certi {
	private String gender;

	public Certi(String gender) {
		super();
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return this.gender;
	}

}
