package polymorphism.overloading.scenarios;

public class MethodOverloading1 {
	private  static  void display(int a) {
		System.out.println("arguments"+a);
	}
	private static void display(int a,int b) {
		System.out.println("arguments"+a+"and"+b);
		
		
	}
	public static void main(String[] args) {
		display(45);
		display(78,89);
	}

}
