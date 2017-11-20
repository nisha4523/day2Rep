package com.cg.details;

import java.util.ArrayList;


public class SBUImpl
{

	private int sbuId;
	private String sbuName;
	private String sbuHead;
	private ArrayList<EmployeeImpl> empList;
	public SBUImpl() {}
	public SBUImpl(int sbuId, String sbuName, String sbuHead) {
		this.sbuId = sbuId;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
	}
	@Override
	public String toString() {
		return "sbu details [sbuId=" + sbuId + ", sbuName=" + sbuName
				+ ", sbuHead=" + sbuHead + "]";
	}
	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	
	public ArrayList<EmployeeImpl> getEmpList() {
		return empList;
	}
	public void setEmpList(ArrayList<EmployeeImpl> empList) {
		this.empList = empList;
	}
	
}


























