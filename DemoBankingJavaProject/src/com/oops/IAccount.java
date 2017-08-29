package com.oops;

public interface IAccount extends ICountryLevelAccount{
	
	/* Interfaces cannot have constructors
	IAccount()
	{
		
	}*/

	//only public, static & final are permitted for a variable
	String bankName="BNP Paribas";
	float rateOfInterest=10.3f;
	
	
	//only public, abstract, default, static and strictfp are allowed for a method
	void depositAmount(long amount);
	void withdrawAmount(long amount,int periodOfTime);
	int doSomething1();
	String doSomething2();
	float doSomething3();
	
}
