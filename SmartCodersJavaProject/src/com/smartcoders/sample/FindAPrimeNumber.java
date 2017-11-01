package com.smartcoders.sample;


public class FindAPrimeNumber {
	 // setting variable to pass the intput value to main method
	public int inputVlaue1 ;
	
	public boolean findingPrimeNumber (int inputNumber){
	
		inputVlaue1= inputNumber;
	int divideCount =0;
	 double reminder;
	 boolean numberOutput;
	 //If any number divide by 1 and itself only then we call it as a prime number  2-9
	for (int i=1;i<=9;i++){	   
		reminder=inputNumber%i;
	if (reminder==0){
		divideCount++;	
	}		
		
	}
	//Below clause is for finding prime number for single digit numbre  1 to 9
    if (inputNumber >0   && inputNumber <=9  && divideCount==2)	{
    
    	numberOutput=true;
    	
    }  else if (inputNumber>9 && divideCount==1) {
    	numberOutput=true;
    } else {
    	numberOutput=false;
    }
 return numberOutput;
		
	}
	
}