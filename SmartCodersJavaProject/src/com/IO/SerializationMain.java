package com.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SerializationMain {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		deSerialize();
	}

	//steps to do serialization
	static void serialize()
	{
		File file=new File("F:\\LFG\\Serialization\\myserializedFile.ser");
		ObjectOutputStream objectOutputStream=null;
		try {
			//step 1: Create an object for FileOutputStream
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			
			//step 2: Create an ObjectOutputStream
			objectOutputStream=new ObjectOutputStream(fileOutputStream);
			
			//step 3: Compose the real object which you need to serialize to the file
			PrivilegedCustomer obj=new PrivilegedCustomer();
			obj.setCustomerId(123l);
			obj.setMobileNumbers(new HashSet<>());
			obj.setUsername("Test User");
			obj.setCustomerPin(1234);
			
			Bank bank=new Bank();
			bank.setBankName("HDFC Bank");
			
			obj.setBank(bank);
			
			AccountType currentAccountType=new AccountType();
			currentAccountType.setAccountType("Current Account");
			
			AccountType loanAccountType=new AccountType();
			loanAccountType.setAccountType("Loan Account");
			
			AccountType recurringAccountType=new AccountType();
			recurringAccountType.setAccountType("Recurring Account");
			
			List<AccountType> accountTypes=new ArrayList<AccountType>();
			accountTypes.add(recurringAccountType);
			accountTypes.add(currentAccountType);
			accountTypes.add(loanAccountType);
			
			obj.setAccountTypes(accountTypes);
			
			//step 4: use writeObject() to serialize
			objectOutputStream.writeObject(obj);
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
	
	
	static void deSerialize() throws IOException, ClassNotFoundException
	{
		File file=new File("F:\\LFG\\Serialization\\myserializedFile.ser");
		FileInputStream fileInputStream=new FileInputStream(file);
		ObjectInputStream inputStream=new ObjectInputStream(fileInputStream);
		Customer customer=(Customer)inputStream.readObject();
		inputStream.close();
		
		System.out.println(customer.getUsername());
		System.out.println(customer.getCustomerId());
		System.out.println(customer.getMobileNumbers());
		System.out.println(customer.getCustomerPin());
		if(customer.getBank()!=null)
		System.out.println(customer.getBank().getBankName());
	}
}
