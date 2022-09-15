package com.warrior.constructor;

public class Employee {
	int id;
	String nm;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String nm) {

		this.id = id;
		this.nm = nm;
	}

//	public static void main(String[] args) {
//
//	}
}

class Bank extends Employee {
	
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	Bank(int id, String nm) {
		super(id, nm);
	}

	public static void main(String[] args) {

		Employee s = new Employee(12, "ybubsa");
		System.out.println(s);

	}
}
