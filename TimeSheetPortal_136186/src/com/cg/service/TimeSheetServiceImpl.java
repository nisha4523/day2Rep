package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ITimeSheetDao;
import com.cg.entities.TimeSheet;

@Service
public class TimeSheetServiceImpl implements ITimeSheetService {
	
	@Autowired
	ITimeSheetDao dao;
	
	@Override
	public TimeSheet insertTimeSheet(TimeSheet timeSheet) {
		return dao.insertTimeSheet(timeSheet);
	}

	@Override
	public List<TimeSheet> loadAll(String empId) {
		return dao.loadAll(empId);
	}

}
