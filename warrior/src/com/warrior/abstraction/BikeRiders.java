package com.warrior.abstraction;

abstract class MotorBike
{
abstract void m1();
}
class SportsBike extends MotorBike
{
void m1()
{
System.out.println("Sports bike break");
}
}
class MountainBike extends MotorBike
{
void m1()
{
System.out.println("Mountain Bike break");
}
}
class BikeRiders
{
public static void main(String args[])
{
MountainBike m1=new MountainBike();
m1.m1();

MotorBike b1=new SportsBike();
b1.m1();
}
}

