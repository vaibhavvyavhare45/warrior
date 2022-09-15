package com.warrior.string;

public class Demo 
{
	public static void main(String[] args) {
		
		String s = new String ("Sayali");
		String s1="Sayali";
		String s3 = s1.concat("Wadkar");
		System.out.println(s=s.intern()); 
		String s2 = new String ("Sayali");
		
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		
		
	}
	

}
