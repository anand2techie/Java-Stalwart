package com.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.StringHandling.StringMain;

public class IOMain {

	static InputStreamReader inputStreamReader = new InputStreamReader(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println("Enter input over console below:");
		// readInputUsingISReader();
		// readInputUsingBufferedReader();
		// readInputUsingScanner();
		// readFromFile();
		doOtherFileOperations();
	}

	// reads the entire line @ a single stretch
	private static void readInputUsingBufferedReader() {
		// TODO Auto-generated method stub
		// create a bufferedReader using ISReader
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String readData = "";
		try {
			while ((readData = bufferedReader.readLine()) != null) {
				System.out.println(readData);

				StringMain stringMain = new StringMain();
				stringMain.printVowelCharacters(readData);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// reads char by char
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

	static void readInputUsingScanner() {
		// create a Scanner Object
		Scanner scanner = new Scanner(System.in);

		// next() --> first string until it reaches space & nextLine() --->
		// reads the entire line
		String readData = scanner.nextLine();
		System.out.println(readData);
		System.out.println("Enter no.of participants");
		int noOfParticipants = scanner.nextInt();
		System.out.println(noOfParticipants);

		scanner.close();
	}

	// reading from or writing to a file
	static void readFromFile() {
		// step 1: create a File object with file location
		File file = new File("F:\\LFG\\Imran's session\\cheatsheet.txt");

		BufferedReader bufferedReader = null;
		// creating a FileReader object
		try {
			// step 2: create a FileReader object with file object
			FileReader fileReader = new FileReader(file);

			// step 3: create a BufferedReader with fileReader object
			bufferedReader = new BufferedReader(fileReader);

			StringBuffer dataToCheatsheet2 = new StringBuffer();
			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				dataToCheatsheet2.append(line);
				dataToCheatsheet2.append("\n");
			}

			writeToAnotherFile(dataToCheatsheet2);
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

	private static void writeToAnotherFile(StringBuffer dataToCheatsheet2) {
		// TODO Auto-generated method stub
		File file = new File("F:\\LFG\\Imran's session\\cheatsheet2.txt");

		// String is immutable; StringBuffer is mutable
		dataToCheatsheet2.append("Test for data cheetsheet 2");

		BufferedWriter bufferedWriter = null;
		try {
			FileWriter fileWriter = new FileWriter(file);

			bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(dataToCheatsheet2.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bufferedWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	static void doOtherFileOperations() {
		// creating a folder = directory
		File file = new File("F:\\testFolder1");

		File testFile = new File("F:\\LFG\\Imran's session\\cheatsheet2.txt");

		if (!file.exists()) {
			file.mkdir();
		}
		System.out.println(file.isDirectory());
		System.out.println(testFile.isDirectory());
		// file.delete();
		System.out.println(file.getParentFile());
		// System.out.println(testFile.getParentFile());//absolute path until
		// parent

		// System.out.println(file.getName());//exact file name
		System.out.println(file.toString());// full path till the file name
		File[] fileArray = testFile.listFiles();// gives you File object to work
												// with that
		if (fileArray != null) {
			for (File fileObject : fileArray) {
				System.out.println(fileObject.getName());
			}
		}

	}

}
