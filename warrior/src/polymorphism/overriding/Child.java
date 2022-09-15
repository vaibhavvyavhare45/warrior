package polymorphism.overriding;

public class Child extends Parent{
	public void m1() {
		System.out.println("i am a m1 method in child class");
	}
	public  void m2()
	{
		System.out.println("i am a m2 method in child class");
	}
	public void m4()
	{
		System.out.println("i am a m4 method in child class");
	}
	public static void main(String[] args) {
		//Child c=new Child();
		//Parent pa=new Parent();
		Parent p=new Child();
		//p.m4();
		p.m2();
		
	}

}
