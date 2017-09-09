package com.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class IOMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter input over console below:");
		//read from console
		InputStreamReader inputStreamReader=new InputStreamReader(System.in);
		BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
		String readData=null;
		try {
			readData = bufferedReader.readLine();
			System.out.println(readData);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
