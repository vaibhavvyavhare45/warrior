package polymorphism.overloading.scenarios;

public class MethodOverloadingNullTest4 {
	public static void g1(Object ob,String obj1) {
		System.out.println("the method g1 with param object and string ");
	}
	public static void g1(String str, Object str1) {
		System.out.println("the method g1 with param string and object");
	}
	public static void main(String[] args) {
		//g1(null,null);//ambigues null problem
	}

}
