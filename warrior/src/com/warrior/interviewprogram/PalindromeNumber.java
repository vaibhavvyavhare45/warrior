package com.warrior.interviewprogram;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		int reverse=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n=sc.nextInt();
		int m=n;
		while(m!=0) { 
			 reverse=(reverse*10)+(m%10);
			 m=m/10;
			
		}
		if(reverse==n) {
			System.out.println("the number is palindrome");
		}
		else {
			System.out.println("the number is not palindrome");
		}
	}

}
