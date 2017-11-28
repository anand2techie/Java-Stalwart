package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.smartcoders.sample.Student;

public class MainClassForCollections2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// sorting of numbers, alphabets & user-defined objects
		List<Integer> numbersList = new ArrayList<Integer>();
		numbersList.add(100);
		numbersList.add(500);
		numbersList.add(200);
		numbersList.add(300);

		System.out.println(numbersList);
		Collections.sort(numbersList);
		System.out.println(numbersList);

		List<String> namesList = new ArrayList<String>();
		namesList.add("Chris");
		namesList.add("Alex");
		namesList.add("Bob");
		System.out.println(namesList);
		Collections.sort(namesList);
		System.out.println(namesList);

		List<Student> students = new ArrayList<Student>();

		Student alexObj = new Student();
		alexObj.setAge(18);
		alexObj.setStudentName("Alex");
		alexObj.setStudentLocation("Los Angeles");

		Student daveObj = new Student();
		daveObj.setAge(21);
		daveObj.setStudentName("Dave");
		daveObj.setStudentLocation("Los Angeles");

		Student chrisObj = new Student();
		chrisObj.setAge(17);
		chrisObj.setStudentName("Chris");
		chrisObj.setStudentLocation("Los Angeles");

		Student bobObj = new Student();
		bobObj.setAge(20);
		bobObj.setStudentName("Bob");
		bobObj.setStudentLocation("Los Angeles");

		students.add(alexObj);
		students.add(daveObj);
		students.add(chrisObj);
		students.add(bobObj);

		// sortingBasedOnComparable(students);
		sortingBasedOnComparator(students,"Age");
	}

	/*
	 * private static void sortingBasedOnComparable(List<Student> students) {
	 * System.out.println("Before sorting:"); printStudentNames(students);
	 * Collections.sort(students); System.out.println("After sorting:");
	 * printStudentNames(students); }
	 */

	private static void sortingBasedOnComparator(List<Student> students, String sortingParameter) {
		System.out.println("Before sorting:");
		printStudentNames(students);
		if (sortingParameter.equals("Age")) {
			Collections.sort(students, new StudentAgeComparator());
		} else if (sortingParameter.equals("name")) {
			Collections.sort(students, new StudentNameComparator());
		}
		System.out.println("After sorting:");
		printStudentNames(students);
	}

	static void printStudentNames(List<Student> students) {
		/*
		 * for(dataType variableName:collectionName)
		 */
		for (Student student : students) {
			System.out.println(student.getStudentName());
			//System.out.println(student.getStudentLocation());
			//System.out.println(student.getAge());
		}
	}

}
