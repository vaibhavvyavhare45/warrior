package com.warrior.interviewprogram;

import java.util.Arrays;

public class Anagramprogram {
	static void isAnagram(String s1,String s2) {
		//removing white spaces from string1 and to string2 using both string is convert to lowercase
		String copyofs1=s1.replaceAll("\\s", "").toLowerCase();
		String copyofs2=s2.replaceAll("\\s", "").toLowerCase();
		//initially setting status are true
		boolean status=true;
		if(copyofs1.length()!=copyofs2.length()) {
			//both string length are not same then will be the status is false
			status=false;
		}
		else {
			//converting  copyofs1 to  char array
			char[] s1Array=copyofs1.toCharArray();
			char[] s2Array=copyofs2.toCharArray();
			//sorting both s1Array and s2Array
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			//checking whether s1Array And s2Array are equal
			status=Arrays.equals(s1Array, s2Array);
			
		}
		if(status) {
			System.out.println(s1+" and "+s2+" are a anagram");
		}
		else {
			System.out.println(s1+" and"+s2+" are not a anagram");
		}
		
	}
	public static void main(String[] args) {
		isAnagram("peek","keep");
		isAnagram("peEk","keeP");
		isAnagram("debit card","bad cradit");
	}

}
