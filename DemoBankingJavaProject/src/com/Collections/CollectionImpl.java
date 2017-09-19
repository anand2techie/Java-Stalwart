package com.Collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionImpl {

	static int studentCount=0;
	static void learnMapInsideMap()
	{
		TreeMap<String, Map<String,Integer>> studentWithSubjectDetailsMap=new TreeMap<String, Map<String,Integer>>();
		
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
}
