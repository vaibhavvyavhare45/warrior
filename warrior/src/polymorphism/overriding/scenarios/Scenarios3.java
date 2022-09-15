package polymorphism.overriding.scenarios;

public class Scenarios3 {
	public static void main(String[] args) {
	Shape2 s=new Circle2();
	s.draw();
	}
}
	class Shape2{
		public void draw() {
			System.out.println("shape");
			
		}
	}
class Circle2 extends Shape2{
//	private void draw() {
//		System.out.println("circle");
//	}
}

