package com.collections;

import java.util.Comparator;

import javax.rmi.CORBA.StubDelegate;

import com.smartcoders.sample.Student;

public class StudentAgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getAge()>o2.getAge())
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
	

}
