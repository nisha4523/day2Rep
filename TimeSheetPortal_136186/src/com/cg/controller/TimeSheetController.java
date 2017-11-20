package com.cg.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.entities.TimeSheet;
import com.cg.service.ITimeSheetService;

@Controller
public class TimeSheetController {

	@Autowired
	ITimeSheetService timeSheetService;

	/**
	 *Request from home.jsp
	 *Empty TimeSheet is sent to TimeSheetEntry page
	 * @param model
	 * @return String
	 */
	@RequestMapping(value="/enterTimeSheet")
	public String enterTimeSheet(Model model){
		model.addAttribute("timeSheet", new TimeSheet());
		Date date = Date.valueOf(LocalDate.now());
		model.addAttribute("date",date);
		model.addAttribute("hourActivity", new String[]{"--SELECT--","DATA_ENTRY","ACCOUNTS_TALLY","LEDGER_POSTING","BALANCE_SHEET","RETURNS_FILING"});
		return "TimeSheetEntry";	
	}

	/**
	 * In this method validation takes place
	 * if no errors then data is inserted in database
	 * else error message is thrown
	 * @param timeSheet
	 * @param result
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/addTimeSheet", method = RequestMethod.POST)
	public String addTimeSheet(@ModelAttribute("timeSheet") @Valid TimeSheet timeSheet,BindingResult result, Model model){

		Date date = Date.valueOf(LocalDate.now());
		model.addAttribute("date",date);
		model.addAttribute("hourActivity", new String[]{"--SELECT--","DATA_ENTRY","ACCOUNTS_TALLY","LEDGER_POSTING","BALANCE_SHEET","RETURNS_FILING"});	if(result.hasErrors())
		{
			return "TimeSheetEntry";
		}
		else{
			timeSheet = timeSheetService.insertTimeSheet(timeSheet);
			model.addAttribute("message","TimeSheet is recorded with Id: "+timeSheet.getTimeSheetId());
			return "Success";
		}
	}

	
	/**
	 * From this Mapping we are redirecting to the TimeSHeet List page
	 * @return
	 */
	@RequestMapping(value="/listTimeSheets")
	public String listTimeSheets(){
		return "TimeSheetList";
	}

	/**
	 * In this mapping we take empId and display
	 * all records related to Id
	 * @param empId
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/listAllTimeSheets",method = RequestMethod.POST)
	public String retrieve(@RequestParam("empId") String empId, Model model){

		List<TimeSheet> timeSheetList = timeSheetService.loadAll(empId);

		if(timeSheetList == null){
			String message= "No Time Sheet recorded!!";
			model.addAttribute("message",message);
			return "TimeSheetListError";
		}
		else{
			model.addAttribute("timeSheetList",timeSheetList);
			return "TimeSheetList";

		}
	}

	/**
	 * This is used to redirect each request to
	 * Home.jsp
	 * @return
	 */
	@RequestMapping("/home")
	public String home(){
		return "../../home";
	}



}
