package com.warrior.string.ownimutableclass;

public final class Student {



	private final int rollNo;
	private final String name;
	private final Address address;

	/*
	 * public Student() { this.rollNo = 0; this.name = ""; this.address = ""; }
	 */

	public Student(int rollNo, String name, Address address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		
//		this.address = address;
		
		Address clonedAddr = new Address();
		clonedAddr.setPin(address.getPin());
		clonedAddr.setCity(address.getCity());
		this.address = clonedAddr;
	}

	public int getRollNo() {
		return rollNo;
	}


	public String getName() {
		return name;
	}


	public Address getAddress() {
		Address dummyAddr = new Address();
		dummyAddr.setPin(this.address.getPin());
		dummyAddr.setCity(this.address.getCity());
//		return address;
		return dummyAddr;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
	}
	
	
	

}