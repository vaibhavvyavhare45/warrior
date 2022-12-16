package com.warrior.copyconstructor;

public class Employee {
	int id;
	String name;
	Address addr;
	public Employee() {
		super();
	}
	
	
	public Employee(int id, String name, Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
	}


	public Employee(Employee e)  {///copy constructor
		super();
		this.id =e. id;
		this.name =e. name;
		Address addr=new Address(e.addr);
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}
	

}
