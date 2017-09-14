package com.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.StringHandling.StringMain;

public class IOMain {
	
	static InputStreamReader inputStreamReader = new InputStreamReader(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter input over console below:");
		//readInputUsingISReader();
		readInputUsingBufferedReader();
	}

	//reads the entire line @ a single stretch
	private static void readInputUsingBufferedReader() {
		// TODO Auto-generated method stub
		// create a bufferedReader using ISReader
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String readData = "";
		try {
			while ((readData = bufferedReader.readLine()) != null) {
				System.out.println(readData);
				
				StringMain stringMain=new StringMain();
				stringMain.printVowelCharacters(readData);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	//reads char by char
	private static void readInputUsingISReader() {
		// read from console
		int readData = 0;
		try {
			// read() will returns you the ascii code of that character
			while ((readData = inputStreamReader.read()) != 0) {
				System.out.println(readData);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
