package com.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.Account;
import com.Customer;

public class SerializeMain {

	public static void main(String[] args) {
		
		doSerlialization();
		doDeserialization();
	}

	private static void doDeserialization() {
		// TODO Auto-generated method stub

		//Steps to do De-Serialization:
		File file=new File("F:\\LFG\\Imran's session\\Session 27_IO_Programming_Serialization_23Sep_0630to0730\\SerializedFiles\\serializedFile.ser");
		FileInputStream fileInputStream;
		ObjectInputStream objectInputStream=null;
		try {
			fileInputStream = new FileInputStream(file);
			objectInputStream=new ObjectInputStream(fileInputStream);
			Customer customer=(Customer) objectInputStream.readObject();
			
			System.out.println(customer.getCustomerName());
			System.out.println(customer.getAccountBalance());
			System.out.println(customer.getAccountType());
			System.out.println(customer.getSecurityNumber());
			System.out.println(customer.getCustomerNomineesList());//collection
			System.out.println(customer.getStaticField());//static
			System.out.println(customer.getRateOfInterest());//final
			
			System.out.println(customer.getAccount().getXxx());
			System.out.println(customer.getAccount().getYyy());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				objectInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void doSerlialization() {
		//Steps to do Serialization:
		File file=new File("F:\\LFG\\Imran's session\\Session 27_IO_Programming_Serialization_23Sep_0630to0730\\SerializedFiles\\serializedFile.ser");
		ObjectOutputStream objectOutputStream=null;
		try {
			
			//1. Create an Object for FileOutputStream
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			
			//2. Create an object for ObjectOutputStream using FOS
			objectOutputStream=new ObjectOutputStream(fileOutputStream);
			
			//3. Compose an object to be written
			Customer charlesObj = new Customer();
			charlesObj.setCustomerName("Charles");
			charlesObj.setAccountType('C');
			charlesObj.setAccountBalance(10000);
			charlesObj.setSecurityNumber(12345);
			charlesObj.setStaticField(3445);
			
			List<String> nomineesList=new ArrayList<String>();
			nomineesList.add("Alex");
			nomineesList.add("Robert");
			nomineesList.add("Mira");
			
			Account account=new Account();
			account.setXxx(123);
			account.setYyy(456);
			
			charlesObj.setAccount(account);
			charlesObj.setCustomerNomineesList(nomineesList);
			//4. write the object to OOS
			objectOutputStream.writeObject(charlesObj);
			System.out.println("Serialization done!!!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				objectOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


