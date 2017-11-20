package com.cg.banking.service;

import java.util.ArrayList;

import com.cg.banking.bean.AccountDetails;
import com.cg.banking.bean.TransactionDetails;
import com.cg.banking.exception.BankingException;

public interface IBankService 
{
	public ArrayList<AccountDetails> selectAccounts(String cName) throws BankingException;
	public int insertTransacDetails(TransactionDetails tDet) throws BankingException;
}
