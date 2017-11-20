package com.cg.dao;

import java.util.List;

import com.cg.entities.TimeSheet;

public interface ITimeSheetDao {
	
	public abstract TimeSheet insertTimeSheet(TimeSheet timeSheet);
	
	public abstract List<TimeSheet> loadAll(String empId);

}
