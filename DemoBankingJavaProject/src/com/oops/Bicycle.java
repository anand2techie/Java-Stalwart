package com.oops;

public class Bicycle extends Vehicle{

	String bicycleManufacturer="BSA";
	boolean withGear=false;
	int noOfWheels=2;
	long price=2000l;
	int speed=20;
	
	public Bicycle(String bicycleName, int bicyclePrice) {
		// TODO Auto-generated constructor stub
		super(bicycleName,bicyclePrice,100); //super is a keyword to call parent class argument matching constructor. Should always be @ first line
		System.out.println(bicycleManufacturer + " " + bicyclePrice);
	}
	
	protected int protectedVariable=100;
	
	int getRidingSpeed(){
		return speed;
	}

	@Override
	void rideAtWater() {
		// TODO Auto-generated method stub
		System.out.println("No, I can't");
	}

	@Override
	void rideAtLand() {
		// TODO Auto-generated method stub
		System.out.println("Yes, I can ride @ land");
	}
}
