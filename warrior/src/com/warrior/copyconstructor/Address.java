package com.warrior.copyconstructor;

public class Address {
	int pin;
	String city;
	public Address() {
		super();
	}
	public Address(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}
	 public Address(Address addr) {//copy constructor
		this.pin=addr.pin;
		this.city=addr.city;
		
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}
	 

}
