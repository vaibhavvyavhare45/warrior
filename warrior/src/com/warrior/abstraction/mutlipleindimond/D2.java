package com.warrior.abstraction.mutlipleindimond;
class A2{
	public void  display() {
		System.out.println("class A method call ");
	}
}
class B2 extends A2{
	public void display() {
		System.out.println("class B display method call");
	}
	
}
class C2 extends A2{
	public void display() {
		System.out.println("class C display method call");
	}
}
//public class D2 extends B2,C2{//becouse of the ambiguty error which method call and at the time of two class are not extends
public class D2 extends B2{
	public static void main(String...ar) {
		D2 d=new D2();
		d.display();
	}
	

}
