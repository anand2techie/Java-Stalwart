package com.OOPS;

//Abstract class - can be a mix of abstract & non-abstract properties
public abstract class Parent1 {

	// abstract method
	 abstract void xxx();

	// non-abstract/concrete methods??? - Yes
	static void yyy() {
	}

	void zzz() {

	}

	Parent1() {
		System.out.println("Constructor for an abstract class.");
	}
}
