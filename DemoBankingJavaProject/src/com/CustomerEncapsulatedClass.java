package com;

public class CustomerEncapsulatedClass {
	
		//global/instance variables (can be accessible throughout the class)
		//data?????????
		private String customerName; //null
		private long customerId; //0
		private double accountBalance; //0
		private char accountType; //''
		private final float rateOfInterest=12.6f; //0
		private final float PI=3.14f; //0
		
		
		public String getCustomerName() {
			System.out.println("Inside get method");
			return customerName;
		}
		public void setCustomerName(String customerName) {
			System.out.println("Inside set method");
			System.out.println("Customer name before setting: "+this.customerName);
			this.customerName = customerName;
			System.out.println("Customer name after setting: "+this.customerName);
		}
		public long getCustomerId() {
			return customerId;
		}
		public void setCustomerId(long customerId) {
			this.customerId = customerId;
		}
		public double getAccountBalance() {
			return accountBalance;
		}
		public void setAccountBalance(double accountBalance) {
			this.accountBalance = accountBalance;
		}
		public char getAccountType() {
			return accountType;
		}
		public void setAccountType(char accountType) {
			this.accountType = accountType;
		}
		public float getRateOfInterest() {
			return rateOfInterest;
		}
		public float getPI() {
			return PI;
		}

		
}
