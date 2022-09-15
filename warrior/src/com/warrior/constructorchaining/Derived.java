package com.warrior.constructorchaining;
class Base{
	String name;
	public Base() {
		// TODO Auto-generated constructor stub
		this("");
		System.out.println("this is no-arg constructor");
	}
	Base(String name){
		this.name=name;
		System.out.println("caling parameterized constructor");
	}
}

public class Derived extends Base{
	public Derived() {
		System.out.println("no-arg constructor of"+ "of derived");
		// TODO Auto-generated constructor stub
	}
	Derived(String name){
		super(name);
		System.out.println("calling parameterized constructor"+ "of derived");
		
		
	}
	public static void main(String[] args) {
		Derived d=new Derived("test");
	}
	

}
