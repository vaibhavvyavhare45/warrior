package com.warrior.string;

public class Scenario5 {
	public static void main(String[] args) {
		String s1=new String("vaibhav");
		String s2=s1.concat(s1);
		String s3=s2.intern();
		String s4="vaibhav";
		System.out.println(s3==s4);
	}

}
