package com.smartcoders.sample;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		FactorialOfANumber factorialObj= new FactorialOfANumber();
		// Finding factorial of a number
		int inputForFactorial=6;
		long factorialOutput=factorialObj.factorialMethod(inputForFactorial);
		
		System.out.println("Factorila of "+inputForFactorial +" is :"+factorialOutput);
		// Finding a prime number 
		FindAPrimeNumber primeNumberObj=new FindAPrimeNumber();
		boolean primeNumberOutput =primeNumberObj.findingPrimeNumber(41);
		if ( primeNumberOutput==true) {
			
			System.out.println("Given number "+ primeNumberObj.inputVlaue1 +" is prime number ")	;
		} else {
			
			System.out.println("Given number "+ primeNumberObj.inputVlaue1 +" is not a prime number ")	;
		}
		//Printing the number in some pattern.
	 PrintingNumbersPattern numberPatternObj= new PrintingNumbersPattern();
	  
	 int numberPattern= numberPatternObj.inputVlaue1;
	 
	 System.out.println("Printing the numbers in below pattern based on the input:"+numberPattern);
	 numberPatternObj.printNumberSeries(100);

	}

	
}