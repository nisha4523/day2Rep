package com.cg.banking.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cg.banking.bean.AccountDetails;
import com.cg.banking.bean.TransactionDetails;
import com.cg.banking.exception.BankingException;
import com.cg.banking.utility.DbUtil;



public class BankDAO implements IBankDAO
{

	public ArrayList<AccountDetails> selectAccounts(String cName) throws BankingException
	{
		//to return list of all accounts in the name of cName
		ArrayList<AccountDetails> conL=new ArrayList<AccountDetails>();
		AccountDetails consumer=new AccountDetails();
		Connection conn=DbUtil.createConnection();
		int chk=0;
		String sql="select * from account_details where customer_name=?";
		try
		{
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1,cName);
			ResultSet rs=pst.executeQuery();
			  while(rs.next())
			   {
				 consumer=new AccountDetails();
				 consumer.setAccountNumber(rs.getString(1));
				 consumer.setCustomerName(rs.getString(2));
				 consumer.setAccountType(rs.getString(3));
				 consumer.setAccountLocation(rs.getString(4));
				 consumer.setBalance(rs.getDouble(5));
				 conL.add(consumer);
				 chk++;    //increments only if any record having customer_name as cName is fetched
			   }
			  if(chk==0)       //if no record fetched
				 throw new BankingException("Customer Name Not found Exception");
		}
		catch(SQLException se)    //if exception occurred due to sql query
		   {
			   throw new BankingException("Error while retrieving acc details");
		   }
		return conL;
	}
	public int insertTransacDetails(TransactionDetails tDet) throws BankingException
	   {
		   int tranId=0,status=0;
		   try
		   {
			   Connection conn=DbUtil.createConnection();
			   PreparedStatement pst=null;
			   
			   String sql="INSERT INTO transaction_details values (transaction_id_seq.nextval,'ATM debit',?,sysdate,?)";
			   pst=conn.prepareStatement(sql);
			   pst.setDouble(1,tDet.getTransactionAmount());    //insert into 3rd column transaction_amount
			   pst.setString(2, tDet.getAccountNumber());     //insert into 5th column account_number
			   
			   status=pst.executeUpdate();
			   
				   if(status==1)
				   {
					 Statement s=conn.createStatement() ;
					 ResultSet rs=s.executeQuery("select transaction_id_seq.currval from dual");
					 if(rs.next())
						 tranId=rs.getInt(1);
				   }
			   
		   }
		   catch(SQLException se)
		   {
			  throw new BankingException("Error while inserting");
		   }
		   
		   return tranId;                                    //return the transaction Id
	   }
	
}



































