package com.warrior.abstraction.interf;

public class C1 extends A1 implements B1 {
	public void m1()
	{
		System.out.println("I am M1 interface method declare");
	}
	public void m2() {
		System.out.println("I am M2 interface declare:");
	}
	public int m3(int i) 
	{
		int y=i;
		System.out.println(y);
		return y;
	}
	public static void main(String[] args) {
		System.out.println("hiii");
		C1 c=new C1();
		c.m1();
		c.m2();
		c.m3(12);
		//A1 a=new C1();
		
	}

}
