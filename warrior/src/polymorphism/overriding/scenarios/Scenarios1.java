package polymorphism.overriding.scenarios;

public class Scenarios1 {
	public static void main(String[] args) {
	 Shape s=new Circle();
	 s.draw();
	 s.fill();
	}
}
	class Shape{
		public void draw()
		{
			System.out.println("shape");
		}
		public void fill() {
			System.out.println("Shape fill with color");
		}
	}
	class Circle extends Shape{
		public void draw() {
			System.out.println("circle");
		}
	}
	class Square extends Shape{
		public void draw() {
			System.out.println("Square");
			
		}
	}
	class Polygon extends Shape{
		public void draw() {
			System.out.println("polygon");
			
		}
	}


