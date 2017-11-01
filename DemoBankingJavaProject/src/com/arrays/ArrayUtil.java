package com.arrays;

import com.Customer;

public class ArrayUtil {

	// Methods other than static are called instance methods
	// 3 things?????
	void insertElementIntoAnIntegerArray(int elementToBeInserted, int[] oldArray, int indexWhereToBeInserted) {
		System.out.println("Before insertion");
		printArrayValues(oldArray);

		// increment the array size by 1
		int[] newArray = new int[oldArray.length + 1];

		// copying old values until insertion point
		for (int i = 0; i < indexWhereToBeInserted; i++) {
			newArray[i] = oldArray[i];
		}

		// insertion point
		newArray[indexWhereToBeInserted] = elementToBeInserted;

		// copying old values after insertion point
		for (int j = indexWhereToBeInserted; j < oldArray.length; j++) {
			int newArrayIndex = j + 1;
			newArray[newArrayIndex] = oldArray[j];
		}

		System.out.println("after insertion");
		printArrayValues(newArray);

		// calling a static properties from an instance method (same class)-
		// possible
		testStaticMethod();
	}

	void printArrayValues(int[] testArray) {
		for (int i : testArray) {
			System.out.println(i);
		}
	}

	// class loading
	static void testStaticMethod() {
		// instanceMethod();
	}

	void instanceMethod() {
		testStaticMethod();
	}

	static void learnArrayOfObjects() {
		// dataType[] arrayName=new dataType[size];
		Customer[] customersArray = new Customer[4]; // array of Customer
														// objects

		Customer charlesObj = new Customer();
		charlesObj.setCustomerName("Charles");
		charlesObj.setAccountType('C');
		charlesObj.setAccountBalance(10000);
		customersArray[0] = charlesObj;

		Customer alexObj = new Customer();
		alexObj.setCustomerName("Alex");
		alexObj.setAccountType('R');
		alexObj.setAccountBalance(100000);
		customersArray[1] = alexObj;

		Customer davidObj = new Customer();
		davidObj.setCustomerName("David");
		davidObj.setAccountType('L');
		davidObj.setAccountBalance(1000);
		customersArray[2] = davidObj;

		for (Customer customerObj : customersArray) {
			System.out.println(customerObj);
			//null check - avoids null pointer exception
			if (customerObj != null) {
				if (customerObj.getAccountBalance() > 5000) {
					System.out.println(customerObj.getCustomerName());
				} else {
					System.out.println(customerObj.getCustomerName() + " get out!");
				}
			}
		}
	}
}
