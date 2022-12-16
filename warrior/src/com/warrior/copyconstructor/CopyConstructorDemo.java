package com.warrior.copyconstructor;

public class CopyConstructorDemo {
	public static void main(String[] args) {
		Address addr=new Address(1555,"pune");
		Employee e=new Employee(1001,"ram",addr);
		
		
		Employee e2=new Employee(e);
		System.out.println(e);
		System.out.println(e2);
		System.out.println("/////////////////////////////////////////////////////////////////////////////");
		
		e2.addr.city="Mumbai";
		System.out.println(e);
		System.out.println(e2);
		
		
		
	}

}
