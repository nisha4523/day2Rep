package com.cg.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class TimeSheet {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="timesheet_id")
	private int timeSheetId;

	@NotEmpty(message="Employee Id cannot be Empty")
	@Size(max=8)
	@Pattern(regexp="[A-Z]{3}[0-9]{5}",message="Enter Valid Employee ID")
	@Column(name="emp_id")
	private String empId;

	@Column(name="timesheet_date")
	private Date timeSheetDate;

	@Column(name="hour1")
	private String hour1;

	@Column(name="hour2")
	private String hour2;

	@Column(name="hour3")
	private String hour3;

	@Column(name="hour4")
	private String hour4;

	@Column(name="hour5")
	private String hour5;

	@Column(name="hour6")
	private String hour6;

	@Column(name="hour7")
	private String hour7;

	@Column(name="hour8")
	private String hour8;

	public int getTimeSheetId() {
		return timeSheetId;
	}

	public void setTimeSheetId(int timeSheetId) {
		this.timeSheetId = timeSheetId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Date getTimeSheetDate() {
		return timeSheetDate;
	}

	public void setTimeSheetDate(Date timeSheetDate) {
		this.timeSheetDate = timeSheetDate;
	}

	public String getHour1() {
		return hour1;
	}

	public void setHour1(String hour1) {
		this.hour1 = hour1;
	}

	public String getHour2() {
		return hour2;
	}

	public void setHour2(String hour2) {
		this.hour2 = hour2;
	}

	public String getHour3() {
		return hour3;
	}

	public void setHour3(String hour3) {
		this.hour3 = hour3;
	}

	public String getHour4() {
		return hour4;
	}

	public void setHour4(String hour4) {
		this.hour4 = hour4;
	}

	public String getHour5() {
		return hour5;
	}

	public void setHour5(String hour5) {
		this.hour5 = hour5;
	}

	public String getHour6() {
		return hour6;
	}

	public void setHour6(String hour6) {
		this.hour6 = hour6;
	}

	public String getHour7() {
		return hour7;
	}

	public void setHour7(String hour7) {
		this.hour7 = hour7;
	}

	public String getHour8() {
		return hour8;
	}

	public void setHour8(String hour8) {
		this.hour8 = hour8;
	}



}
