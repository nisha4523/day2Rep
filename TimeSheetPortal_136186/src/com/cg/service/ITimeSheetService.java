package com.cg.service;

import java.util.List;

import com.cg.entities.TimeSheet;

public interface ITimeSheetService {
	
	public abstract TimeSheet insertTimeSheet(TimeSheet timeSheet);
	
	public abstract List<TimeSheet> loadAll(String empId);

}
