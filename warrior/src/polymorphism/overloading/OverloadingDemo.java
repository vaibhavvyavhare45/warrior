package polymorphism.overloading;

import java.io.IOException;

public class OverloadingDemo  extends OverloadingDemoParent{
	public void m1(long j) {
		System.out.println("inside method m1 in child class");
	}
	public static void main(String[] args) throws IOException {
		OverloadingDemoParent ob1=new OverloadingDemoParent();
		ob1.m1(10);
		
		OverloadingDemo ob2=new OverloadingDemo();
		ob2.m1(45l); //calling method m1 in parent
		
		OverloadingDemoParent ob3=new OverloadingDemo();
		ob3.m1(30);
		
//		OverridingDemo ob4=new OverridingDemoParent();
//		ob4.m1(78);
	}

}
