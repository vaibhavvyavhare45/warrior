package com.warrior.abstraction.interf;

public class C extends A implements B{
	@Override
	public void m1()
	{
		System.out.println("inside m1");
	}
		public static void main(String[] args) {
		C c=new C();//child class hold the child object
		c.m1();
		System.out.println("****************calling m2********************");
		c.m2();
		B b=new C();//interface reference hold child class object
		b.m2();
		
		
	}

}
