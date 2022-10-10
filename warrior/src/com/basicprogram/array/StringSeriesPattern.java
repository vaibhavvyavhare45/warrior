package com.basicprogram.array;

import java.util.Scanner;

public class StringSeriesPattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s=sc.next();
		//String s="A5B2C4";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z'||s.charAt(i)>='a' && s.charAt(i)<='z') {
				System.out.print(s.charAt(i));
		}
			else {
				int a=s.charAt(i)-48;
				for(int j=1;j<a;j++) {
					
					System.out.print(s.charAt(i-1));
				}
			}
		
	}

	}
}
