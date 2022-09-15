package polymorphism.overloading.scenarios;

public class Scenarios1 {
//public void m1(int...i) {
//	System.out.println("i am a int type var arg method");
//	
//}
public void m1(Integer...j) {
	System.out.println("i am a wrapper class type var arg method");
	
}

public static void main(String[] args) {
	Scenarios1 s=new Scenarios1();
	s.m1(45,78);
	
	
}
}
