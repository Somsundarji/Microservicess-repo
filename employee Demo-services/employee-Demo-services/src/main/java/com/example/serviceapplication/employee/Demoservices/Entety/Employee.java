package com.example.serviceapplication.employee.Demoservices.Entety;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employeeservices")
public class Employee implements Serializable{

@Id	
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int employeeid;
@Column
private String employee_name;
@Column
private String employee_address;
@Column
private int department_id;
@Column 
private int deletes;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int employee_id, String employee_name, String employee_address, int department_id,
		int deletes) {
	super();
	this.employeeid = employee_id;
	this.employee_name = employee_name;
	this.employee_address = employee_address;
	this.department_id = department_id;
	this.deletes = deletes;
}
public int getEmployeeid() {
	return employeeid;
}
public void setEmployeeid(int employee_id) {
	this.employeeid = employee_id;
}
public String getEmployee_name() {
	return employee_name;
}
public void setEmployee_name(String employee_name) {
	this.employee_name = employee_name;
}
public String getEmployee_address() {
	return employee_address;
}
public void setEmployee_address(String employee_address) {
	this.employee_address = employee_address;
}
public int getDepartment_id() {
	return department_id;
}
public void setDepartment_id(int department_id) {
	this.department_id = department_id;
}
public int getDeletes() {
	return deletes;
}
public void setDeletes(int deletes) {
	this.deletes = deletes;
}
@Override
public String toString() {
	return "Employeeservices [employee_id=" + employeeid + ", employee_name=" + employee_name + ", employee_address="
			+ employee_address + ", department_id=" + department_id + ", deletes=" + deletes + "]";
}

	
}