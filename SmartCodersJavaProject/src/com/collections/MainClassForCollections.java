package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.smartcoders.sample.Student;
import com.smartcoders.sample.StudentUtil;

public class MainClassForCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating a list
		//List numbersList=new List(); - Cannot instantiate the type List
		List numbersList=new ArrayList();
		
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
		
		/*secondList.add(new Student());
		secondList.add("Sintrtrr");
		secondList.add('c');*/
		
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
			
			//3. Using ListIterator
			ListIterator listIterator=numbersList.listIterator();
			
			
			/*//for reference to above object creation:
			StudentUtil studentUtil=new StudentUtil();
			Student alexObj=studentUtil.getStudent();
			
			Student alexObj1=new Student();*/
			
			
			//There is no any necessity of creating object by referring to an impl class.
			//Interface xxx=new ImplementationClass();
		
		/*System.out.println("numbersList: "+numbersList);
		System.out.println("secondlist: "+secondList);*/
	}

}
