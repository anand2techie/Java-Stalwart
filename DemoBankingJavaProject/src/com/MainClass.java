package com; //package declaration

import com.common.CommonClass;
//for the same package components, you'll not have an import statement
//import com.retail.RetailClass; - can't import a class from different package which is not public

public class MainClass {
	
	//1.main 2. calculateAge
	
	private int mainVariable=100;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("I'm inside main");
		
		//call calculateAge method
			//creating an object for the class in which you've a method to be called.
			//ClassName objectName=new ClassName();
			MainClass mainClassObj=new MainClass();
			System.out.println(mainClassObj.mainVariable);
			int age=mainClassObj.calculateAge(1991, 2017); //calling a method
			System.out.println(age);
			
			//RetailClass retailClassObj=new RetailClass();
			//retailClassObj.
			
			TestClass testClassObj=new TestClass();
			testClassObj.testMethod();
			
			CommonClass commonClassObj=new CommonClass();
			System.out.println(commonClassObj.testCommonVariable);
	}

	int calculateAge(int birthYear, int currentYear) // ---> need a return statement
	{
		System.out.println("I'm inside calculateAge");
		int age = currentYear - birthYear;
		return age; // return variableName; --> last line of method ---> you need a return statement
	}

}
