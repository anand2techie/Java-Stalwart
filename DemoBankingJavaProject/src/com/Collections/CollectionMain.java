package com.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionMain {

	public static void main(String[] args) {
		//learnListInCollection();
		
		//learnSetInCollection();
		
		learnMapInCollectionConcept();
	}

	private static void learnMapInCollectionConcept() {
		// TODO Auto-generated method stub
		
		//creating a Map
		Map<String,String> teamCaptainsMap=new LinkedHashMap<String,String>();
		
		//System.out.println(teamCaptainsMap.isEmpty());
		//adding value to the Map
		teamCaptainsMap.put("India", "Virat Kohli");
		teamCaptainsMap.put("Pakistan", "Virat Kohli");
		teamCaptainsMap.put("Australia", "Steven Smith");
		teamCaptainsMap.put("South Africa", "AB De Villiers");
		teamCaptainsMap.putIfAbsent("India", "Rohit Sharma");//overrides the old value
		//System.out.println(teamCaptainsMap.isEmpty());
		//printing the map
		//System.out.println(teamCaptainsMap);
		
		//System.out.println(teamCaptainsMap.get("India"));//null will be returned for a non-existing key
		
		teamCaptainsMap.remove("India");
		
		//iterateMapUsingKeySet(teamCaptainsMap);
		
		//iterateMapusingValues(teamCaptainsMap);
		
		//using entrySet()
		Set<Entry<String, String>> teamCaptainsEntrySet=teamCaptainsMap.entrySet();
		
		System.out.println("Using entry set: ");
		Iterator<Entry<String, String>> teamCaptainsEntrySetIr=teamCaptainsEntrySet.iterator();
		while(teamCaptainsEntrySetIr.hasNext())
		{
			Entry teamCaptainEntry=teamCaptainsEntrySetIr.next();//both keys and values will be available in a single object called "Entry"
			System.out.println("Key: "+teamCaptainEntry.getKey());
			System.out.println("Value: "+teamCaptainEntry.getValue());
		}
		/*System.out.println(teamCaptainsMap);
		teamCaptainsMap.clear();
		System.out.println(teamCaptainsMap.isEmpty());*/
	}

	private static void iterateMapusingValues(Map<String, String> teamCaptainsMap) {
		System.out.println("Only values:");
		Collection<String> teamCaptainNames=teamCaptainsMap.values();
		
		Iterator<String> teamCaptainNamesIr=teamCaptainNames.iterator();
		while(teamCaptainNamesIr.hasNext())
		{
			String captainName=teamCaptainNamesIr.next();
			System.out.println(captainName);
		}
	}

	private static void iterateMapUsingKeySet(Map<String, String> teamCaptainsMap) {
		//iterating a Map - Map can't be iterated directly
		Set<String> teamCaptainsKeySet=teamCaptainsMap.keySet();
		
		Iterator<String> teamCaptainKeySetIr=teamCaptainsKeySet.iterator();
		
		System.out.println("Both keys & values:");
		while(teamCaptainKeySetIr.hasNext())
		{
			String teamName=teamCaptainKeySetIr.next();
			
			System.out.println(teamName);//key
			System.out.println(teamCaptainsMap.get(teamName));//value
		}
	}

	private static void learnSetInCollection() {
		// TODO Auto-generated method stub
		
		//creating a Set
		Set<String> studentNamesSet=new LinkedHashSet<String>(); // random order
		
		//adding values to set
		studentNamesSet.add("Dave");
		studentNamesSet.add("Rajiv");
		studentNamesSet.add("Alex");
		studentNamesSet.add("Mike");
		studentNamesSet.add("Mike");//duplicate values not allowed
		
		System.out.println("Before removal");
		System.out.println(studentNamesSet);
		
		System.out.println(studentNamesSet.size());
		
		Iterator<String> studentNamesSetIterator=studentNamesSet.iterator();
		
		while(studentNamesSetIterator.hasNext())
		{
			String value=studentNamesSetIterator.next();
			
			if(value.equals("Alex"))
			{
				//removing a value from an iterator will remove the value from the set
				studentNamesSetIterator.remove();
			}
		}
		System.out.println("After removal");
		System.out.println(studentNamesSet);
		
	}

	private static void learnListInCollection() {
		// TODO Auto-generated method stub
		
		//creating a List
		//List numbersList=new List(); --> can't create an object for an interface
		
		//If u specify the data type, We call it as Generic
		List<Integer> numbersList=new ArrayList<Integer>();
		
		numbersList.listIterator(); //have an option to traverse backwards
		
		System.out.println(numbersList.isEmpty());
		//adding values to the list
		
		//autoboxing is automatically taken care by the List
		numbersList.add(100);//0
		numbersList.add(234);//1
		numbersList.add(67);//2
		numbersList.add(78);//3
		numbersList.add(90);//4
		numbersList.add(90);//4
		//numbersList.add("Charles");//4
		
		//primitive int ----> Object Integer (Wrapper class) automatically ====> autoboxing
		
		//printing list values
		System.out.println(numbersList);
		
		System.out.println("Using For loop: ");
		for(int i=0;i<numbersList.size();i++)
		{
			//always list get() returns an object
			int number=(int)numbersList.get(i);
			if(number%2==0)
			{
				System.out.println(number);
			}
		}
		
		System.out.println("Using Iterator: ");
		Iterator<Integer> numberListItr=numbersList.iterator();
		
		while(numberListItr.hasNext())
		{
			System.out.println(numberListItr.next());
		}
		
		/*//based on index
		numbersList.remove(4);
		
		System.out.println("After removal: ");
		System.out.println(numbersList);*/
		
		//inserting an element at the specified index
		numbersList.add(2,1000);
		
		//overriding an element at the specified index
		numbersList.set(2,500);
		
		List<Integer> anotherList=new ArrayList<Integer>();
		
		//add ALl the elements from one list to another list
		numbersList.addAll(anotherList);
		
		//numbersList.addAll(3,anotherList);
		System.out.println("Is it equal: "+numbersList.equals(anotherList));
		
		System.out.println(numbersList);
		
		System.out.println("Before clear:");
		System.out.println(numbersList.isEmpty());
		numbersList.clear();

		System.out.println("After clear:");
		System.out.println(numbersList.isEmpty());
	}

}
