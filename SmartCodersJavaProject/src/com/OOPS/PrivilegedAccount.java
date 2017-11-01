package com.OOPS;

public class PrivilegedAccount extends Account{
/*	account_id,pin,balance, depositAmount(): re-used
	account_type, withdraw_Limit, withdrawAmount(): override
	loanAmountLimit,xxx,yyy: new-definition*/
	
		//overridden:
		private int account_type=2;
		private int withdraw_Limit=20000;//20000
		/*@Override //programmer's understanding
		void withdrawAmount(int amount) {
			// TODO Auto-generated method stub
			if(amount<=withdraw_Limit && amount<=balance)
			{
				System.out.println("Amount withdrawn.");
				balance=balance-amount;
			}
			else
			{
				System.out.println("Withdraw action failed inside Priv account.");
			}
		
			//45000
			System.out.println(balance);
		}*/
		
		//new-definition
		private long loanAmountLimit=4000000l;
		void processLoan()
		{
			
		}
	
}
