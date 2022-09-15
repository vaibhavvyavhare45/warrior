package polymorphism.overriding.typecasting;
class A{
	int i=10;
	public void show() {
		System.out.println("inside parent show()");
	}
}
 class B  extends A{
	int j=20;
	public void  show() {
		System.out.println("inside child show()");
	}
}




public class Test {
	public static void main(String[] args) {
		A ob1=new A();//valid
		ob1.show();
		
		B ob2=new B();//valid
		ob2.show();
		
		A ob3=new B();//valid 
		ob3.show();
		
//		B ob4= (B)new A();//not valid  child can't  hold the parent object		
//		ob4.show();//down-casting  is not possible
		
//		B ob5=(B)obj1;//downcasting is  not posible
//		obj5.show();
		
		B ob6=(B)ob3;///it is most important
		ob6.show();
		
	
		
	}
	
}
