package com.warrior.objectclass;

public class Bank {

	private  String nm;
	

	public Bank(String nm) {
		super();
		this.nm = nm;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}
	public static void main(String[] args) {
		Bank b=new Bank("shriram");
		System.out.println(b.getNm());
		System.out.println(b.hashCode());
		Bank b1=new Bank("Shriram");
		System.out.println(b1.getNm());
		System.out.println(b1.hashCode());
		System.out.println(b1.equals(b));
		
	}
	
}
