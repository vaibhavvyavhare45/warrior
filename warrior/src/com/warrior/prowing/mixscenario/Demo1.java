package com.warrior.prowing.mixscenario;

public class Demo1 {

	public static void main(String[] args) throws Exception {
//		String s=new String("vaibhav");
//		String s1=new String("VAIBHAV");
//		String s2=s1.replace('V','v');
//		String s3=s1.toLowerCase();
//		String s4=s2.intern();
//		System.out.println(s3==s);
		
		B b1 = new A();
		//B.m1(78);
	}
}

class B{
	public static void m1(int i,int j) {
		System.out.println("Hi");
	}
}

class A extends B{
	public static void m1(int i) {
		System.out.println("Hello");
	}
}