package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import com.cg.bean.AccountBean;
import com.cg.bean.TransactionBean;
import com.cg.exception.BankingException;
/*
 * Implementing the IBankDao interface and all its methods
 */
public class BankDaoImpl implements IBankDao {

	/*
	 * Method used to insert the transaction details into transaction_details table
	 */
	
	private EntityManager entityManager;
	
	public BankDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
	
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		entityManager.flush();
	}

	@Override
	public void insertTransactionDetails(TransactionBean transaction)
			throws BankingException {
		
		entityManager.getTransaction().begin();
		entityManager.persist(transaction);
		entityManager.getTransaction().commit();
	
	}

	
	/*
	 * Method used to retrieve details from account_details according to account number
	 */

	@Override
	public List<AccountBean> retreiveAccountDetails(String custName)
			throws BankingException {
		  
		String qStr = "SELECT account FROM AccountBean account WHERE account.custName=:pName";
		TypedQuery<AccountBean> query = entityManager.createQuery(qStr, AccountBean.class);
		query.setParameter("pName", custName);
		return query.getResultList();
	}


	@Override
	public int validateCustName(String custName) throws BankingException {
		String name ="";
		int status = 1;
		try{
		String qStr = "SELECT account.custName FROM AccountBean account WHERE account.custName=:pName";
		TypedQuery<String> query = entityManager.createQuery(qStr, String.class);
		query.setParameter("pName", custName);
		name = query.getSingleResult();
		if(name!=custName )
		{
			status = 0;
		}
		return status;
		}
		catch(NoResultException re){
			throw new BankingException("Customer Name not found");
		}
	}


}

		
		