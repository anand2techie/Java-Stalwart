package com;

import java.io.Serializable;
import java.util.List;

public class Customer implements Comparable<Customer>,Serializable {

	// parameterized constructor with 4 parameters
	/*
	 * ClassName(){..........................}
	 * 
	 * returnType methodName(){.............}
	 */

	//will help you to come out of serialVersionUID incompatible error
	final static long serialVersionUID=4444385032019203087l;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	// global/instance variables (can be accessible throughout the class)
	// data?????????
	private long customerContactNo;
	private String customerName;
	private long customerId;
	private double accountBalance;
	private char accountType;
	private final float rateOfInterest = 12.6f;
	private final float PI = 3.14f;
	private transient int securityNumber;
	private List<String> customerNomineesList;
	private static int staticField;
	private Account account;
	
	
	public long getCustomerContactNo() {
		return customerContactNo;
	}

	public void setCustomerContactNo(long customerContactNo) {
		this.customerContactNo = customerContactNo;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public static int getStaticField() {
		return staticField;
	}

	public static void setStaticField(int staticField) {
		Customer.staticField = staticField;
	}

	public List<String> getCustomerNomineesList() {
		return customerNomineesList;
	}

	public void setCustomerNomineesList(List<String> customerNomineesList) {
		this.customerNomineesList = customerNomineesList;
	}

	private int newField;
	
	public int getNewField() {
		return newField;
	}


	public void setNewField(int newField) {
		this.newField = newField;
	}


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

	
	public int getSecurityNumber() {
		return securityNumber;
	}


	public void setSecurityNumber(int securityNumber) {
		this.securityNumber = securityNumber;
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
	 * @Override public int compareTo(Customer customerObj) { //We need 2
	 * instance to compare. One is in the argument and another is in instance
	 * variable. return customerName.compareTo(customerObj.getCustomerName()); }
	 */

	public boolean equals(Customer obj) {
		// TODO Auto-generated method stub
		return accountBalance == (obj.getAccountBalance());
	}
	

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		if (accountBalance > (o.getAccountBalance())) {
			return -1;
		} else if (accountBalance < (o.getAccountBalance())) {
			return 1;
		} else {
			return 0;
		}
	}
}
