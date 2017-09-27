package com.designPatternWithJDBCExample;

import com.Customer;

public class CustomerCRUDBO {

	static CustomerCRUDDAO crudDao=new CustomerCRUDDAO();
	
	void createCustomer(Customer customer)
	{
		//business logic
		crudDao.createCustomer(customer);	
		//business logic
	}
	
	void deleteCustomer()
	{
		//business logic
		crudDao.deleteCustomer();
		//business logic
	}
	
	void updateCustomer()
	{
		//business logic
		crudDao.updateCustomer();
		//business logic
	}
	
}
