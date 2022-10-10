package com.warrior.prowing.mixscenario;

public class Demo2 {
	public static void m1(int...a) {
		System.out.println("parent");
	}
	public static void m1(int b){
		System.out.println("helo");
	}
public static void main(String[] args) {
	m1(10,20);
}
}
