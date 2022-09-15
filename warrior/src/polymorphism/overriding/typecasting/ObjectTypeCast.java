package polymorphism.overriding.typecasting;

public class ObjectTypeCast {
	public static void main(String[] args) {
//		Object o=new  String("vaibhav");
//		StringBuffer s=(StringBuffer)o;//some people may fill compile time error ,some people may fill runtime error 
		
		//syntax of  object type casting;
		//A b=(C)d;//we are converting  d type object in c Type now the  c type object assign to the A type reference variable this casting is called as object type casting  
		//three mantras for object casting 
		//first checking the object tyoe conversion is legal or iligal and then checking then assign the value  is properly of  object type reference 
		
//		String o=new  String("vaibhav");
//		StringBuffer s=(StringBuffer)o;//there is no relationship imidiatly goes on compile time error

	
		Object o=new String("this vaibhtz");
		String s=(String)o;
		System.out.println(s);
	}

}
