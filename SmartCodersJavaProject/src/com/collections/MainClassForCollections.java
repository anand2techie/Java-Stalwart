package com.collections;

import java.util.ArrayList;
import java.util.List;

public class MainClassForCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating a list
		//List numbersList=new List(); - Cannot instantiate the type List
		List numbersList=new ArrayList();
		
		//adding values into the list
		numbersList.add(100);//0
		numbersList.add(200);//1
		numbersList.add(300);//2
		numbersList.add(400);//3
		
		System.out.println(numbersList);
	}

}
