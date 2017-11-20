package com.cg.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.bean.AccountBean;
import com.cg.bean.TransactionBean;
import com.cg.exception.BankingException;
import com.cg.service.BankServiceImpl;
import com.cg.service.IBankService;

@Controller
public class BankingNewController {

	IBankService bankService = new BankServiceImpl();
	
	@SuppressWarnings("unused")
	@RequestMapping(value="/display",method = RequestMethod.POST)
    public ModelAndView display(@RequestParam("custName") String name) throws BankingException{  
        //write the code to get all account from DAO  
       //here, we are writing manual code of list for easy understanding  
		try{
		ModelAndView modelAndView = new ModelAndView("AccountInfo");
		int status = bankService.validateCustName(name);
        List<AccountBean> list= bankService.retreiveAccountDetails(name); 
        modelAndView.addObject("list",list);
    	modelAndView.addObject("Name",name);
        return modelAndView;
		}
		catch(BankingException e){
				ModelAndView modelAndView = new ModelAndView("CustomerError");
				modelAndView.addObject("Error", e.getMessage());
				return modelAndView;
		}
    } 
	
	@RequestMapping(value="/debit.htm",method = RequestMethod.POST)
	public ModelAndView debit(@RequestParam(value="acNo", required=true) String acNo,@RequestParam(value="amount", required=true) int amt){
		
		try {
			TransactionBean trans=new TransactionBean();
			trans.setAccountNumber(acNo);
			trans.setTransactionAmount(amt);
			trans.setTransactionDescription("ATM Debit");
			bankService.insertTransactionDetails(trans);
			ModelAndView modelAndView = new ModelAndView("TransactionSuccess");
			modelAndView.addObject("Amount", amt);
			modelAndView.addObject("AccountNo", acNo);
			return modelAndView;
			} catch (BankingException e) {	
				ModelAndView modelAndView = new ModelAndView("CustomerError");
				modelAndView.addObject("Error", e.getMessage());
				return modelAndView;
			}
		
	}

}
