package com.OOPS;

public class Account {

	private int account_id;
	private int pin;
	protected long balance=50000;
	protected int account_type=1;
	protected int withdraw_Limit=10000;//10000
	private int withdraw_Charge=1000;
	
	//different
	void withdrawAmount(int amount)
	{
		//condition1 AND condition2: AND (&&) --> all the conditions to be satisfied
		//condition1 OR condition2: OR (||) --> at least one of the conditions to be satisfied
		
		if(amount<=withdraw_Limit && amount<=balance)
		{
			System.out.println("Amount withdrawn.");
			balance=balance-amount;
			balance=balance-withdraw_Charge;
		}
		else
		{
			System.out.println("Withdraw action failed.");
		}
		
		//44000
		System.out.println(balance);
	}
	
	//same
	void depositAmount()
	{
		
	}
}
