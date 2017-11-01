package com.smartcoders.sample;

public class MainClassForWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//primitive
		//local variable
		int rollNumber=100;//just the place holder that holds the data
		
		//rollNumber. --> no functional knowledge
		
		//Integer class doesn't have a default constructor: wrap a primitive into a Wrapper class
		
		//Object ----> reference variable
		Integer rollNumberAsWrapper1=new Integer(rollNumber);
		
		//Integer = Student (for understanding)
		
						//or
		
		//Autoboxing: converting a primitive to a wrapper
		Integer rollNumberAsWrapper2=rollNumber;
		//rollNumberAsWrapper2. --> has functional knowledge. can use any of Integer class' properties: variable, method, constructor
		//Unboxing: converting a wrapper back to primitive
		//when we need this? - To restore the natural behavior of any specific primitive data type
		int rollNumberBackToPrimitive=rollNumberAsWrapper2;
		
		char accountType='S';//Savings account
		char anotherChar='A';
		//accountType. ---> nothing, no logical suppport
		
		
		Character accountTypeAsUpperCaseWrapper=new Character(Character.toUpperCase(accountType));//S
		Character anotherCharAsUpperCaseWrapper=new Character(Character.toUpperCase(anotherChar));//8
		
		int output=accountTypeAsUpperCaseWrapper.compareTo(anotherCharAsUpperCaseWrapper);//case-sensitive method
		
		if(output==0)
		{
			System.out.println("Chars are equal");
		}
		else
		{
			System.out.println("Chars are not equal");
		}
		//accountTypeAsWrapper.isDigit(accountType);
		//accountTypeAsWrapper.
		//System.out.println(Character.isDigit(accountType));
	}

}

