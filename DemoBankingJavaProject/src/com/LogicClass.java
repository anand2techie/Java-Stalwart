package com;

public class LogicClass {

	
	
	//define a method --> returnType methodName(){.....................}
	boolean findANumberPrimeOrNot(int number){
		
		//logic
		
		//for loop
		/*for(initialization;check the condition;increment/decrement)
		 * {
		 * 
		 * 
		 * }
		 */
		
		//variable declaration
		int count=0;
		
		for(int denominator=1;denominator<=number;denominator++)
		{
			
			int reminder=number%denominator;
			
			//System.out.println("reminder: "+reminder);
			//if(condition){........................}
			if(reminder==0)
			{
				count=count+1; //post-increment ---> count++;
			}
			// / ---> quotient ; % ---> reminder
			System.out.println("count: "+count); //appending constants --> +
		}
		
		if(count==2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
