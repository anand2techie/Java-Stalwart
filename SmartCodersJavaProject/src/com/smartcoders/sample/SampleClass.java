//package statement: package packageName;
package com.smartcoders.sample;

//blocks doesn't need a semi-colon
class SampleClass {

	//scribbleeeeeee;
	
	//global variables - defined outside a block
	//doesn't need to be initialized. All the global variables will be initialized with default values
	
	//static
	static int globalVariable;//0
	static float globalFloatVariable;//0.0
	static char globalCharVariable;//junk
	
			
	//method1
	//blocks doesn't need a semi-colon
	
	//Static - are considered as class members. static properties can access only other static properties
	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		System.out.println("Hi, This is my first Java program.");
		//sdsdasd;
		//System.out.println(accountNumber); - Cannot make a static reference to the non-static field accountNumber
		
		//local variables - defined inside a block/method
		int accountNumber=12345;
		char accountType='S'; //S - Savings ,R - Recurring ,L - Loan
		boolean isPremium=false;
		long accountBalance=10000l;
		float rateofInterest=12.4f;
		
		int testVariable=0;
		
		System.out.println("My account number is: "+accountNumber);
		System.out.println("Rate of interest is: "+rateofInterest);
		
		rateofInterest=rateofInterest+(0.5f);
		
		System.out.println("Rate of interest after update: "+rateofInterest);
		
		//System.out.println(testVariable); //The local variable testVariable may not have been initialized
		
		System.out.println("global int value is "+globalVariable);
		System.out.println("global float value is "+globalFloatVariable);
		System.out.println("global char value is "+globalCharVariable);
		System.out.println("global boolean value is "+globalBooleanVariable);*/
		
		System.out.println("Inside main method");
		//Method have to be called to be executed
		
		//sumofNumbers(100,10000); - same class
		
		//We need an object of LogicClass to access its' properties
		LogicClass logicClassObj=new LogicClass();
		logicClassObj.testMethod();
		//System.out.println(logicClassObj.testGlobalDoubleVariable);
		//can have any other variable name
							//user inputs
		
		//object being used as a reference for accessing a class' properties
		int sum=logicClassObj.sumofNumbers(100,10000);//calling the method with right arguments passing the i/ps at the same time.
		//sum=sumOfSomething;
		
		System.out.println("Sum of two numbers is "+sum);
	}
	
}
