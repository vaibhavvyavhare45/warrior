package com.warrior.constructorchaining;

public class Demo2 {
	{
		System.out.println("instance block");
	}
	public Demo2() {
		// TODO Auto-generated constructor stub
		System.out.println("Default");
	}
	Demo2(int x){
		System.out.println(x);
	}
	static{
		System.out.println("static block");
	}
	{
		System.out.println("instance block2");
	}
	public static void main(String[] args) {
		new Demo2();
		new Demo2(10);
		}
}
