package com.warrior.objectclass;

public class EqualsDemo {
	int rollno;
	String nm;
	
	public EqualsDemo(int rollno,String nm) {
		this.rollno=rollno;
		this.nm=nm;
	}
	public boolean equals(Object obj) {
		if(this==obj)
			return false;
		if(obj instanceof EqualsDemo) {
			EqualsDemo s=(EqualsDemo)obj;
			if(rollno==s.rollno && nm.equals(s.nm)) {
				return true;
			}
			return false;
		}
		return false;
	}
	
	public static void main(String[] args) {
		EqualsDemo s1=new EqualsDemo(10, "ram");
		EqualsDemo s2=new EqualsDemo(10, "Ram");
		
		System.out.println(s1.equals(s2));
		
	}
}
