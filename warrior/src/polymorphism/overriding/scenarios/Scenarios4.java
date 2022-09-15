package polymorphism.overriding.scenarios;

public class Scenarios4 {
	public static void main(String[] args) {
		Shape3 s=null;
		s.draw();
	}

}
class Shape3{
	public static  void draw() { //print the shape as  method is static but method is normal then it will show the null pointer exception
		System.out.println("shape");
	}
}
