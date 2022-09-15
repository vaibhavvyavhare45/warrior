package com.warrior.constructorchaining;

public class Temp {
	
	Temp(){
		
		this(5);
		System.out.println("default constructor");
		
	}
	Temp(int x){
		this(5,10);
		System.out.println(x);
	
	}
	Temp(int x,int y){
		System.out.println(x*y);
	}
	public static void main(String[] args) {
		new Temp();//invoking the default constructor first
	}

}
