package polymorphism.overloading;

public class PolyOverload1 {
		public void m1(int i,long k) {
			System.out.println("i am int ");
			//return 0;
			}
		public float m1(int i,int j,float k) {
			System.out.println("i am old");
			float sum =  (i +j - k);//
			System.out.println("sum is:"+sum);
		    return sum;
		}
		public static void main(String[] args) {
		PolyOverload1 p1=new PolyOverload1();
		//int n=12;
		p1.m1(50,60,20.5f);
	}
}
