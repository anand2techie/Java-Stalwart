package com.smartcoders.sample;


public class FactorialOfANumber {
	
	public int inputVlaue1 ;
	
 public	long factorialMethod(int inputNumber){
	 
	 // setting variable to pass the intput value to main method
	 inputVlaue1=inputNumber;
		
		long factorialOuptut=1;
	
		for (int i=1;i<=inputNumber;i++){
			
			factorialOuptut=factorialOuptut*i;
			
		}
		
		return factorialOuptut;
		
		
	}


}
