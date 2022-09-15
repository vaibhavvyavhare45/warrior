package com.warrior.string;

public class StringDemo2 {
	public static void main(String[] args) {
		String s=new String("Rushi");
		String s1=s.concat("patil");
		String s2="rushi patil";
		String  s3=s1.intern();
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
	}

}
