package com.cg.banking.dao;

import java.util.ArrayList;

import com.cg.banking.bean.AccountDetails;
import com.cg.banking.bean.TransactionDetails;
import com.cg.banking.exception.BankingException;

public interface IBankDAO 
{
	public ArrayList<AccountDetails> selectAccounts(String cName) throws BankingException;
	public int insertTransacDetails(TransactionDetails tDet) throws BankingException;
}
