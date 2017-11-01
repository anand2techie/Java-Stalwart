package com.Collections;

import java.util.Comparator;

import com.Customer;

public class CustomerNameComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer customerObj1, Customer customerObj2) {
		// TODO Auto-generated method stub
		return customerObj1.getCustomerName().compareTo(customerObj2.getCustomerName());
	}

	
}
