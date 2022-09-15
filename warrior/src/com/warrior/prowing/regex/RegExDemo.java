package com.warrior.prowing.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
	public static void main(String[] args) {
		Pattern pt=Pattern.compile("[a-z0-9_\\-\\.]+[@][a-z]+[\\.][a-z]{2,3}");
		Matcher mt=pt.matcher("abc45@gmail.com");
		boolean res=mt.find();
		if(res) {
			System.out.println("The Email-id is valid");
		}
		else {
			System.out.println("The Email-id is invalid");
		}
	}

}
