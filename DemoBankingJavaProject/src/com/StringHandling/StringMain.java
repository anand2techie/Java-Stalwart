package com.StringHandling;

public class StringMain {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nullString=null;
		
		//you're doing with nothing
		System.out.println(nullString.length());
		
		String emptyString="";
		
		String commaSeparatedNames="Arun,Dinesh,Raj,Dave";
		
		String nameWithLocation="Alex-Chennai";
		
		String customerNameAsALiteral="Charles david";//literal
												//0123456
		String customerNameAsAnObject=new String("charles david");//object
		
		char[] nameArray={'c','h','a','r','l','e','s'};
		String customerNameAsAnArray=new String(nameArray);//from an array
		
		//System.out.println(customerNameAsALiteral+" "+customerNameAsAnObject+" "+customerNameAsAnArray);
		
		StringMain main=new StringMain();
		/*main.printVowelCharacters(customerNameAsAnObject);
		compareTwoStringsUsingCompareTo(customerNameAsALiteral, customerNameAsAnObject,false);*/
		
		/*customerNameAsAnObject = concatStrings(customerNameAsAnObject);
		
		useContainsMethod(customerNameAsAnObject);
		
		isStringEndingWithxxx(customerNameAsAnObject);
		
		isEqualsIgnoringCase(customerNameAsALiteral, customerNameAsAnObject);
		
		useIndexOfMethods(customerNameAsAnObject);
		
		isEmptyString(emptyString);
		*/
		String customerNameAfterReplacement=customerNameAsAnObject.replace("david", "malik");
		
		//System.out.println("After replacement: "+customerNameAfterReplacement);
		
		String[] namesArray=commaSeparatedNames.split(",");
		
		String[] nameAndLocationSplittedArray=nameWithLocation.split("\\.");
		System.out.println(nameAndLocationSplittedArray[0]);//Alex-Chennai
		//System.out.println(nameAndLocationSplittedArray[1]);
		/*
		for(String name:namesArray){
			System.out.println(name);
		}*/
		
		char[] charFromString=customerNameAsAnObject.toCharArray();
		for(char ch:charFromString)
		{
			System.out.println(ch);
		}
		
		System.out.println(emptyString);
		//trim trims the spaces only in the leading & trailing
		System.out.println(emptyString.trim());
		
		//YOu pass from index to a substring. A new String would be formed
		System.out.println(customerNameAsAnObject.substring(4));
													    //from,end
		System.out.println(customerNameAsAnObject.substring(4, 7));
	}

	private static void isEmptyString(String emptyString) {
		System.out.println(emptyString.isEmpty());
	}

	private static void useIndexOfMethods(String customerNameAsAnObject) {
		//first occurrence of a character
		System.out.println(customerNameAsAnObject.indexOf('a'));
		
		//last occurrence of a character
		System.out.println(customerNameAsAnObject.lastIndexOf('a'));
	}

	private static void isEqualsIgnoringCase(String customerNameAsALiteral, String customerNameAsAnObject) {
		boolean isEqual=customerNameAsAnObject.equalsIgnoreCase(customerNameAsALiteral);
		System.out.println(isEqual);
	}

	private static void isStringEndingWithxxx(String customerNameAsAnObject) {
		boolean isEndingWithxxx=customerNameAsAnObject.endsWith("vi");
		System.out.println(isEndingWithxxx);
	}

	private static void useContainsMethod(String customerNameAsAnObject) {
		boolean isPresent=customerNameAsAnObject.contains("david");
		System.out.println(isPresent);
	}

	private static String concatStrings(String customerNameAsAnObject) {
		customerNameAsAnObject=customerNameAsAnObject.concat(" david");
		System.out.println(customerNameAsAnObject);
		return customerNameAsAnObject;
	}

	private static void compareTwoStringsUsingCompareTo(String customerNameAsALiteral, String customerNameAsAnObject,boolean caseSensitive) {
		
		int comparedResult=0;
		if(caseSensitive)
		{
		comparedResult=customerNameAsAnObject.compareTo(customerNameAsALiteral);
		}
		else
		{
		comparedResult=customerNameAsAnObject.compareToIgnoreCase(customerNameAsALiteral);
		}
		
		if(comparedResult==0)
		{
			System.out.println("Two strings are equal");
		}
		else
		{
			System.out.println("Nope");
		}
	}
	
	void printVowelCharacters(String someData)
	{
		//length() ---> gives you length of the String
		for(int i=0;i<someData.length();i++)
		{
			//charAt() ---> extracts the char from the specified index
			char ch=someData.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				System.out.println(ch);
			}
		}
	}

}
