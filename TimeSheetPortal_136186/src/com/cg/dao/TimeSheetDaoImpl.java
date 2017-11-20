package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.entities.TimeSheet;

@Repository
@Transactional
public class TimeSheetDaoImpl implements ITimeSheetDao {

	//This annotation is used to inject auto created entityManagerFactory
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public TimeSheet insertTimeSheet(TimeSheet timeSheet) {
		entityManager.persist(timeSheet);
		entityManager.flush();
		return timeSheet;
	}

	@Override
	public List<TimeSheet> loadAll(String empId) {
		TypedQuery<TimeSheet> query = entityManager.createQuery("SELECT t FROM TimeSheet t WHERE t.empId='"+empId+"'", TimeSheet.class);
		List<TimeSheet> timeSheetList = query.getResultList();
		if(timeSheetList.isEmpty()){
			return null;
		}
		else
			return timeSheetList;
	}
}
