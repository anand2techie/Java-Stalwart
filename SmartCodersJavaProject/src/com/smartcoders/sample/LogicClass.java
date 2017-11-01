package com.smartcoders.sample;

public class LogicClass {
	
	static boolean globalBooleanVariable;//false
	
	//non-static variable
	double testGlobalDoubleVariable;

	//method2
		void testMethod()
		{
			System.out.println(globalBooleanVariable);
			int localTestVar=100;
			//System.out.println(accountNumber); local variables of another method can't be accessed here.
			System.out.println(localTestVar);
			
			sumofNumbers(100, 300);
			
			//don't have a return statement
		}

		//method3
		void testNonStaticMethod()
		{
			System.out.println(testGlobalDoubleVariable);
			
			//don't have a return statement
		}
		
		//method to find sum of 2 numbers
								//a1=100;a2=200
		int sumofNumbers(int a1,int a2)
		{
			//1
			//2
			//3
			int sumOfSomething=a1+a2;
			//return statement is mandatory if returnType is other than "void"
			return sumOfSomething;
		}
}
