package com.arrays;

import java.util.Arrays;

public class ArraysUsageClass {

	static void learnArraysMethods(int[] numbersArray)
	{
		/*sortIntArray(numbersArray);
		searchAnElementInAnIntArray(numbersArray);*/
		
		copyArrayElements(numbersArray);
		copyArrayElementsWithRange(numbersArray);
		
		//System.out.println(Arrays.equals(newArray, numbersArray));
		
		convertArrayToAString(numbersArray);
	}

	private static void convertArrayToAString(int[] numbersArray) {
		System.out.println(Arrays.toString(numbersArray));
	}

	private static void copyArrayElementsWithRange(int[] numbersArray) {
		//from - inclusive ,end - exclusive
		//0,1,2,3,4,5,6,7,8,9,10
			//  . . . . e
int[] newArrayWithRange=Arrays.copyOfRange(numbersArray, 3, 7);
System.out.println("Value of new array with range");
//iterateAnIntArray(newArrayWithRange);
	}

	private static void copyArrayElements(int[] numbersArray) {
		//copyOf - to copy values from one array to another array
												  	//end
		int[] newArray=Arrays.copyOf(numbersArray, numbersArray.length);
		System.out.println("Value of new array");
		//iterateAnIntArray(newArray);
	}

	private static void searchAnElementInAnIntArray(int[] numbersArray) {
		//to search an element in an array
		if(Arrays.binarySearch(numbersArray, 8)<0)
		{
			System.out.println("value is not present");
		}
		else
		{
			System.out.println("It is present");
		}
		//if binarySearch returns '-'ve value, that value is not present
		
		//don't use binary search for fining index of an value. it help u to only find whether a value is present or not
	}

	private static void sortIntArray(int[] numbersArray) {
		System.out.println("Before sorting");
		iterateAnIntArray(numbersArray);
		//to sort  the array values in asc order
		Arrays.sort(numbersArray);
		System.out.println("After sorting");
		iterateAnIntArray(numbersArray);
	}

	private static void iterateAnIntArray(int[] numbersArray) {
		for(int number:numbersArray)
		{
			System.out.println(number);
		}
	}
}
