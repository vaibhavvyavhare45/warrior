package com.warrior.constructor;

public class Account {
	private String number;
	private  double  balance;
	private String customerName;
	private String customerEmailAddress;
	private String customerPhoneNumber;
	
	public Account() {
		this("5689",78.05,"Default name","Default address","default phone");
		System.out.println("Empty constructor call");
	}

	
	
	public Account(String number, double balance, String customerName, String customerEmailAddress,
			String customerPhoneNumber) {
		System.out.println("Account constructor with parameter call ");
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmailAddress = customerEmailAddress;
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
	

	public Account( String customerName, String customerEmailAddress,String customerPhoneNumber) {
		this("14528",45.05,customerName,customerEmailAddress,customerPhoneNumber);	
	}
	
	
	public void deposit(double depositAmount) {
		this.balance+=depositAmount;
		System.out.println("Deposit of"+depositAmount+"made balance is"+this.balance);
	}
	
	
	public void withdraw(double withdrawAmount) {
		if(this.balance-withdrawAmount<=0) {
			System.out.println("only "+this.balance+"availabe. withdraw is not process");
		}
		
		else {
			this.balance-=withdrawAmount;
			System.out.println("withdraw of: "+withdrawAmount+" proccessed.Remaining balance is:"+this.balance);
		}
		
	
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}

	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}

	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
	

}
