package polymorphism.overriding.scenarios;

public class Scenarios5 {
	public static void main(String[] args) {
		A a=new B();
		a.m1();
	}

}
class A{
	public static void m1() {///it's not a method overriding it is method hiding
	System.out.println("Shape");	
	}
}
class B extends A{
	public static void m1() {
		System.out.println("circle");
	}
}
