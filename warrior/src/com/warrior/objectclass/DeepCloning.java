package com.warrior.objectclass;
class Cat implements Cloneable{
	
	int j;
	
	
	Cat(int j){
		this.j=j;
	}
}
class Dog implements Cloneable{
	Cat c;
	int i;
	 Dog(int i,Cat c) {
		this.i=i;
		this.c=c;
		
	}
	 public  Object clone()throws CloneNotSupportedException{
		 Cat c1=new Cat(c.j);
		 Dog d=new Dog(i,c1);//deep cloning
		// Dog d=new Dog(i,c);//shallow cloning
		 return d;
	 }
	 
	
}

public class DeepCloning{
	public static void main(String[] args)throws CloneNotSupportedException{
		Cat c=new Cat(20);
		Dog d1=new Dog(10,c);
		//System.out.println(d1.i+"  "+d1.c.j);
		Dog d2=(Dog)d1.clone();
		d2.i=888;
		d2.c.j=999;
		System.out.println(d1.i+"  "+d1.c.j);
		System.out.println(d2.i+"  "+d2.c.j);
		
		
	}

}
