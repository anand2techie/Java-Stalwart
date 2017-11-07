package com.smartcoders.sample;

public class Student {

	// define some global variables - fields
	// different set - global/instance variables
	
	//m/y will not be allocated until an object is created
	private String studentName;
	private int rollNo;
	private long contactNo;
	private String studentLocation="Chennai";
	private int age;
	private boolean rightToVote;
	private boolean hasAccessToAgeVariable=true;
	
	public boolean getHasAccessToAgeVariable() {
		return hasAccessToAgeVariable;
	}

	public void setHasAccessToAgeVariable(boolean hasAccessToAgeVariable) {
		this.hasAccessToAgeVariable = hasAccessToAgeVariable;
	}

	public boolean getRightToVote() {
		return rightToVote;
	}
	//setRightToVote is being removed
	
	public int getAge() {
		if(hasAccessToAgeVariable==true)
		{
		return age;
		}
		else
		{
			return 0;
		}
	}

	public void setAge(int age) {
		this.age = age;
		if(age>=18)
		{
			this.rightToVote=true;
		}
	}

	//getters & setters for all my fields
	static final String schoolName="VVM School";

	public String getStudentName() {
		//---------------
		//---------------
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		
		//setting value from local contactNo to global contactNo
		this.contactNo = contactNo;
	}

	public String getStudentLocation() {
		return studentLocation;
	}

	public void setStudentLocation(String studentLocation) {
		this.studentLocation = studentLocation;
	}

	public static String getSchoolname() {
		return schoolName;
	}

	
	//final - that makes something not to be overridden. values can be assigned only once.
	//m/y will be allocated at the time of class loading itself. 
	// parameterized constructor - with 'n' number of parameters
	public Student(String studentName) {
		System.out.println("String parameterized constructor called.... " + studentName);
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	// parameterized constructor - with 'n' number of parameters
	public Student(int rollNo) {
		System.out.println("integer parameterized constructor called.... " + rollNo);
	}

	// parameterized constructor - with 'n' number of parameters
	public Student(int test, int someNumber) {
		System.out.println("char parameterized constructor called.... " + test);
	}

	// parameterized constructor - with 'n' number of parameters
	// local variables.......................
	public Student(String studentName, int rollNo, long contactNo, String studentLocation) {
		System.out.println("4 parameterized constructor called.... ");
		this.studentName = studentName;// no difference in local & global here.
		this.rollNo = rollNo;
		this.contactNo = contactNo;
		this.studentLocation = studentLocation;
	}

	static void staticMethod2()
	{
		final int localVariable = 0;
		
		System.out.println(localVariable);
		System.out.println("Inside static method...");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return studentName;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student student=(Student)obj;
		String appendedAllPropForArg=student.getStudentName()+student.getStudentLocation()+student.getAge();
		String appendedAllPropForIns=this.studentName+this.studentLocation+this.age;
		return appendedAllPropForArg.equals(appendedAllPropForIns);
	}
}

