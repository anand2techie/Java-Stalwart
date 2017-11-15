package com.IO;

import java.util.Set;

public class Customer {

	private long customerId;
	private String username;
	private Set<Long> mobileNumbers;
	
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
