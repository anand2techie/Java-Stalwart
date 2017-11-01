package com.oops;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//IAccount accountObj=new IAccount(); Cannot instantiate the type IAccount
		//Type 4: Reference can also be an Interface. but can't be a Constructor
		IAccount accountObjWithSavingsAcc=new SavingsAccount();
		
		accountObjWithSavingsAcc.depositAmount(100000);
	}

}
