package com.oops;

//child_class extends super_class
public class RemodelledBicycle  extends Bicycle {

	public RemodelledBicycle(String bicycleName, int bicyclePrice) {
		super(bicycleName, bicyclePrice);
		// TODO Auto-generated constructor stub
	}

	//overriding
	boolean withGear=true;
	long price=6000l;
	//int speed=40;
	
	@Override
	int getRidingSpeed() {
		// TODO Auto-generated method stub
		return super.getRidingSpeed();
	}
	
	//re-used bicycle manuf and no.of.wheels
	void printBicycleManufNameAndNoOfWheels()
	{
		System.out.println(bicycleManufacturer);
		System.out.println(noOfWheels);
		System.out.println(protectedVariable);
	}
	
	//new-definitions
	void rideAtMountainsAndLand()
	{
		rideAtLand();
		System.out.println("Yay! I'm riding @ Mountains because I'm a Remod.Bicycle");
	}
}
