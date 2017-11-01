package com.ArrayAndStringProgramming;

public class MainClassForString {

	//pre-defined value initialization happens only for a primitive. initialized with null
	static String globalStr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	//literal
		String username="Ananth";//array of characters
				//or
		//object
		String usernameAsObject=new String("Ananth");
				//or
		 char data[] = {'A', 'n', 'a','n','t','h'};
	     String str = new String(data);
	 
	     String emptyString=new String();
	     emptyString="test";
	     
		System.out.println(username);
		System.out.println(usernameAsObject);
		System.out.println(str);
		System.out.println("Empty string "+emptyString);
		
		//wap to print the vowel char
		for(int i=0;i<usernameAsObject.length();i++)
		{
			char ch=usernameAsObject.charAt(i);
			//toLowerCase()
							//Character - wrapper class
			char lowerCaseCh=Character.toLowerCase(ch);
			if(lowerCaseCh=='a' || lowerCaseCh=='e' || lowerCaseCh=='i' || lowerCaseCh=='o' || lowerCaseCh=='u')
			{
				System.out.println(ch);
			}
		}
		System.out.println(usernameAsObject);*/
						  //012345
		String firstString="ananth-test-test2-ten";
		int position=firstString.indexOf('a');
		System.out.println("index of character 10: "+firstString.indexOf(110));//working with ascii code
		int positionOfLastOccurrence=firstString.lastIndexOf('a');
		//if a char is not present, you're going to get a '-' ve value
		//first occurrence of that character
		System.out.println(position);//0
		System.out.println(positionOfLastOccurrence);//2
		
		String secondString="Raj";
		
		//comparison is case-sensitive
		int result=firstString.compareTo(secondString);//you're comparing firstString with secondString
				  //object.method(argument); object --> String; argument --> String
		
		int result2=firstString.compareToIgnoreCase(secondString);
		/*System.out.println(result);
		System.out.println(result2);
		
		if(result==0)
		{
			System.out.println("Both Strings are same.");
		}
		
		else
		{
			System.out.println("Nope! They are different.");
		}
		
		boolean resultAsBoolean=firstString.equals(secondString);
		
		//resultAsBoolean == true or resultAsBoolean
		//resultAsBoolean == false or !resultAsBoolean
		if(resultAsBoolean)
		{
			System.out.println("Both Strings are same.");
		}
		else
		{
			System.out.println("Nope! They are different.");
		}= ctrl + shift + forward slash  */
		
		//firstString="ananth";
		System.out.println("ends with: "+firstString.endsWith("nth"));
		String concatenatedString=firstString.concat("narayanan").concat(" Mr");
		System.out.println("after concatenation: "+concatenatedString);
		
		String concatStringWithPlusOperator=firstString+"narayanan"+ "Mr";
		
		System.out.println("contains output: "+concatenatedString.contains("n"));
		
		String emptyString=null;
		//null - even no reference/memory
		//empty - there is a reference, but the data is empty
		
		//always do a null check for a reference type
		if(emptyString!=null)
		{
		System.out.println(emptyString.isEmpty());
		}
		
		//System.out.println(globalStr.isEmpty());
		//NullPointerException - whenever you're operating with null data
		
		//String is immutable
		String replacedString=firstString.replace("ananth", "anan");
		System.out.println("after replacement: "+replacedString);
		
		System.out.println("after trimming:"+firstString.trim());//it's going to remove only leading & trailing spaces
		
		String subString=firstString.substring(0);
		String subStringWithEndIndex=firstString.substring(0,5);//from index - inclusive; to index - exclusive
		System.out.println("sub string: "+subString);
		System.out.println("sub string with end index: "+subStringWithEndIndex);
		
												   //reference or delimiter character
		String[] firstStringArray=firstString.split("-"); // use double slash for character like ==> . * etc....
		
		System.out.println("After splitting:");
		for(int i=0;i<firstStringArray.length;i++)
		{
			System.out.println(firstStringArray[i]);//0--> ananth; 1---> test; 2--> test2; 3 --> ten
		}
		
		/*String localString = null;
		System.out.println(localString);*/
	}

}
