package com.oops;

public class SavingsAccount implements IAccount,IHDFCBank{

	@Override
	public void depositAmount(long amount) {
		// TODO Auto-generated method stub
		System.out.println(amount);
	}

	@Override
	public void withdrawAmount(long amount,int periodOfTime) {
		// TODO Auto-generated method stub
		System.out.println(amount +" is withdrawn");
	}

	@Override
	public int doSomething1() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String doSomething2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float doSomething3() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void creatingAnAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void obtainingPersonalLoan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void xxxMethod1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void xxxMethod2() {
		// TODO Auto-generated method stub
		
	}

}
