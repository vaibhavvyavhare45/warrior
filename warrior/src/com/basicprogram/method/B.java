package com.basicprogram.method;

public class B extends A{
  B()
  {
	  super.m1();
  }
	
//	{
//		super.m1();
//		m1();
//	}
//	
	void m1() {
	System.out.println("Hello");
	
}
	public static void main(String[] args) {
		B b = new B();
		
	}
}
