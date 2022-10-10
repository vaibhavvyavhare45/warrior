package com.warrior.objectclass;

import java.util.Objects;

public class Employee implements Cloneable {
	int id;
	String nm;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String nm) {
		super();
		this.id = id;
		this.nm = nm;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, nm);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(nm, other.nm);
	}
//	
	public static void main(String[] args)throws CloneNotSupportedException {
		Employee s=new Employee();//content equality//reference equality
		Employee s2= (Employee)s.clone();//reference equality but first comment out the object override method 
		
		//Employee s3=new Employee();//content equality
		
		System.out.println(s.equals(s2));
		
		
		
		//System.out.println(s.equals(null));
		//Employee s3=null;
		
		
		
		
	}
	
	
	
	

}
