package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.bean.AccountBean;
import com.cg.bean.TransactionBean;
import com.cg.dao.BankDaoImpl;
import com.cg.dao.IBankDao;
import com.cg.exception.BankingException;

public class BankServiceImpl implements IBankService {

	@Autowired
	IBankDao bankDAO = new BankDaoImpl();

	@Override
	public void insertTransactionDetails(TransactionBean transaction)
			throws BankingException {
		bankDAO.insertTransactionDetails(transaction);
	}

	@Override
	public List<AccountBean> retreiveAccountDetails(String custName)
			throws BankingException {
		return bankDAO.retreiveAccountDetails(custName);
	}

	@Override
	public int validateCustName(String custName) throws BankingException {
		
		return bankDAO.validateCustName(custName);
	}

	



}
