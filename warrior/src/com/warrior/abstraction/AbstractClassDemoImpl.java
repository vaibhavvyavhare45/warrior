package com.warrior.abstraction;

 class AbstractClassDemoImpl extends AbstractClassDemo {
	AbstractClassDemoImpl(){
		super();
		System.out.println("inside no arg constructor of child");
	
		
	
	
	}
 AbstractClassDemoImpl(int i,int j,String s1,String s2){
	 super(i,j,s1,s2);
	 System.out.println("inside all parameterized constructor of child");
	 
	}
	
	@Override
	public void show(){
		System.out.println("inside show method:");
	}
	
	
	public static void main(String[] args) {
		//AbstractClassDemo gh=new AbstractClassDemo();//doesn't create this type of object
		//AbstractClassDemo de=new AbstractClassDemoImpl();//it is valid becouse parent abstract class in n acc
		//AbstractClassDemoImpl sc=new AbstractClassDemoImpl();
		//de.show();
		AbstractClassDemoImpl acdi=new AbstractClassDemoImpl();
		acdi.print();
		AbstractClassDemoImpl ac=new AbstractClassDemoImpl(10,14,"vaibhav","vyavvhare");
		ac.print();
		
	}
	 

}
