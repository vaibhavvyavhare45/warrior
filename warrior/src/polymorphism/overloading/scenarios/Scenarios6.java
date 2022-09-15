package polymorphism.overloading.scenarios;

class Stud{
	static {
		System.out.println("java");
	}
	{
		System.out.println("python");
		main(null);
	}
	private void m1() {
		System.out.println("javascript");	
	}
	public static void main(String a) {
		Stud s=new Stud();
		s.m1();
		
		System.out.println("main method");
	}
}
public class Scenarios6 extends Stud {
	void m1() {
		System.out.println("m1");
	}
	public static void main(String[] args) {
		Scenarios6 s6=new Scenarios6();
		s6.m1();
		
	}

}
