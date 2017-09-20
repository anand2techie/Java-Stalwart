package com;

public class Customer/* implements Comparable<Customer>*/{

	// parameterized constructor with 4 parameters
	/*
	 * ClassName(){..........................}
	 * 
	 * returnType methodName(){.............}
	 */

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	// global/instance variables (can be accessible throughout the class)
	// data?????????
	private String customerName;
	private long customerId;
	private double accountBalance;
	private char accountType;
	private final float rateOfInterest = 12.6f;
	private final float PI = 3.14f;

	// data......
	public Customer(String customerName, long customerId, double accountBalance, char accountType) {
		// TODO Auto-generated constructor stub
		System.out.println("I'm inside 4 parameterized constructor");

		// this keyword is used to refer to instance/class/global properties
		// (variable/method). it avoids confusion and help us to achieve the
		// goal.
		this.customerName = customerName;
		this.customerId = customerId;
		this.accountBalance = accountBalance;
		this.accountType = accountType;
	}

	Customer(String customerName, long customerId, char accountType) {
		// TODO Auto-generated constructor stub
		System.out.println("I'm inside 3 parameterized constructor");
	}

	/*
	 * //default constructor - made it visible!!! Customer() { // TODO
	 * Auto-generated constructor stub
	 * System.out.println("I'm inside default constructor"); }
	 */

	void printCustomerDetails() {
		System.out.println(customerName);
		System.out.println(customerId);
		System.out.println(accountBalance);
		System.out.println(accountType);
		// rateOfInterest=13.7f; --> can't do it!
	}

	void xxxMethod() {
		System.out.println(customerName);
		System.out.println(customerId);
		System.out.println(accountBalance);
		System.out.println(accountType);
	}

	void xxxMethod(int xxxNumber) {
		System.out.println(customerName);
		System.out.println(customerId);
		System.out.println(accountBalance);
		System.out.println(accountType);
	}

	void findArea(int side) {

	}

	void findArea(float PI, int radius) {

	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public char getAccountType() {
		return accountType;
	}

	public void setAccountType(char accountType) {
		this.accountType = accountType;
	}

	public float getRateOfInterest() {
		return rateOfInterest;
	}

	public float getPI() {
		return PI;
	}
/*
	@Override
	public int compareTo(Customer customerObj) {
		//We need 2 instance to compare. One is in the argument and another is in instance variable.
		return customerName.compareTo(customerObj.getCustomerName());
	}
	*/
	
}
