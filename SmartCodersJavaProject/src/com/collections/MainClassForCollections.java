package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

import com.smartcoders.sample.Student;
import com.smartcoders.sample.StudentUtil;

public class MainClassForCollections {

	public static void main(String[] args) {
		
		//workWithArrayListOfUserDefinedObjects();
	/*	
		String str1=new String("Bob");//reference 1
		String str2=new String("Bob");//reference 2
		*/
		
		//== will not work for comparing references
		
		//using literal
		String str1="Bob";
		String str2="Bob";
		doStringComparisonWithEqualTo(str1, str2);
		doStringComparisonWithEqualsMethod(str1, str2);
		//workWithSet();
	}


	public static void workWithSet() {
		// TODO Auto-generated method stub
		//creating a Set
		Set customerLocationSet=new TreeSet();
		
		//add elements to Set
		customerLocationSet.add("Chennai");
		customerLocationSet.add("Hyderabad");
		customerLocationSet.add("California");
		customerLocationSet.add("Texas");
		customerLocationSet.add("Chennai");
		
		//same as list--> customerLocationSet.iterator()
		
		/*//same as list--> customerLocationSet.clear();
		System.out.println(customerLocationSet);
		customerLocationSet.remove("Texas");*/
		System.out.println(customerLocationSet);
		
		customerLocationSet.size();
		
		/*
		Set hashSet=new HashSet();
		
		Set treeSet=new TreeSet();*/
		
		
	}

	static void workWithArrayListOfUserDefinedObjects()
	{
		//Generic - to specify what type of elements this list is going to hold/store
		List<Student> students=new ArrayList<Student>();
		
		Student alexObj=new Student();
		alexObj.setAge(18);
		alexObj.setStudentName("Alex");
		alexObj.setStudentLocation("Los Angeles");
		
		Student daveObj=new Student();
		daveObj.setAge(18);
		daveObj.setStudentName("Dave");
		daveObj.setStudentLocation("Los Angeles");
		
		Student chrisObj=new Student();
		chrisObj.setAge(18);
		chrisObj.setStudentName("Chris");
		chrisObj.setStudentLocation("Los Angeles");
		
		Student bobObj=new Student();
		bobObj.setAge(18);
		bobObj.setStudentName("Bob");
		bobObj.setStudentLocation("Los Angeles");
		
		students.add(alexObj);
		students.add(daveObj);
		students.add(chrisObj);
		students.add(bobObj);
		
		System.out.println(students);
		/*
		Iterator<Student> studentsIr=students.iterator();
		
		while(studentsIr.hasNext())
		{
			//there is no need of explicit type casting, since We specified the generic
			Student student=studentsIr.next();
			System.out.println(student.getStudentLocation());
			System.out.println(student.getStudentName());
		}*/
		
		Student testObj=new Student();
		testObj.setAge(18);
		testObj.setStudentLocation("Los Angeles");
		testObj.setStudentName("Bob");
		
		//comparison is based on reference
		
		//but if you want the comparison based on some properties, you need to write some coding!
		System.out.println(testObj);
		System.out.println(bobObj);
		
		if(students.contains(testObj))
		{
			System.out.println("Yes, it's present");
		}
		else
		{
			System.out.println("Nope!");
		}
	}

	private static void workWithArrayList() {
		List numbersList=new ArrayList();
		//adding values into the list
		numbersList.add(100);//0
		numbersList.add(201);//1
		numbersList.add(300);//2
		numbersList.add(403);//3
		
		List namesList=new ArrayList();
		namesList.add("Arun");
		namesList.add("Dave");
		namesList.add("Arun");
		namesList.add("Alex");
		namesList.add("Arun");
		
		//first occurrence
		int index=namesList.indexOf("Arun");
		
		//last occurrence
		int lastIndex=namesList.lastIndexOf("Arun");
		System.out.println(index);
		System.out.println(lastIndex);
		
		//'set' is to overrider; 'add' is to insert
		namesList.set(1, "Charles");
		System.out.println(namesList);
		
		List subList=namesList.subList(2, 4);//from - inclusive; to - exclusive
		System.out.println(subList);
		
		//matching should happen one-to-one and should satisfy all the index
		if(numbersList.equals(namesList))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Different");
		}
		
		//always wrap the data or else it's going to be treated as an index
		//numbersList.remove(new Integer(100));
		
