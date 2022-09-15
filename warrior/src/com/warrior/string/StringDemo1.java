package com.warrior.string;

public class StringDemo1 {
	public static void main(String[] args) {
		String s=new String("YYY");
		String s1="YYYYYY";
		String s2="YYY";
		String s4=s.intern();
		String s5=s.concat("YYY").intern();
		
		System.out.println(s.equals(s2));
		System.out.println(s.equals(s4));
		System.out.println(s==s4);
		System.out.println(s==s5);
		System.out.println(s==s1);
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));
		
		}

}
