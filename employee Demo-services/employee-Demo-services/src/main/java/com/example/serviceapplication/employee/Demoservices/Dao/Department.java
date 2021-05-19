package com.example.serviceapplication.employee.Demoservices.Dao;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Department implements Serializable{
	
	private int departmentid;
		
	private String department_name;	
	
	private String department_detals;
	
	private int deletes;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int departmentid, String department_name, String department_detals, int deletes) {
		super();
		this.departmentid = departmentid;
		this.department_name = department_name;
		this.department_detals = department_detals;
		this.deletes = deletes;
	}

	public int getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public String getDepartment_detals() {
		return department_detals;
	}

	public void setDepartment_detals(String department_detals) {
		this.department_detals = department_detals;
	}

	public int getDeletes() {
		return deletes;
	}

	public void setDeletes(int deletes) {
		this.deletes = deletes;
	}

	


}
