package polymorphism.overriding.scenarios;

public class Scenarios9 {
	public static void main(String[] args) {
		Parent p=new Child();
		p.m1();
		
	}

}
class Parent{
	public Number m1() {
		System.out.println("integer");
		return 0;
	}
}
class Child extends Parent{
	public Integer m1() {
		System.out.println("number");
		return 0;
	}
}
