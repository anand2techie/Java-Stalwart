package com.ArrayAndStringProgramming;

import java.util.Arrays;
import java.util.Collections;

import com.smartcoders.sample.Student;

public class MainClassForArrays {

	public static void main(
			String[] args) {/*
							 * // TODO Auto-generated method stub
							 * 
							 * //Array creation with init - Array of primitives
							 * char[] alphabetArray=new char[6];
							 * 
							 * System.out.println("Before assigning values:");
							 * System.out.println(alphabetArray);//it's going to
							 * print the reference
							 * 
							 * //storing values into an array
							 * alphabetArray[0]='a'; alphabetArray[1]='b';
							 * alphabetArray[2]='c'; alphabetArray[3]='e';
							 * alphabetArray[4]='e';
							 * 
							 * //arrayName[index]=value;
							 * System.out.println("After assigning values:");
							 * System.out.println(alphabetArray);//it's always
							 * going to print the reference
							 * 
							 * for(int i=0;i<alphabetArray.length;i++)
							 * //alphabetArray.length = 5 {
							 * System.out.println(alphabetArray[i]);//
							 * alphabetArray[5]; -ArrayIndexOutOfBoundsException
							 * }
							 * 
							 * //alphabetArray. --> there is no much support
							 * provided by array
							 * 
							 */
		MainClassForArrays mainClassForArrays = new MainClassForArrays();
		mainClassForArrays.learnArraysUtilClass();

	}

	void learnArrayOfObjects() {
		// create an array of Students
		Student[] studentArray = new Student[10]; // String,char etc....

		Student student = new Student();// Charlie
		student.setContactNo(9629090705l);
		student.setRollNo(1234);
		student.setStudentLocation("Hyderabad");
		student.setStudentName("Charlie");
		student.setHasAccessToAgeVariable(true);
		student.setAge(13);
		studentArray[0] = student;

		Student student1 = new Student();// Alex doesn't have an even roll
											// number
		student1.setContactNo(9629090707l);
		student1.setRollNo(1235);
		student1.setStudentLocation("Texas");
		student1.setStudentName("Alex");
		student1.setHasAccessToAgeVariable(false);
		student1.setAge(19);
		studentArray[1] = student1;

		// Arrays.sort(studentArray); sorting of array of objects, have to be
		// done it in a diff way

		// wap to find whose roll number is even
		for (int i = 0; i < studentArray.length; i++) {
			// student object - with null value, you can't do any operations
			if (studentArray[i] != null) {// to avoid NPE
				if (studentArray[i].getRollNo() % 2 == 0) {
					System.out.println(studentArray[i].getStudentName() + "'s roll number is even");
				} else {
					System.out.println(studentArray[i].getStudentName() + "'s roll number is not even");
				}
			}
		}
	}

	void learnArraysUtilClass() {
		// Arrays arrays=new Arrays(); The constructor Arrays() is not visible
		// Arrays.binarySearch(array, key); key - what to search; array - where
		// to search
		char[] alphabetArray = new char[5];
		alphabetArray[0] = 'a';
		alphabetArray[1] = 'c';
		alphabetArray[2] = 'b';
		alphabetArray[3] = 'e';
		alphabetArray[4] = 'e';
		// Before using binarySearch, sort the array
		System.out.println("Before sorting");
		printArrayValues(alphabetArray);

		Arrays.sort(alphabetArray);// source array will be changed

		System.out.println("After sorting");
		printArrayValues(alphabetArray);

		System.out.println(Arrays.binarySearch(alphabetArray, 'e'));// index of
																	// first
																	// occurrence
		// if the value is not present, it's going to be a '-' ve value

		char[] newCharArray = Arrays.copyOf(alphabetArray, 10);

		// from - inclusive,to - exclusive
		char[] newCharArrayWithRange = Arrays.copyOfRange(alphabetArray, 0, 6);// 2,3,4,5,6

		System.out.println("Copied array:");
		printArrayValues(newCharArray);

		System.out.println("Copied array with range:");
		printArrayValues(newCharArrayWithRange);

		// Arrays.equals(newCharArray, alphabetArray)compares all the elements
		// even the order matters

		// Arrays.fill(alphabetArray, 'n'); fills the whole array with 'n'
		
		System.out.println(Arrays.toString(alphabetArray));// converting array values to a comma separated string
	}

	void printArrayValues(char[] alphabetArray) {
		for (int i = 0; i < alphabetArray.length; i++) {
			System.out.println(alphabetArray[i]);
		}
	}

}
