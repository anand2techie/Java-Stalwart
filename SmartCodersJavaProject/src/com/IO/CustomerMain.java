package com.IO;

import java.util.HashSet;
import java.util.Set;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
		customer.setCustomerId(1234l);
		customer.setUsername("Raj");
		Set<Long> mobileNumbers=new HashSet<Long>();
		mobileNumbers.add(9629090705l);
		mobileNumbers.add(9788628958l);
		customer.setMobileNumbers(mobileNumbers);
	}

}
