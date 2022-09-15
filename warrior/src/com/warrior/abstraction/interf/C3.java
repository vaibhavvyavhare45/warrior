package com.warrior.abstraction.interf;

public class C3 extends A2 implements B2 {

	public void m1() {
		System.out.println("this is m1  interface method: ");
	}
	public void m2() {
		System.out.println("this is m2  interface method");
	}
	
//	public void m3(int i) {// void doesn't return any type of value
//		return 0;
//	}
	public static void main(String[] args) {
		A2 c=new C3();
		c.m1();
		B2 b= new C3();
		b.m2();
		c.m3(0);
		//A2 a=new C3();
		//a.
		
	}
	@Override
	public int m3(int i) {
		 i=4+5;
		System.out.println("value of i is:"+i);
		return i;
	}
	
	


}
