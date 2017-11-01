package com.oops;

public class BicycleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IAccount account=new SavingsAccount();
		
		/*//Type 1: Using reference as Super class & Constructor as Super class
	   //Reference objectName=new ConstructorName();
		Bicycle bsaBicycle=new Bicycle();
		System.out.println(bsaBicycle.bicycleManufacturer);
		System.out.println(bsaBicycle.getRidingSpeed()); //20
		//bsaBicycle.rideAtMountainsAndLand();// --> not possible
		System.out.println(bsaBicycle.protectedVariable);*/
		//Type 2: Using reference as Sub class & Constructor as Sub class
		/*RemodelledBicycle remodelledBsaBicycle=new RemodelledBicycle();
		System.out.println(remodelledBsaBicycle.bicycleManufacturer);
		System.out.println(remodelledBsaBicycle.getRidingSpeed()); //40
		remodelledBsaBicycle.rideAtMountainsAndLand();
		
		//Type 3: Using reference as Super class & Constructor as Sub class
		Bicycle remodBicycleSupClsAsRef=new RemodelledBicycle();
		System.out.println(remodBicycleSupClsAsRef.bicycleManufacturer);
		System.out.println(remodBicycleSupClsAsRef.getRidingSpeed()); //40
		//remodBicycleSupClsAsRef.rideAtMountainsAndLand();
*/		
		//Type 4: Using reference as Sub class & Constructor as Super class --> impossible
		//RemodelledBicycle remodBicycleRemodBicAsRef=new Bicycle();
		
		//OPtion1 for your question
		//Vehicle vehicle=new Vehicle(); - can't create object for an Abstract class
		Vehicle.getVehicleName(); // direct access of methods using class name, since object can't be created for an Abstract class
		
	/*	//Option2 for your question
		Vehicle bicycleAsVehicleAsRef=new Bicycle();
		bicycleAsVehicleAsRef.getVehicleRegistrationNo();*/
		
		//At this point, You can't call the matching constructor of Abstract class. call always goes to default constructor
		Vehicle bicycleAsVehicleAsRefWith2Arg=new Bicycle("Atlas",10000); 
		
	}

}
