package com.warrior.copyconstructor;

public class Fruit {
	private String fname;
	private double fprice;
	public Fruit(String fName,double fPrice) {
		// TODO Auto-generated constructor stub
		fname=fName;
	    fprice=fPrice;
	}
public Fruit(Fruit f) {
	// TODO Auto-generated constructor stub
	System.out.println("After invoking the copy constructor...");
	fname=f.fname;
	fprice=f.fprice;
}
 String showName() {
	 return fname;
}
 double showPrice() {
	 return fprice;
 }
  

	
	public static void main(String[] args) {
		Fruit f1=new Fruit("Apple",399.00);
		System.out.println("name of the first fruit is: "+f1.showName());
		System.out.println("price of the first fruit is: "+f1.showPrice());
		
		Fruit f2=new Fruit(f1);
		System.out.println("name of the second fruit is: "+f2.showName());
		System.out.println("price of second fruit is: "+f2.showPrice());
	}

}
