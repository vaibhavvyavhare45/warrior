package polymorphism.overriding.scenarios;

public class Scenarios2 {
	public static void main(String[] args) {
		Shape s=new Circle();
		s.draw();
	}

}
class Shape1{
	protected void draw() {
		System.out.println("shape");
	}
}
class Circle1 extends Shape1{
	public void draw() {
		System.out.println("circle");
		
	}
}
