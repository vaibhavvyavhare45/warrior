package polymorphism.overloading.scenarios;
class DisplayOverloading{
	public void disp(float b,float db) {
		System.out.println("i am the first defination of dip method");
		
	}
	public void disp(long l,double j) {
		System.out.println("i am the second defination of dip method");
		
	}
	
}


public class Sample1 {
	public static void main(String[] args) {
		DisplayOverloading ob=new DisplayOverloading();
		ob.disp(45.0f,60.0f);
		//ob.disp(44,46);//it will give ambiguous problem
		//ob.disp(45,y);//compile error 
		
	}
	

}
