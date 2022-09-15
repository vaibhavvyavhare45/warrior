package com.warrior.abstraction;

public abstract class AbstractClassDemo {
	int i;
	int j;
	String s1;
	String s2;
	AbstractClassDemo(){
		super();
		System.out.println("no arg constructor is invoked parent class");
	}
	AbstractClassDemo(int i,int j,String s1,String s2){
		super();
		this.i=i;
		this.j=j;
		this.s1=s1;
		this.s2=s2;
		System.out.println("this is all  no args constructor are invoked..");
		//parameterized constructor
	}
	
	
	public void print() {//this concrete method
		System.out.println("inside the method!!");
		System.out.println(this.i);
		System.out.println(this.j);
		System.out.println(this.s1);
		System.out.println(this.s2);
	}
	public abstract void show();
	
	
	

}
