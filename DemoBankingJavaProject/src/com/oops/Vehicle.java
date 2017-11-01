package com.oops;

public abstract class Vehicle {

	// We can have constructors
	public Vehicle() {
		// TODO Auto-generated constructor stub
		System.out.println(getVehicleName());
	}

	public Vehicle(String vehicleName, int vehiclePrice) {
		// TODO Auto-generated constructor stub
		System.out.println(getVehicleName() + " " + vehiclePrice);
	}
	
	public Vehicle(String vehicleName, int vehiclePrice,int number) {
		// TODO Auto-generated constructor stub
		System.out.println("inside 3 arg const");
	}

	abstract void rideAtLand(); // declaration not definition

	abstract void rideAtWater(); // declaration not definition

	// definition
	static String getVehicleName() {
		return "My vehicle name is BullDozer.....";
	}

	int getVehicleRegistrationNo() {
		return 12345;
	}

}
