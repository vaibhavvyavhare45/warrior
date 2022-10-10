package polymorphism.overriding;

//import com.warrior.abstraction.interf.C;

class C1{
	public void  m1(int a){
		System.out.println("i am  a m1 method in class A ");
		}
	public static void m2(double f) {
		System.out.println(" i am a static void main");
	}
}
class D1 extends C1{
	public void m1(double d){// changed int from long
		
		System.out.println(" i am a m1 method in class B");
		}
	public static  void m2 (int h) {
		System.out.println("i am a m2 static method  in class B");
	
	}
}
public class PolyOverride2 {
	public static void main(String[] args) {
		//C b=new C();
		C1 a=new D1();
		//a.m1(5.4);
		a.m1(45);
		//a.m1(45d);
		//a.m2(45.5);

		
	}
}
