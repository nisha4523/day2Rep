package com.cg.banking.bean;

public class AccountDetails
{

	String accountNumber;
	String customerName;
	String accountType;
	String accountLocation;
	double balance;
	public AccountDetails() {
		
	}
	public AccountDetails(String accountNumber, String customerName,
			String accountType, String accountLocation, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.accountType = accountType;
		this.accountLocation = accountLocation;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "AccountDetails [accountNumber=" + accountNumber
				+ ", customerName=" + customerName + ", accountType="
				+ accountType + ", accountLocation=" + accountLocation
				+ ", balance=" + balance + "]";
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountLocation() {
		return accountLocation;
	}
	public void setAccountLocation(String accountLocation) {
		this.accountLocation = accountLocation;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
