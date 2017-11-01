package com;

public class MainClassForMyLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ClassName objectName=new ConstructorName();
		LogicClass logicClassObj=new LogicClass();
		boolean result=logicClassObj.findANumberPrimeOrNot(100);
		System.out.println(result);
	}

}
