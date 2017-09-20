package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.Customer;

public class CollectionImpl {

	static int studentCount=0;
	static void learnMapInsideMap()
	{
		TreeMap<String, Map<String,Integer>> studentWithSubjectDetailsMap=new TreeMap<String, Map<String,Integer>>();
		
		//Map<String,List<Long>> customerContactMap=new TreeMap<String,List<Long>>(); e.g. storing customer id's with their phone numbers
		//Map<String,Customer> customerIdWithCUstomerObjectMap=new TreeMap<String,Customer>();
		
		studentWithSubjectDetailsMap.put("ECR001",constructSubjectMarksMap("ECR001"));
		studentWithSubjectDetailsMap.put("ECR002",constructSubjectMarksMap("ECR002"));
		studentWithSubjectDetailsMap.put("ECR003",constructSubjectMarksMap("ECR003"));
		
		printAvgMarksScoredByStudents(studentWithSubjectDetailsMap);
		//System.out.println(studentWithSubjectDetailsMap);
	}

	private static void printAvgMarksScoredByStudents(
			TreeMap<String, Map<String, Integer>> studentWithSubjectDetailsMap) {
		// TODO Auto-generated method stub
		
		//iterate the outer map: keySet,values,entrySet
		Set<String> studentIdSet=studentWithSubjectDetailsMap.keySet();
		Iterator<String> studentIdSetIr=studentIdSet.iterator();
		while(studentIdSetIr.hasNext())
		{
			String studentId=studentIdSetIr.next();//always gives you key
			Map<String,Integer> subjectMarksMap=studentWithSubjectDetailsMap.get(studentId);//get method to use to extract the value by passing key
			
			//method to calculate avg
			calculateAvgForSubjects(studentId, subjectMarksMap);
		}
		
	}

	private static void calculateAvgForSubjects(String studentId, Map<String, Integer> subjectMarksMap) {
		//iterate the inner map: keySet,values,entrySet
		Set<String> subjectMarksSet=subjectMarksMap.keySet();
		Iterator<String> subjectMarksSetIr=subjectMarksSet.iterator();
		int totalMarks=0;
		while(subjectMarksSetIr.hasNext())
		{
			totalMarks=totalMarks+subjectMarksMap.get(subjectMarksSetIr.next());
		}
		float avg=totalMarks/subjectMarksMap.size();
		System.out.println("Average marks of the student id: "+studentId+" is :"+avg);
	}

	static private TreeMap<String,Integer> constructSubjectMarksMap(String studentId) {
		// TODO Auto-generated method stub
		
		TreeMap<String,Integer> subjectMarksMap=new TreeMap<String,Integer>();
		
		switch(studentId)
		{
		case "ECR001":
		subjectMarksMap.put("Maths",100 );
		subjectMarksMap.put("Science",80);
		subjectMarksMap.put("Physics",100);
		subjectMarksMap.put("English", 90);
		subjectMarksMap.put("Chemistry", 40);
		break;
		case "ECR002":
			subjectMarksMap.put("Maths",100 );
			subjectMarksMap.put("Science",100);
			subjectMarksMap.put("Physics",100);
			subjectMarksMap.put("English", 80);
			subjectMarksMap.put("Chemistry", 80);
		break;
		case "ECR003":
			subjectMarksMap.put("Maths",70 );
			subjectMarksMap.put("Science",70);
			subjectMarksMap.put("Physics",70);
			subjectMarksMap.put("English", 70);
			subjectMarksMap.put("Chemistry", 70);
		break;
		default:
			studentCount++;
			System.out.println("Just print something!!!");
		}
		return subjectMarksMap;
	}
	
	static void learnCollectionOfObjects()
	{
		List<Customer> customersList=new ArrayList<Customer>();
		
		Customer charlesObj = new Customer();
		charlesObj.setCustomerName("Charles"); //customerObj argument
		charlesObj.setAccountType('C');
		charlesObj.setAccountBalance(10000);
		
		customersList.add(charlesObj);

		Customer alexObj = new Customer();
		alexObj.setCustomerName("Alex"); //customer ---> argument
		alexObj.setAccountType('R');
		alexObj.setAccountBalance(100000);
		
		customersList.add(alexObj);

		Customer davidObj = new Customer();
		davidObj.setCustomerName("David"); //customer ---> instance
		davidObj.setAccountType('R');
		davidObj.setAccountBalance(1000);
		
		customersList.add(davidObj);
		
		System.out.println("Before sorting based on Customer name: ");
		printCustomerAccBalances(customersList);
		
		/*System.out.println("using customer name comparator");
		Collections.sort(customersList,new CustomerNameComparator()); //- sorting is not applicable for List of objects unless you do on your own
		*/
		
		System.out.println("using acc balance comparator");
		Collections.sort(customersList,new AccountBalanceComparator());
		
		System.out.println("After sorting based on Customer name: ");
		printCustomerAccBalances(customersList);
		//System.out.println(customersList);
		//getCustomersOfAnAccountType(customersList,'O');
	}
	
	static void getCustomersOfAnAccountType(List<Customer> customersList,char accountType)
	{
		Iterator<Customer> customersListItr=customersList.iterator();
		while(customersListItr.hasNext())
		{
			Customer customerObj=customersListItr.next();
			if(customerObj.getAccountType()==accountType)
			{
				System.out.println(customerObj.getCustomerName());
			}
		}
	}
	
	static void sortCollections()
	{
		List<Integer> numbersList=new ArrayList<Integer>();
		numbersList.add(100);//0
		numbersList.add(234);//1
		numbersList.add(67);//2
		numbersList.add(78);//3
		numbersList.add(90);//4
		numbersList.add(90);//4
		
		System.out.println("Before sorting: ");
		System.out.println(numbersList);
		
		//Collections.sort(numbersList);//ascending
		Collections.sort(numbersList,Collections.reverseOrder());//descending
		
		
		System.out.println("Before sorting: ");
		System.out.println(numbersList);
	}
	
	static void printCustomerNames(List<Customer> customersList)
	{
		for(Customer customerObj:customersList)
		{
			System.out.println(customerObj.getCustomerName());
		}
	}
	
	static void printCustomerAccBalances(List<Customer> customersList)
	{
		for(Customer customerObj:customersList)
		{
			System.out.println(customerObj.getAccountBalance());
		}
	}
}
