package com.OOPS;

public interface IParent1 {

	//by default, all the variables are final.
	int accountNo=100;//Illegal modifier for the interface field IParent1.accountNo; only public, static & final are permitted
	String studentName="Raj";
	
	//by default, all the methods are abstract in Interface
	void xxx(); //Illegal modifier for the interface method xxx; only public, abstract, default, static and strictfp are permitted
	void yyy();
	void aaa(int number);
	
	/*
	 * Interfaces cannot have constructors
	 * IParent1()
	{
		
	}*/
	//you can't have concrete methods
	
}
