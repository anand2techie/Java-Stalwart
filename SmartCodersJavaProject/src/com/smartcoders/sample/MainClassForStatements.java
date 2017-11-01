package com.smartcoders.sample;

public class MainClassForStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogicClassForStatements logicClassForStatements=new LogicClassForStatements();
		/*boolean result=logicClassForStatements.findEvenOrNot(50);
		
		if(result==true)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}*/
		
		logicClassForStatements.findEvenOrNotWithLimit(20);
		
		Student student=new Student();
		//is not through an Object oriented way - Encapsulation
		//setting - testing
		student.setContactNo(9629090705l);//student.contactNo=9629090705l; - you can't directly access fields. you can access it using functions/methods
		student.setRollNo(1234);
		student.setStudentLocation("Hyderabad");
		student.setStudentName("Charlie");
		student.setAge(18);
		//student.setRightToVote(false);
	}
}
