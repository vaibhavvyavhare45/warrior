package com.warrior.objectclass;

public class ToString {
	
	
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String res=null;
		String ToString=getClass().getName();
		int hs=this.hashCode();
		String hextStr=Integer.toHexString(hs);
		res=ToString+"@"+hextStr;
		
		return res;
	}

	public static void main(String[] args) {
		ToString s=new ToString();
		System.out.println(s.toString());
		
	}

}
