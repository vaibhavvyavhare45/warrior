package com.warrior.constructorchaining;

public class Demo1 {
	{
		System.out.println("instance block");
	}
	public Demo1() {
		// TODO Auto-generated constructor stub
		System.out.println("default constructor");
	}
	Demo1(int x){
		System.out.println(x);
	}
	public static void main(String[] args) {
		new Demo1();
		new Demo1(5);
	}

}
