package com.OOPS;

public class MainClassForOOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//same class as reference
		Account accountObjWithSameClassAsRef=new Account();
		accountObjWithSameClassAsRef.withdrawAmount(5000);//44000
		//xxx. ---> can access only Account's class properties
		//accountObjWithSameClassAsRef.processLoan();
		
		//super class as reference
		//constructors' implementation will always be taken into consideration
		Account privAccObjWithSuperClassAsRef=new PrivilegedAccount();
		privAccObjWithSuperClassAsRef.withdrawAmount(5000);//45000
		//sub class as reference - not possible
		//PrivilegedAccount aaa=new Account();
		//processLoan?
		//privAccObjWithSuperClassAsRef.processLoan(); Properties should be defined in the parent that should be overridden in child
		
		//same class as reference
		PrivilegedAccount privAccObjWithSameClassAsRef=new PrivilegedAccount();
		privAccObjWithSameClassAsRef.withdrawAmount(5000);//45000
		//yyy. ---> can access its own properties & Account's properties too
		//processLoan?
		privAccObjWithSameClassAsRef.processLoan();
	}

}
