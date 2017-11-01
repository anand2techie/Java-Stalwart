package com.smartcoders.sample;

public class MainClassForStudent {

	public static void main(String[] args) {
		Student student=new Student();
		//is not through an Object oriented way - Encapsulation
		//setting - testing
		student.setContactNo(9629090705l);//student.contactNo=9629090705l; - you can't directly access fields. you can access it using functions/methods
		student.setRollNo(1234);
		student.setStudentLocation("Hyderabad");
		student.setStudentName("Charlie");
		student.setHasAccessToAgeVariable(true);
		student.setAge(13);
	/*	
		//getting
		System.out.println(student.getContactNo());//System.out.println(student.contactNo);
		System.out.println(student.getRollNo());
		System.out.println(student.getStudentLocation());
		System.out.println(student.getStudentName());
		System.out.println(student.getAge());//0 or 13
		System.out.println(student.getRightToVote());
		*/
		System.out.println(student);
	}
	

}
