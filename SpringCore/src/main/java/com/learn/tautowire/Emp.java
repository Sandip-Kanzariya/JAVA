package com.learn.tautowire;

public class Emp {
	private Address address;

	public Emp() {
		super();
	}

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Address Constructor : ");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Address Setter : ");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
