package com.warrior.prowing.objectpassing;

import java.util.Scanner;

class Distance{
	int km,km1,m,m1;
	public void get() {
		Scanner sc=new Scanner(System.in);	
		System.out.println("\n\n\t Enter the distance in km  and m: ");
		km=sc.nextInt();
		m=sc.nextInt();
	

	}
	public void get1() {
		Scanner sc1=new Scanner(System.in);
		System.out.println("\n\n\t Enter the distance in km1 and m1: ");
		km1=sc1.nextInt();
		m=sc1.nextInt();	
	}
	
	public  void show() {
		System.out.println("\n\n\t the distance in km: "+km);
		System.out.println("\n\n\t the distance in m: "+m);
	}
	public void  show1(){
		System.out.println("\n\n\t the distance in km1: "+km1);
		System.out.println("\n\n\t the distance in m1: "+m1);
		
	}
	public void add(Distance x,Distance y) {
		km=x.km+y.km1;
		m=x.m+y.m1;
		if(m>1000) {
			km=km+m/1000;
			m%=1000;
		}
		
	}
	
	
}

public class ObjectPass {
	public static void main(String[] args) {
		Distance d1=new Distance();
		d1.get();
		d1.show();
		Distance d2=new Distance();
		d2.get();
		d2.show();
		Distance d3= new Distance();
		d3.add(d1, d2);
		d3.show();
		
		
	}

}
