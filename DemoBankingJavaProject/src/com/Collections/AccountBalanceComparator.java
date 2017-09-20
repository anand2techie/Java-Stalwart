package com.Collections;

import java.util.Comparator;

import com.Customer;

public class AccountBalanceComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer customerObj1, Customer customerObj2) {
		// TODO Auto-generated method stub
		if(customerObj1.getAccountBalance()>customerObj2.getAccountBalance())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

}
