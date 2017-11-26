package com.IO;

import java.io.Serializable;

public class Bank implements Serializable{

	private String bankName;

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
}
