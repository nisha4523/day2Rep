package com.cg.details;

public class EmployeeImpl implements Employee 
{
	private int id;
	private String name;
	private double salary;
	private SBUImpl businessUnit;
	private int age;
	public EmployeeImpl()
	{}
	public EmployeeImpl(int id, String name, double salary, int age) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	@Override
	public String dispDetails() 
	{
		return "Employee [empId=" + id + ", empName=" + name + ", empSalary="
				+ salary + ", empAge=" + age +"\n"+businessUnit+ "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public SBUImpl getBusinessUnit() 
	{
		return businessUnit;
	}
	public void setBusinessUnit(SBUImpl businessUnit) {
		this.businessUnit = businessUnit;
	}
	
}
