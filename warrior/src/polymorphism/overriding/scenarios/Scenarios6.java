package polymorphism.overriding.scenarios;

public class Scenarios6 {
public static void main(String[] args) {
	A1 a=new B1();
	System.out.println(a.name);
}
}
class A1{
	String name="Shape";//variable can not override, variable resolve at compile time and method  resolve at runtime
}
class B1 extends A1{
	String name="Circle";
}
