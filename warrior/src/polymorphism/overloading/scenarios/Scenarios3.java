package polymorphism.overloading.scenarios;

public class Scenarios3 {
	public void m1(Long i,int j, int k)
	{
		System.out.println("the m1 metod first:");
		
	}
	
//	public void m1(Long...l)//var_arg method only access Wrapper class Long  type value
//	{
//		System.out.println("Long type var arg array");
//	}
	
	public void  m1(long...l)
	{
		System.out.println("long type var arg arra in prims");
	}
	public static void main(String[] args) {
		Scenarios3 s = new Scenarios3();
		s.m1((Long)40L,50,60);
		
	}


}
				