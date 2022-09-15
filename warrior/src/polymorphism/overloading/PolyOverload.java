package polymorphism.overloading;

public class PolyOverload {
	
	public void m1(Object o) {
		System.out.println("i am object is");
	}
	public void m1(Number m) {
		System.out.println("i am a number");
	}
			
	public void m1( String  f) {
		System.out.println("i am integer ");
	}
//	public void m1(Character j) {
//		System.out.println("i am character");
//	}
	public void m1(Integer i) {
		System.out.println("");
	}
	
	public void m1(Long c) {
		System.out.println("i am char");
	}
	
	
	public static void main(String[] args) {
		PolyOverload po=new PolyOverload();
		//char d='a';
			po.m1('a');
		
	 

		
	}

}
