package com.warrior.interviewprogram;

public class BasicDemo {
//final int String=10;	
	static {
		int x=10;
		System.out.println(x);
	}
	{
		System.out.println("Hello");
	}
	public BasicDemo() {
		
		//super();
		System.out.println("hbunauiuh");
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		System.out.println("Hi");
	}
	
}
class B extends BasicDemo{
	static {
		int y=20;
		System.out.println(y);
	}
	{
		System.out.println("Hello!!!!");
	}
	public B() {
		super();
		System.out.println("gjnim");
		
		
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		System.out.println("");
		B b=new B();
		
	}
	
	
}
