package com.cg.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account_details")
public class AccountBean {

	@Id
	@Column(name="account_number")
	private String accountNumber;  
	@Column(name="customer_name")
	private String custName;
	@Column(name="account_type")
	private String accountType;
	@Column(name="account_location")
	private String accountLocation;
	@Column(name="balance")
	private double balance;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
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
	public AccountBean(String accountNumber, String custName,
			String accountType, String accountLocation, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.custName = custName;
		this.accountType = accountType;
		this.accountLocation = accountLocation;
		this.balance = balance;
	}
	public AccountBean() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
