package com.warrior.prowing.objectpassing;

import java.util.Scanner;

class Conversion{
	int mL,mL1,litre,litre1;
	
	public void get() {
		Scanner sc=new Scanner(System.in);
		System.out.print("\n\n\t Enter liquid in ml and litre: ");
		mL=sc.nextInt();
		litre=sc.nextInt();
	}
	public void get1()
	{
		Scanner sc1=new Scanner(System.in);
		System.out.print("\n\n\t Enter liquid in mL and litre: ");
		mL1=sc1.nextInt();
		litre1=sc1.nextInt();
	}
	public void show() {
		System.out.println("\n\n\t the liquid in mL: "+mL);
		System.out.println("\n\n\t the liquid in litre: "+litre);
	}
	public void show1() {
		System.out.println("\n\n\t the liquid in mL: "+mL1);
		System.out.println("\n\n\t the liquid in litre: "+litre1);
	}
	
	public void total(Conversion x,Conversion y) {
		litre=x.litre+y.litre1;
		mL=x.mL+y.mL1;
		
	}
	
}

public class ObjectPass2 {
	public static void main(String[] args) {
		Conversion c1=new Conversion();
		c1.get();
		c1.show();
		Conversion c2=new Conversion();
		c2.get1();
		c2.show1();
		Conversion c3=new Conversion();
		c3.total(c1,c2);
		c3.show();
		
	}
	

}
