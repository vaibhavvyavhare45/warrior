package com.warrior.prowing;

import java.util.Scanner;

public class PalindromeNumber1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		int n=sc.nextInt();
		
		StringBuffer br=new StringBuffer(String.valueOf(n));
		
		if(br.toString().equals(br.reverse().toString())) {
			System.out.println("number is palindrome");
		}
		else {
			System.out.println("the number is not palindrome");
		}
	}
	

}
