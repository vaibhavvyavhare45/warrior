package com.warrior.abstraction.interf;
class Car implements Vehicle{
	
	int speed;
	int gear;
	@Override
	 public void changeGear(int newGear){
		gear=newGear;		
	}
	@Override
	 public void speedUp(int increment) {
		 speed+=increment;
	 }
	@Override
	 public void applyBreak(int decrement) {
		 speed-=decrement;
	 }
	 
	 public void displayState() {
		 System.out.println("speed: "+speed+"gear: "+gear);
	 }
}

public class Bike implements Vehicle {
	int speed;
	int gear;
	@Override
	 public void changeGear(int newGear){
		gear=newGear;		
	}
	@Override
	 public void speedUp(int increment) {
		 speed+=increment;
	 }
	@Override
	 public void applyBreak(int decrement) {
		 speed-=decrement;
	 }
	 public void printState() {
		 System.out.println("speed: "+speed+"gear: "+gear);
	 }
	 public static void main(String...ag){
		 Bike b=new Bike();
		 b.changeGear(2);
		 b.speedUp(4);
		 b.applyBreak(3);
		 System.out.println("present state bike");
		 b.printState();
		 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 Car c=new Car();
		 c.changeGear(1);
		 c. speedUp(3);
		 c.applyBreak(5);
		 System.out.println("present state car");
		 c.displayState();
	 }
	 

}
