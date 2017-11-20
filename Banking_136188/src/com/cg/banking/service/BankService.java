package com.cg.banking.service;

import java.util.ArrayList;

import com.cg.banking.bean.AccountDetails;
import com.cg.banking.bean.TransactionDetails;
import com.cg.banking.dao.BankDAO;
import com.cg.banking.exception.BankingException;

public class BankService implements IBankService
{
	BankDAO bDAO=new BankDAO();
	public ArrayList<AccountDetails> selectAccounts(String cName) throws BankingException
	{
		return bDAO.selectAccounts(cName);
	}
	public int insertTransacDetails(TransactionDetails tDet) throws BankingException
	{
		return bDAO.insertTransacDetails(tDet);
	}
}
