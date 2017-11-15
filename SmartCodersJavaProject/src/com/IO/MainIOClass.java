package com.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainIOClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// readFromConsole();
		writeToFile();
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
		// bufferedReader.close();
		// risky code
		// exception will not occur all the time
		linesBeingRead = bufferedReader.readLine(); // 3
		System.out.println(linesBeingRead);

		System.out.println("Enter customer contact no:");
		String contactNo = bufferedReader.readLine();
		System.out.println(contactNo);

		System.out.println("try block");

	}

	static void readFromFile() {
		// steps to read from a file
		// step1: create a File object
		File fileObj = new File(
				"F:\\LFG\\Smartcoders\\Session 31_IO&DBProgramming_14Nov0615to0745\\Session 31_IO&DBProgramming_14Nov0615to0745.txt");

		BufferedReader bufferedReader = null;
		// create a FileReader
		try {
			FileReader fileReader = new FileReader(fileObj);
			String lines = "";

			// char by char: fileReader.read
			bufferedReader = new BufferedReader(fileReader);
			// System.out.println(bufferedReader.readLine());readLine is going
			// to read only one line
			while ((lines = bufferedReader.readLine()) != null) {
				System.out.println(lines);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	static void writeToFile() {
		File file = new File("F:\\LFG\\Smartcoders\\Session 31_IO&DBProgramming_14Nov0615to0745\\new_file.txt");
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(file);
			fileWriter.write("new data....");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("File write successful...");
	}

}
