package polymorphism.overloading.scenarios;

public class Scenarios5 {
//	public void show(Integer...i)
//	{
//		System.out.println("first ");
//	}
	public void show(String...i)
	{
		System.out.println("second ");
	}
//	public void show(StringBuffer r)
//	{
//		System.out.println("buffer");
//	}
//	public void show(Object...o)
//	{
//		System.out.println("third");
//	}
//	
	public void show(Number ...n)
	{
		System.out.println("fourth");
	}
	
//	public void show(int i)
//	{ 
//		System.out.println("Sixth");
//	}
	
		
	public static void main(String[] args) {
		Scenarios5 s=new Scenarios5();
		s.show(10,14,45);
		
	}

}
