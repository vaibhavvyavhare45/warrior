package com.warrior.abstraction.interf;

public class DrawRect implements Drawable {
	@Override
	public void draw(){
		System.out.println("i well drawing Rectriangle");
		
		
	}
	public static void main(String...af) {
	DrawRect dr=new DrawRect();
		dr.draw();
	}
}
 
