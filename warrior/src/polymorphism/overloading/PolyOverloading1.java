package polymorphism.overloading;

public class PolyOverloading1 {
	
	public void m1(Object b)
	{
		System.out.println("i am a m1 method in class of object");
	}
	
	public void m1(Byte b) 
	{
		System.out.println("i am a Byte wrapper");
		
	}
	public void m1(Integer b) 
	{
	System.out.println("i am a Integer Wrapper");	
	}
//	public  void m1(int b)
//	{
//		System.out.println("i am a int  primitive ");
//	}
//	public void m1(double b)
//	{
//		System.out.println("i am a double primitive ");
//	}
	public void m1(Student s) 
	{
		System.out.println("I am a m1 method in class Student");
	}
	public void  m1(Test t) 
	{
		System.out.println("i am  a m1 method in class Test");
	}
//	public  void m1(String s)
//	{
//	 System.out.println("i am  a m1  method in class Test ");	
//	}

//	public void m1(Number b)
//	{
//		System.out.println("i am a parent class of  respective wrapper class of datatype  ");
//	}
	
	public static void main(String...ar)
	{
		//PolyOverloading1 p=new PolyOverloading1();
		new PolyOverloading1().m1(45);
	//p.m1(45);
	//p.m1(null);
	}
	
		

}
