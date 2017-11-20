package com.cg.bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="transaction_details")
public class TransactionBean {
	
	@Id
	@Column(name="transaction_id")
	@SequenceGenerator(name="seq1",sequenceName="transaction_id_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq1")
	private long transId;
	@Column(name="transaction_description")
	private String transactionDescription;
	@Column(name="transaction_amount")
	private double transactionAmount;
	@Column(name="transaction_date")
	private Date transDate;
	@Column(name="account_number")
	private String accountNumber;
	public String getTransactionDescription() {
		return transactionDescription;
	}
	public void setTransactionDescription(String transactionDescription) {
		this.transactionDescription = transactionDescription;
	}
	public double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	@Override
	public String toString() {
		return "TransactionBean [transactionDescription="
				+ transactionDescription + ", transactionAmount="
				+ transactionAmount + ", accountNumber=" + accountNumber + "]";
	}
	
	
}
