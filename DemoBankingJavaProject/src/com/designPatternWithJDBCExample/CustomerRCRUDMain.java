package com.designPatternWithJDBCExample;

import com.Customer;

public class CustomerRCRUDMain {
	
	//global variable
	static CustomerCRUDBO crudbo=new CustomerCRUDBO();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
		customer.setCustomerName("Dave");
		customer.setCustomerId(12345l);
		customer.setCustomerContactNo(9629090705l);
		createCustomer(customer);
	}

	
	static void createCustomer(Customer customer)
	{
		crudbo.createCustomer(customer);
	}
	
	static void deleteCustomer()
	{
		crudbo.deleteCustomer();
	}
	
	static void updateCustomer()
	{
		crudbo.updateCustomer();
	}
}
