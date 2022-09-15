package polymorphism.overloading.scenarios;

public class Scenarios2 {
	public static void main(String[] args) {
		Scenarios2 s=new Scenarios2();
		//Character b='a';
		//Double b=12.9d;
		s.m1(15.8);
	}
	 void m1(double...i) {
		System.out.println("double");
	}
//	 void m1(Double...j) {
//		System.out.println("Double wrapper");
//		
//	}

}