package com.warrior.objectclass.scenarios;

public class ObjClassDemo1 {
	int roll;
	String nm;
	public ObjClassDemo1(int roll,String nm) {
		this.roll=roll;
		this.nm=nm;		
	}
	public boolean equals(Object obj){
		if(this==obj)
			return true;
		if(obj instanceof ObjClassDemo1 ) {
			ObjClassDemo1 s=(ObjClassDemo1)obj;{
				if(roll==s.roll && nm.equals(s.nm))
					return true;
				}
				return false;
			}
			return false;
	}
		
		
		
		
		
	public static void main(String[] args) {
		ObjClassDemo1 o1=new ObjClassDemo1(101, "vaibhav");
		ObjClassDemo1 o2=new ObjClassDemo1(101, "vaibhav");
		ObjClassDemo1 o3=new ObjClassDemo1(101, "vaibhav");
		ObjClassDemo1 o4=new ObjClassDemo1(101, "marish");
		ObjClassDemo1 o5=new ObjClassDemo1(101, "Marish");
		//o1=o5;
		System.out.println(o1.equals(o2));//
		//System.out.println(o1==o5);
		
		
	}

}
