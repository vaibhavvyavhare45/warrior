package com.warrior.string.ownimutableclass;

public class TestImmutability {
public static void main(String[] args) {
		
		Address ad = new Address(1234,"Pune");
		
		Student s1 = new Student(10, "Ram", ad);
		
		System.out.println("Before changing s1::: "+s1);
		
//		s1.rollNo = 20;
//		s1.setName("ABC");
		ad.city = "Mumbai";
		
		s1.getAddress().city = "Dubai";
		
		System.out.println("After changing s1::: "+s1);	
		
	}

}
