package com.arrays;

public class ArrayMain {
	
	
	int xxxInstanceVariable;
	static int xxxStaticVariable;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(xxxStaticVariable);
		//System.out.println(xxxInstanceVariable);
		
		int number=0;
		
		int quotient=10/number; //infinity
		
		int[] numbersArray = createAnArray();
		addValuesToAnArray(numbersArray);
		
		ArraysUsageClass.learnArraysMethods(numbersArray);
		ArraysUsageClass.iterateAnIntArray(numbersArray);
		//ArrayUtil.learnArrayOfObjects();
		/*//calling a static method from another static method (same class) - possible
		
		char[] accountTypeArray2={'S','L','C','R'};
		
		addValuesToAnArray(evenNumbersArray);
		//last index of this array is 9.
		
		//System.out.println(evenNumbersArray); // when u print an array without an index, it will print as a reference not the real data
		
		iterateArraysUsingDiffLoops(evenNumbersArray, accountTypeArray2);
		ArrayUtil arrayUtil=new ArrayUtil();
		arrayUtil.insertElementIntoAnIntegerArray(10000, numbersArray, 2);
		
		//calling a static properties from another static method (diff class) - possible
		ArrayUtil.testStaticMethod();
		
		//calling a non-static properties from another static method (saame class) - not possible
		//testInstanceMethod();
		*/
	}


	private static void addValuesToAnArray(int[] evenNumbersArray) {
		//adding values to an array: arrayName[index]=value;
		evenNumbersArray[0]=0;
		evenNumbersArray[1]=10;
		evenNumbersArray[2]=8;
		evenNumbersArray[3]=6;
		evenNumbersArray[4]=4;
		evenNumbersArray[5]=2;
	}


	private static void iterateArraysUsingDiffLoops(int[] evenNumbersArray, char[] accountTypeArray2) {
		//for(initialize;check-condition;increment/decrement
			for(int i=0;i<evenNumbersArray.length;i++) //evenNumbersArray.length = 5 //0,1,2,3,4,5
			{
				
								//retrieving (or) accessing the values back
				System.out.println(evenNumbersArray[i]);
			}
			
			/*for-each
			for(dataType variableName:array)
			{
			
			}
			*/
			for(char ch:accountTypeArray2)
			{
				System.out.println(ch);
			}
			
			for(int i=0;i<accountTypeArray2.length;i++)
			{
				System.out.println(accountTypeArray2[i]);
			}
	}


	private static void createAccountTypesWithValuesLoaded() {
		//account type --> S,L,C,R
		char[] accountTypeArray=new char[4];
		accountTypeArray[0]='S';
		accountTypeArray[1]='L';
		accountTypeArray[2]='C';
		accountTypeArray[3]='R';
	}

	
	//create an integer array
	private static int[] createAnArray() {
		//Creating an array
		int[] evenNumbersArray=new int[10];
		return evenNumbersArray;
	}
	
	void testInstanceMethod(){
		
		//calling a static properties from an instance method (different class)- possible
		ArrayUtil.testStaticMethod();
		
		System.out.println(xxxStaticVariable);
		System.out.println(xxxInstanceVariable);
	}

}
