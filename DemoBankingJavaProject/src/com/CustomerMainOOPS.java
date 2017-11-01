package com;

public class CustomerMainOOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomerEncapsulatedClass customerObj=new CustomerEncapsulatedClass();
		
		//without encapsulation
		/*customerObj.accountBalance=15000;
		customerObj.accountType='S';
		customerObj.customerId=12345l;
		customerObj.customerName="Charles";*/
		//printCustomerDetails("Charles", 15000, 12345l, 'S');
		
		//using Encapsulation
		customerObj.setCustomerName("Charles");
		customerObj.setAccountBalance(15000);
		customerObj.setCustomerId(12345l);
		customerObj.setAccountType('S');
		
		printCustomerDetails(customerObj);
	}
	
	//without encap
	static void printCustomerDetails(String customerName,float accoutBalance,long customerId,char accountType)
	{
		System.out.println("Without Encap");
		System.out.println(customerName);
		System.out.println(accountType);
		System.out.println(accoutBalance);
		System.out.println(customerId);
	}
	
	//with encap
	static void printCustomerDetails(CustomerEncapsulatedClass customerEncapsulatedClassObj)
	{
		System.out.println("With Encap");
		System.out.println(customerEncapsulatedClassObj.getCustomerName());
		System.out.println(customerEncapsulatedClassObj.getAccountType());
		System.out.println(customerEncapsulatedClassObj.getAccountBalance());
		System.out.println(customerEncapsulatedClassObj.getCustomerId());
	}


}
