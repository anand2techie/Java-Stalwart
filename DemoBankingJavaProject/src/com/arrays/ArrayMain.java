package com.arrays;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating an array
		int[] evenNumbersArray=new int[5];
		
		//adding values to an array: arrayName[index]=value;
		evenNumbersArray[0]=0;
		evenNumbersArray[1]=2;
		evenNumbersArray[2]=4;
		evenNumbersArray[3]=6;
		evenNumbersArray[4]=8;
		
		//System.out.println(evenNumbersArray); // when u print an array without an index, it will print as a reference not the real data
		
	//for(initialize;check-condition;increment/decrement
		for(int i=0;i<evenNumbersArray.length;i++) //evenNumbersArray.length = 5 //0,1,2,3,4,5
		{
			System.out.println(evenNumbersArray[i]);
		}
		
	}

}
