package com.warrior.interviewprogram;

import java.util.Scanner;

public class DuplicateByStringChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String: ");
		String s=sc.next();
		//String s = "India is my country and India have 28 state";
		String[] s1 = s.split(" ");
		for (int k = 0; k < s1.length; k++) {
			System.out.print(s1[k]);
		}
		System.out.println();
		int count;
		char ch[] = s.toCharArray();
		System.out.println("find duplicate charater in given string: ");
		for (int i = 0; i < ch.length; i++) {
			count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j] && ch[i] != ',') {
					count++;
					ch[j] = '0';
				}
			}
			if (count > 1 && ch[i] != '0') {
				System.out.print(ch[i]);
			}
		}

	}

}
