package polymorphism.overriding;

class A{
	public void m1() {
		System.out.println("i am a java devloper");
	}
}
class B extends A{
	public void m1() {
		System.out.println("i am a fullstack devloper");
	}
}
public class PolyOverride1 {
	public static void main(String[] args) {
		A a=new B();
		a.m1();
		
	}

}
