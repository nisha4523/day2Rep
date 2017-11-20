package com.cg.dao;

import java.util.List;

import com.cg.bean.AccountBean;
import com.cg.bean.TransactionBean;
import com.cg.exception.BankingException;

public interface IBankDao {
	
	void beginTransaction();
	void commitTransaction();
	public void insertTransactionDetails(TransactionBean transaction) throws BankingException;
	public List<AccountBean> retreiveAccountDetails(String custName) throws BankingException;
	public int validateCustName(String custName) throws BankingException;
	
}
