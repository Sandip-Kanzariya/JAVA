package com.learn.tautowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

//	@Autowired
	private Address address;

	public Emp() {
		super();
	}

//	@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Address Constructor : ");
	}

	public Address getAddress() {
		return address;
	}

	@Autowired
	@Qualifier("address13")
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Address Setter : ");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
