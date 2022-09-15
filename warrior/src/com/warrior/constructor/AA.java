package com.warrior.constructor;
class B{
	int a;
	int b;
	public B(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	
//}

//public class AA {
//	public B(int c, long b) {
//		super();
//		this.c = c;
//		this.b = b;
//	}
	public static void main(String[] args) {
		B  b=new B(14,45);
		System.out.println(b);
		
	}
	

}
