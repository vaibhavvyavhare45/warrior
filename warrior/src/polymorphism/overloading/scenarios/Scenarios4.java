package polymorphism.overloading.scenarios;

public class Scenarios4 {
//	public void disp(Integer...i)
//	{
//		System.out.println("i am disp method  first");
//	}
	
//	public void disp(int...i)
//	{
//		System.out.println("i am disp method second");	
//	}
	public void disp(int s,int t,int k)
	{
		System.out.println("i am disp method third "+s + t+ +k);	
	}
	public void disp(int  g)
	{
		System.out.println("i am disp method fourth ");	
	}
	public static void main(String[] args)
	{
		Scenarios4 sc=new Scenarios4();
		sc.disp(10,47,78);
	}

}
