package com;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Customer customerObj=new Customer(); //default constructor
		
		Customer customerObjWith4Arguments=new Customer("Charles",12345l,100000,'S'); //4 parameterized constructor
		//customerObjWith4Arguments.printCustomerDetails();
		
		//Customer customerObjWith3Arguments=new Customer("Charles",12345l,'S'); //3 parameterized constructor
		
		
		//conversion of primitive to Wrapper: int to Integer
		int rollNumberInPrimitive=12345;
		
		//We don't have any inbuilt support for Primitive. Primitive just holds the data
		//rollNumberInPrimitive.
		
		//ClassName objectName=new ConstructorName();
		Integer rollNumberAsAWrapper=new Integer(rollNumberInPrimitive);
		
		System.out.println(rollNumberAsAWrapper);
		
		//after Java 5  --> Autoboxing
		Integer rollNumberAsWrapperOpt2=rollNumberInPrimitive;
		
		//Wrapper provides lot of options: rollNumberAsWrapperOpt2.
		
		//conversion of Wrapper to primitive: Integer to int --> Unboxing
		int rollNumberBackToPrimitive=rollNumberAsAWrapper;
		
		float rateOfInterestInFloat=8.17f;

		//decimal to whole: there is a chance of data getting chopped off!
		//explicit typecasting
		int rateOfInterestInInt=(int) rateOfInterestInFloat;
		
		//whole (8) to decimal (8.00): there is no chance of data getting chopped off!
		//implicit typecasting
		float rateOfInterestBackToFloat=rateOfInterestInInt;
		
		
	}

}
