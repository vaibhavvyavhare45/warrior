package com.warrior.objectclass;

import com.warrior.abstraction.interf.C;

public class GarC {
	int roll;
	String snm;
	
	 
	
	public GarC() {
		super();
		// TODO Auto-generated constructor stub
	}


	public GarC(int roll, String snm) {
		super();
		this.roll = roll;
		this.snm = snm;
	}
	
	
	@Override
	public String toString() {
		return "GarC [roll=" + roll + ", snm=" + snm + "]";
	}


	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		//System.out.println(this);
		super.finalize();
	}

	
	
	public static void main(String[] args) throws Throwable {
		GarC c1=new GarC(1001,"marsh");
		 c1=new GarC(1002,"shayam");
		 c1.finalize();
		 //System.gc();
		 Runtime.getRuntime().gc();
		 
		System.out.println(c1);
		 
		
	}

}
