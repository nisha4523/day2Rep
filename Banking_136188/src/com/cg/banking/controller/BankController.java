package com.cg.banking.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.banking.bean.AccountDetails;
import com.cg.banking.bean.TransactionDetails;
import com.cg.banking.exception.BankingException;
import com.cg.banking.service.BankService;


@WebServlet("/BankController")
public class BankController extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	BankService bSer;
	AccountDetails accD;
	TransactionDetails tDet;
    
    public BankController()
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doPost(request,response);	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String action=request.getParameter("action");
		
		switch(action)
		{
		  case "1":
		  {
			  //from home.jsp 
			  //to search accounts having customer_name as cname
			  bSer=new BankService();
			  String cName=(request.getParameter("cname"));
			  ArrayList<AccountDetails> conL=new ArrayList<AccountDetails>();
			  try 
			  {
				conL=bSer.selectAccounts(cName);                       //read accounts in form of list from table in datasource
				request.setAttribute("conL",conL);                      //list of accounts as attribute in request is set
			    RequestDispatcher rd=request.getRequestDispatcher("AccountInfo.jsp");            
				rd.forward(request, response);                           //accounts list along with request forwarded 
			  } 
			  catch (BankingException e)
			  {
				  request.setAttribute("Error",e.getMessage());
				  RequestDispatcher rd=request.getRequestDispatcher("CustomerError.jsp");
			      rd.forward(request, response);
			  }
			  break;
		  }
		  case "2":
		  {
			  //from accountInfo.jsp
			  String accNo=(request.getParameter("accNo"));
			  request.setAttribute("accNo",accNo);
			  RequestDispatcher rd=request.getRequestDispatcher("DebitAmount.jsp");
			  rd.forward(request, response);
			  break;
		  }
		  case "3":
		  {
			 //from DebitAmount.jsp
			tDet=new TransactionDetails();
			double amount=Double.parseDouble(request.getParameter("amount")); 
			String accNo=request.getParameter("accNo");
			tDet.setAccountNumber(accNo);
			tDet.setTransactionAmount(amount);
			bSer=new BankService();
			try
			{
				int tid=bSer.insertTransacDetails(tDet);           //insert transaction details into table in datasource
				request.setAttribute("tDet",tDet);
			    RequestDispatcher rd=request.getRequestDispatcher("TransactionSuccess.jsp");
				rd.forward(request, response);                     //forward to Transaction Success page

			} 
			catch (BankingException e)
			{
				 request.setAttribute("Error",e.getMessage());
				 RequestDispatcher rd=request.getRequestDispatcher("CustomerError.jsp");
			     rd.forward(request, response);
			}
			break;  
		  }
		}
	}

}



































