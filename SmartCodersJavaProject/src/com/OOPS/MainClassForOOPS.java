package com.OOPS;

public class MainClassForOOPS {

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
		
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
		privAccObjWithSameClassAsRef.processLoan();*/
		
		//Parent1 parent1=new Parent1(); - Cannot instantiate the type Parent1
		//Can't create an object for an abstract class
		Parent1.yyy();
		
		Child child=new Child();//invoke Parent class & Child class constructor
		
		//IParent1 iParent1=new IParent1(); - Cannot instantiate the type IParent1
		
		//SuperClass (or) Interface objectName=new SubClass();
		IParent1 iParent1=new ChildForInterfaces();
		//System.out.println(iParent1.zzz()); Methods implemented from other interface can't be accessed.
		
		ChildForInterfaces childForInterfaces=new ChildForInterfaces();
		childForInterfaces.zzz();
		
		HDFCBank hdfcBank=new HDFCBank();
		/*SBIBank sbiBank=new SBIBank();
		
		sbiBank=new HDFCBank();*/
		
		//using Interface as a reference
		ITraditionalBank iTraditionalBank=new SBIBank();
		iTraditionalBank=new HDFCBank();
		
		/*Above statement similar to this one (just a re-assignment):
		int number=100;
		number=200;*/
	}

}
