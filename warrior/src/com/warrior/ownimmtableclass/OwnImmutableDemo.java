package com.warrior.ownimmtableclass;

public class OwnImmutableDemo {
	public static void main(String[] args) {
		Address a = new Address(101, "pune");
		Employee e1 = new Employee(1001, "Ram", a);
		System.out.println(a);
		a.city = "mumbai";
		e1.getAddress().city = "Dubai";
		System.out.println(a);
		System.out.println(e1);

	}
}
