package com.cg.banking.utility;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.cg.banking.exception.BankingException;

public class DbUtil {
	public static Connection createConnection() throws BankingException 
	{
	Connection conn = null;
		
	try
	{
		InitialContext context =new InitialContext();
		DataSource ds=(DataSource)context.lookup("java:/jdbc/OracleDS");
		conn=ds.getConnection();
	}
	catch(NamingException e)
	{
		throw new BankingException("Naming Exception while creating connection");
	}
	catch(SQLException e)
	{
		throw new BankingException("SQL Exception while creating connection");
	}
	return conn;
	}
}
