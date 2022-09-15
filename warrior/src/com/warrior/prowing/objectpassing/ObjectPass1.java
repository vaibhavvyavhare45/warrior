package com.warrior.prowing.objectpassing;

import java.util.Scanner;

class Bank{
	int accno;
	String nm;
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.print("\n\n\t Enter the accoun no and Account holder name: ");
		accno=sc.nextInt();
		nm=sc.next();
	}
	public void display() {
		System.out.print("\n\n\t the account number  is: "+accno);
		System.out.print("\n\n\t the account holder name is: "+nm);
	}
	public Bank analysis(Bank x){
		x.accno=102;
		x. nm="vaibhav";
		return (x);		
		
	}
}
public class ObjectPass1 {
	
	public static void main(String[] args) {
		Bank b=new  Bank();
		b.accept();
		b.display();
		Bank b1=new Bank();
		b1=b1.analysis(b);
		b1.display(); 
		
	}

}
