package com.example.serviceapplication.employee.Demoservices.Dao;

import com.example.serviceapplication.employee.Demoservices.Entety.Employee;

public class ResponsTemplate {
	
	private Employee employee;
	
	private Department department;
	
	
	
	public ResponsTemplate() {
		super();
		// TODO Auto-generated constructor stub
	}



	public ResponsTemplate(Employee employee, Department department) {
		super();
		this.employee = employee;
		this.department = department;
	}



	public Employee getEmployee() {
		return employee;
	}



	public void setEmployee(Employee employee) {
		this.employee = employee;
	}



	public Department getDepartment() {
		return department;
	}



	public void setDepartment(Department department) {
		this.department = department;
	}



	@Override
	public String toString() {
		return "ResponsTemplate [employee=" + employee + ", department=" + department + "]";
	}



}
