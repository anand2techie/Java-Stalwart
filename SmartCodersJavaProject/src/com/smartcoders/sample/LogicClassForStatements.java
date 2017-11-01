package com.smartcoders.sample;

public class LogicClassForStatements {

	//method1			
	boolean findEvenOrNot(int number)
	{
		boolean result=false;
		//equality operator ==
		if(number%2==0)
		{
			result=true;
		}
		return result;
	}
	
	//method2
	void findEvenOrNotWithLimit(int limit)
	{
		//to find all even numbers within the limit
		/*
		 * int i=0; //i will act as a pointer to this while loop
		 * while(condition)
		 * {
		 * 
		 * i++;//increment
		 * }
		 * 
		 */
		
		/*//e.g. while(101<=100)
		 * int i=1;//local variable
		while(i<=limit)
		{
			if(i%2==0)
			{
				System.out.println(i +" is even");
			}
			else
			{
				System.out.println(i +" is odd");
			}
			
			i++;//increment i by 1
		}*/
		
		//1- initialization will happen only for the first time.
			//1		//2	(5)	 //4 (7)
		for(int i=1;i<=limit;i++)
		{
			//3 (6)
			if(i%2==0)
			{
				System.out.println(i +" is even");
			}
			else
			{
				System.out.println(i +" is odd");
			}
		}
	}
}
