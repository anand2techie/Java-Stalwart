package com.JDBC;

import java.util.Date;

public class AccountTransaction {

	private int transactionId;
	private int customerIdBy;
	private int accountId;
	private int accountIdTo;
	private short transactionType;
	private double transactionAmount;
	private Date transactionTime;

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getCustomerIdBy() {
		return customerIdBy;
	}

	public void setCustomerIdBy(int customerIdBy) {
		this.customerIdBy = customerIdBy;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getAccountIdTo() {
		return accountIdTo;
	}

	public void setAccountIdTo(int accountIdTo) {
		this.accountIdTo = accountIdTo;
	}

	public short getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(short transactionType) {
		this.transactionType = transactionType;
	}

	public double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public Date getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(Date transactionTime) {
		this.transactionTime = transactionTime;
	}

}
