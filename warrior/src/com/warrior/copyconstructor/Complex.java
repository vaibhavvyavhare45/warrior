package com.warrior.copyconstructor;

public class Complex {
	private double re,im;
	public Complex(double re,double im) {
		// TODO Auto-generated constructor stub
		this.im=im;
		this.re=re;
	}
	public Complex(Complex c){
		// TODO Auto-generated constructor stub
		System.out.println("this copy constructor...");
		im=c.im;
		re=c.re;
	}
	public String toString() {
		return "("+ re +" + "+ im + "i)";
	}
	public static void main(String[] args) {
		Complex c1=new Complex(10,14.5);
		//System.out.println("the complex number is: "+c1.toString());
		Complex c2=new Complex(c1);
		Complex c3=c2;
		System.out.println(c2);
	}

}
