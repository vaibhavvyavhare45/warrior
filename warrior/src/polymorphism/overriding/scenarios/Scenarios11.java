package polymorphism.overriding.scenarios;

class Shape122 {
	public void draw() throws ArrayIndexOutOfBoundsException {
		System.out.println("shape");
	}
}

class Circle23 extends Shape122 {
	public void draw() throws ArithmeticException {
		System.out.println("Circle");
	}
}

public class Scenarios11

{
	public static void main(String args[]) {
		Shape122 s = new Circle23();
		s.draw();
	}
}
