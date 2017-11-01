package com.oops;

public class RecurringAccount implements IAccount{

	@Override
	public void depositAmount(long amount) {
		// TODO Auto-generated method stub
		System.out.println(amount*2);
	}

	@Override
	public void withdrawAmount(long amount,int periodOfTime) {
		// TODO Auto-generated method stub
		if(periodOfTime>2){
			System.out.println(amount + " is withdrawn");
		}
		else
		{
			System.out.println("Amount can't be withdrawn, since period of time less than 2 months.");
		}
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
	public void xxxMethod1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void xxxMethod2() {
		// TODO Auto-generated method stub
		
	}

}
