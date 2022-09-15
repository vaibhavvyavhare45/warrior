package polymorphism.overloading.scenarios;

class BB extends BBB{
	public void m1() {
		System.out.println("BB");
	}
}
class BBB{
 public void m1() {
	 System.out.println("BBB");
 }
}
class BBBB extends BBB{
	public void m1() {
		System.out.println("BBBB");
	}
}
public class Scenarios {
	public static void main(String[] args) {
		BBB bb=new BBBB();
		bb.m1();
	}

}
