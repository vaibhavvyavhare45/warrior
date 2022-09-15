package polymorphism.overriding.scenarios;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Scenarios7 {
	public static void main(String[] args)throws Exception {
		AAA a=new BBB();
		a.name();
	}

}
class AAA{
	public void name()throws IOException{
		System.out.println("AAA");
		
	}
}
class BBB extends AAA{
	public void name()throws FileNotFoundException  {
		System.out.println("BBB");
	}
}
