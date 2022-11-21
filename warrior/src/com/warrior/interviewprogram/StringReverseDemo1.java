package com.warrior.interviewprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringReverseDemo1 {
public static void main(String[] args) {
	
	String s1="vaibhav";
	char[] ch=s1.toCharArray();
	for(int i=0;i<ch.length;i++) {
		System.out.print(ch[i]);
		
	}
	
	System.out.println();
	for(int i=ch.length-1;i>=0;i--) {
		System.out.print(ch[i]);
	}
	System.out.println();
	
	//sorting array
	for(int i=0;i<ch.length;i++) {
		for(int j=i;j<ch.length;j++) {
			
			if(ch[i]>ch[j]) {
				char temp=0;
				temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				
			}
			
		}
		
		System.out.print(ch[i]);
	}
	
	
	
	
	
	
	
}
}
