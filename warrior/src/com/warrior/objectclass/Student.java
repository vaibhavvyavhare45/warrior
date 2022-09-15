package com.warrior.objectclass;

public class Student implements Cloneable{
	int rollno;
	String name;
	
	
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	public Object clone()throws CloneNotSupportedException
	{
		System.out.println(this);
		return super.clone();
	}

	public static void main(String[] args)throws CloneNotSupportedException {
		
		Student s1=new Student(101,"ram");
		Student s2=(Student)s1.clone();
		System.out.println(s1.rollno+" "+s1.name);
		System.out.println(s2.rollno+" "+s2.name);
		
		}
		
	
}


