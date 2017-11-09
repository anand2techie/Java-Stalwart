package com.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainIOClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		readFromConsole();
	}

	// Reader/Writer classes --> read/write characters
	static void readFromConsole() throws IOException {
		// steps to read from console 1
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);

		// chain this with another reader clas which can read the entire line 2
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		String linesBeingRead;
		System.out.println("Enter customer name:");
		// exception handling block
			// closing the stream so that it can't be used later
			// one special case where the exception might be thrown -
			//bufferedReader.close();
			// risky code
			// exception will not occur all the time
			linesBeingRead = bufferedReader.readLine(); // 3
			System.out.println(linesBeingRead);

			System.out.println("Enter customer contact no:");
			String contactNo = bufferedReader.readLine();
			System.out.println(contactNo);
			
			System.out.println("try block");

	}

	void readFromFile() {

	}

	void writeToFile() {

	}

}
