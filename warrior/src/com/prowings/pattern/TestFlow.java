package com.prowings.pattern;


class TestFlow2{
	
	static {
		System.out.println("parent static block");
	}
	{
		System.out.println("parent instance block");
	}
	TestFlow2(){
		System.out.println("parent class const");
	}
	public static void main(String[] args) {
		System.out.println("parent main method");
	}
	
}

public class TestFlow extends TestFlow2{
	static {
		
		System.out.println("child static blocks");
	}
	TestFlow(){
		System.out.println("child class const");
	}
	{
		System.out.println("child instance block");
	}

	public static void main(String[] args) {
		
		System.out.println("Child main method :");
		
		TestFlow t1 = new TestFlow();
		

	}

}
