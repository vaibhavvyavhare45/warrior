package com.warrior.abstraction.mutlipleindimond;
import java.util.Scanner;
public abstract class A {
	public  abstract void n1();
	
	
	public int r1(int i) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("the number is even");
		}
		else {
			System.out.println("the number is odd");
		}
		return 0;
		
	}

}
