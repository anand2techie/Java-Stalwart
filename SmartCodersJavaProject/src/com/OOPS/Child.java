package com.OOPS;

//When you extend an abstract class, you're bound to implement the abstract methods declared there.
public class Child extends Parent2{

	@Override
	void xxx() {
		// TODO Auto-generated method stub
		
	}

	public Child() {
		
		//using super keyword, You can explicitly call any of the Constructors in parent class..
		super("Ananth");
		// TODO Auto-generated constructor stub
		System.out.println("Inside child class");
	}
}
