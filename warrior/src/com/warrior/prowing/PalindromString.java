package com.warrior.prowing;

import java.util.Scanner;

public class PalindromString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string: ");
		String s=sc.next();
		StringBuffer sb=new StringBuffer(s);
		String b=sb.reverse().toString();
		if(s.equals(b)) {
			System.out.println("Enter string is palindrome");
		}
		else {
			System.out.println("Enter string is not prime number:");
		}
		
	
}
	
}
