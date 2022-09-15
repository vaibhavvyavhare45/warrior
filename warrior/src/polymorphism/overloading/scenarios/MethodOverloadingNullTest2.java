package polymorphism.overloading.scenarios;

public class MethodOverloadingNullTest2 {
	public static void m1(Object obj,Object obj1) {
		System.out.println("the method m1 with param-object object");
	}
	public static void m1(String st,Object obj3) {
		System.out.println("the method  m1 with param-String Object");
	}
	public static void main(String[] args) {
		
		m1(null,null);
		
	}
	

}
