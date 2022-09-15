package polymorphism.overloading;

import com.warrior.abstraction.interf.C;

class A{
//	public void  m1(int a){
//		System.out.println("i am  a m1 method in class A ");
//		}
	public static void m2(double f) {
		System.out.println(" i am a static void main");
	}
}
class B extends A{
	public void m1(long b){//
		
		System.out.println(" i am a m1 method in class B");
		}
	public static  void m2 (int d) {
		System.out.println("i am a m2 static method  in class B");
	
	}
}
public class PolyOverload2 {
	public static void main(String[] args) {
		//B b=new B();
		B c=new B();
		c.m1(45);
		//c.m2(45d);

		
	}
}
