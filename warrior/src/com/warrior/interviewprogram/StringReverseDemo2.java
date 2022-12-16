package com.warrior.interviewprogram;

public class StringReverseDemo2 {
	public static void main(String[] args) {
		String s="vaibhav";
		StringBuffer sb=new StringBuffer(s);
		StringBuffer sb2=sb.append(s).reverse();
		System.out.println(sb2);
		
	}
}
