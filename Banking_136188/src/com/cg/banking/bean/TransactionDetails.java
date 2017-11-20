package com.cg.banking.bean;

import java.time.LocalDate;

public class TransactionDetails 
{
	long transationId;
	String transactionDescp;
	double transactionAmount;
	LocalDate transactionDate;
	String accountNumber;
	public TransactionDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransactionDetails(long transationId, String transactionDescp,
			double transactionAmount, LocalDate transactionDate,
			String accountNumber) {
		super();
		this.transationId = transationId;
		this.transactionDescp = transactionDescp;
		this.transactionAmount = transactionAmount;
		this.transactionDate = transactionDate;
		this.accountNumber = accountNumber;
	}
	@Override
	public String toString() {
		return "TransactionDetails [transationId=" + transationId
				+ ", transactionDescp=" + transactionDescp
				+ ", transactionAmount=" + transactionAmount
				+ ", transactionDate=" + transactionDate + ", accountNumber="
				+ accountNumber + "]";
	}
	public long getTransationId() {
		return transationId;
	}
	public void setTransationId(long transationId) {
		this.transationId = transationId;
	}
	public String getTransactionDescp() {
		return transactionDescp;
	}
	public void setTransactionDescp(String transactionDescp) {
		this.transactionDescp = transactionDescp;
	}
	public double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public LocalDate getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	
}
