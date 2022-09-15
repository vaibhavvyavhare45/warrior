package com.warrior.prowing.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo1 {
	public static void main(String[] args) {
		Pattern pt=Pattern.compile("/^\\S*(?=\\S{6,})(?=\\S*\\d)(?=\\S*[A-Z])(?=\\S*[a-z])(?=\\S*[!@#$%^&*? ])\\S*$/");
		Matcher mt=pt.matcher("vaibhav@123");
		boolean res=mt.find();
		if (res) {
			
			System.out.println("the password is valid");
		}
		else {
			System.out.println("the password is invalid");
		}
	}

}
