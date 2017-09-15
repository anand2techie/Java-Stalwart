package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating a List
		//List namesList=new List(); --> can't create an object for an interface
		List namesList=new ArrayList();
		
		//adding values to the list
		namesList.add("Charles");
		namesList.add("Alex");
		namesList.add("Dave");
		namesList.add("Raj");
		namesList.add("Alex");
		
		//printing list values
		System.out.println(namesList);
	}

}
