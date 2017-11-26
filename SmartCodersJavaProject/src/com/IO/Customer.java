package com.IO;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

//marker interface - used only for identification. No methods/fields.
public class Customer implements Serializable {

	//have to be added in all your serializable class
	private static final long serialVersionUID = -3136621980328674350L;
	
	private long customerId;
	private String username;
	private Set<Long> mobileNumbers;

	private int test1;
	// transient properties will be skipped serialization/de-serialization
	private transient int customerPin;
	private Bank bank;
	private List<AccountType> accountTypes;
	
	public List<AccountType> getAccountTypes() {
		return accountTypes;
	}

	public void setAccountTypes(List<AccountType> accountTypes) {
		this.accountTypes = accountTypes;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public int getCustomerPin() {
		return customerPin;
	}

	public void setCustomerPin(int customerPin) {
		this.customerPin = customerPin;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Set<Long> getMobileNumbers() {
		return mobileNumbers;
	}

	public void setMobileNumbers(Set<Long> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}

}
