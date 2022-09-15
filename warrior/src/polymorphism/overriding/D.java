package polymorphism.overriding;
class C{
	
	public static void m2() {
		System.out.println("i am method in class A");
	}
}

public class D extends C{
	static int a=6;
	
	public static void m2() {
		System.out.println("i am a method in class B");
	}
	public static void main(String[] args) {
		
		//D x=new C();//child can not hold the parent object
		D x=new D();
		System.out.println(x.a);
		 
		//x.m2();
	}
	

}
