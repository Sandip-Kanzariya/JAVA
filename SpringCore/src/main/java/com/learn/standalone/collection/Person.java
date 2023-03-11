package com.learn.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {

	private List<String> friends;

	private Map<String, String> fee;

	private Properties prop;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, String> getFee() {
		return fee;
	}

	public void setFee(Map<String, String> fee) {
		this.fee = fee;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", fee=" + fee + ", prop=" + prop + "]";
	}

}
