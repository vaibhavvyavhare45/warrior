package polymorphism.overriding.scenarios;

public class Scenarios8 {
	public static void main(String[] args) {
		Aa a=new Ba();
		a.m1();
	}
}
	
	class Aa{
		public void m1()throws ArithmeticException {
			System.out.println("hby");
			
			
		}
	}
		class Ba extends Aa{
			public void m1()throws RuntimeException {
				System.out.println("hi");
				
			}
		}
		 
	


 