package polymorphism.overloading.scenarios;

public class MethodOverloadingNullTest3 {
	public static void show(Object o) {
		System.out.println("the method show with param object types:");
	}
	public static void show(String s) {
		System.out.println("the method show with param  String  types ");
		
	}
//	public static void show(StringBuffer sb) {
//		System.out.println("the method show with param StringBuffer: ");//bcz of the sibling relation
//			
//	}
	public static void main(String[] args) {
		show(null);
	}
} 