		/*numbersList.remove(3);
		
		
		System.out.println(numbersList);
		
		numbersList.clear();
		
		System.out.println(numbersList);
		*/
		
		MainClassForCollections classForCollections=new MainClassForCollections();
		classForCollections.removeEvenIndiceElementsUsingListIterator(numbersList);
		
		// TODO Auto-generated method stub

		//creating a list
		//List numbersList=new List(); - Cannot instantiate the type List
		List numbersList1=new ArrayList();
		//adding values into the list
		numbersList.add(100);//0
		numbersList.add(201);//1
		numbersList.add(300);//2
		numbersList.add(403);//3
		
		//System.out.println(numbersList);
		
		//inserting value at a specified index but not override it
		numbersList.add(2, 500);
		//0,1,2,3,4, (5,6,7,8) - vaccuum, 9 - 700
		int newIndexWhereValueToBeInserted=5;
		if(newIndexWhereValueToBeInserted==numbersList.size())
		{
		numbersList.add(newIndexWhereValueToBeInserted, 700);
		}
		
		List secondList=new ArrayList();
		secondList.add(900);
		secondList.add(400);
		
		secondList.add(new Student());
		secondList.add("Sintrtrr");
		secondList.add('c');
		
		//adding all the elements from one list to another list
		//secondList.addAll(numbersList);
		secondList.addAll(2, numbersList);//addition starts from that index
		
		//numbersList=null;//dereferencing the memory already created
		if(numbersList!=null && numbersList.contains(100))//NullPointerException
		{
			System.out.println("Yep, present");
		}
		else
		{
			System.out.println("Nope!");
		}
		
		System.out.println("Using for loop:");
		//wap to print the even numbers in a list
		//iterating the list
			//1. looping statements
			for(int i=0;i<numbersList.size();i++)
			{
				int number=(int) numbersList.get(i);
				if(number%2==0)
				{
					System.out.println(number);
				}
			}
			
			System.out.println("Using iterator:");
			//2. Using Iterator (dedicated only to Collections)
			//Iterator itr=new Iterator(); - Cannot instantiate the type Iterator
			Iterator numbersListItr=numbersList.iterator();
			while(numbersListItr.hasNext())//whether the list reaches the last index or not
			{
				int number = (int) numbersListItr.next();//retrieve/fetch data from the list one by one
				if(number%2==0)
				{
					System.out.println(number);
				}
			}
			
			//3. Using ListIterator - which can traverse a collection in both ways
			System.out.println("numbers list: "+numbersList);
			
			System.out.println("Using List Iterator: ");
															 //starting point of iteration
			ListIterator listIterator=numbersList.listIterator(numbersList.size());
			
			//Remove the element present in even indices
			
			//0th index
			while(listIterator.hasPrevious())
			{
				int number=(int)listIterator.previous();
				if(number%2==0)
				{
					System.out.println(number);
				}
			}
			
			System.out.println("outside iterator:");
			//for reference to above object creation:
			StudentUtil studentUtil=new StudentUtil();
			Student alexObj=studentUtil.getStudent();
			
			Student alexObj1=new Student();
			
			
			//There is no any necessity of creating object by referring to an impl class.
			//Interface xxx=new ImplementationClass();
		
		System.out.println("numbersList: "+numbersList);
		System.out.println("secondlist: "+secondList);
	}
	
	
	void removeEvenIndiceElementsUsingIterator(List numbersList)
	{
		Iterator numbersListItr=numbersList.iterator();
		
		int count=0;
		while(numbersListItr.hasNext())
		{
			numbersListItr.next();
			
			//only for even index
			if(count%2==0)
			{
			numbersListItr.remove();
			}
			count++;
		}
		
		System.out.println(numbersList);
	}

	
	void removeEvenIndiceElementsUsingListIterator(List numbersList)
	{
		ListIterator numbersListListItr=numbersList.listIterator(numbersList.size());
		while(numbersListListItr.hasPrevious())
		{
			if(numbersListListItr.previousIndex()%2==0)
			{
				numbersListListItr.remove();
			}
		}
		
		System.out.println(numbersList);
	}
	
	static void doStringComparisonWithEqualTo(String str1,String str2)
	{
		if(str1==str2)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("Nope");
		}
	}
	
	static void doStringComparisonWithEqualsMethod(String str1,String str2)
	{
		if(str1.equals(str2))
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("Nope");
		}
	}
}
