package com.learn.sconstructorei;

public class Person {

	private int personId;
	private String name;
	private Certi certi;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int personId, String name, Certi certi) {
		super();
		this.personId = personId;
		this.name = name;
		this.certi = certi;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Certi getCerti() {
		return certi;
	}

	public void setCerti(Certi certi) {
		this.certi = certi;
	}

	@Override
	public String toString() {
		return this.name + ": " + this.personId + " { " + this.certi + " } ";
	}
}
