package polymorphism.overriding.scenarios;

public class Scenarios10 {
	public static void main(String[] args) {
		Teach t=new Stud();
		t.m1(null);
		
	}

}///this method is method overloading
class Teach{
	public void m1(Integer i) {
		System.out.println("hi");
		
	}
}
class Stud extends Teach{
	private void m1(Number j) 
	{
		System.out.println("gbjbjk");
		
	}
		
	
}
