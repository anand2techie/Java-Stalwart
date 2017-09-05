package com.arrays;

public class ArrayUtil {
	
	//Methods other than static are called instance methods
	//3 things?????
	void insertElementIntoAnIntegerArray(int elementToBeInserted,int[] oldArray,int indexWhereToBeInserted)
	{
		System.out.println("Before insertion");
		printArrayValues(oldArray);
		
		//increment the array size by 1
		int[] newArray=new int[oldArray.length+1];
		
		//copying old values until insertion point
		for(int i=0;i<indexWhereToBeInserted;i++)
		{
			newArray[i]=oldArray[i];
		}
		
		//insertion point
		newArray[indexWhereToBeInserted]=elementToBeInserted;
		
		//copying old values after insertion point
		for(int j=indexWhereToBeInserted;j<oldArray.length;j++)
		{
			int newArrayIndex=j+1;
			newArray[newArrayIndex]=oldArray[j];
		}
		
		System.out.println("after insertion");
		printArrayValues(newArray);
		
		//calling a static properties from an instance method (same class)- possible
		testStaticMethod();
	}
	
	void printArrayValues(int[] testArray)
	{
		for(int i:testArray)
		{
			System.out.println(i);
		}
	}
	
	//class loading
	static void testStaticMethod()
	{
		//instanceMethod();
	}
	
	void instanceMethod()
	{
		testStaticMethod();
	}

}
