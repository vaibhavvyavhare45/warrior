package com.warrior.abstraction.mutlipleindimond;

public class B extends A implements S1,S2 {
	public void m11() {
		System.out.println("i am m1 in interface s2");
	}
	public void m21() {
		System.out.println("i am m2 in interface  s2");
	}
	public void y1() {
		System.out.println("i am y1");
		
	}
	public void y2() {
		System.out.println("i am y2");
		
	}

	public void n1() {
		// TODO Auto-generated method stub
		System.out.println("i am n1 method");
		
	}
	
		
	public static void main(String[] args) {
		A a=new B(); //abs class-child
		a.n1();
		a.r1(0);
		
		
		S2 s=new B(); // child-child
		//s.y1();
	//	s.y2();
	    s.m21();
	    s.m11();
	    
	//S2 s2=new B(); //interface2 -child
//	s2.m11();
//	s2.m21();
	//s2.y1();	
	}

	

	
}
