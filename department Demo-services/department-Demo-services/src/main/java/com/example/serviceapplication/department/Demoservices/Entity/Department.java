package com.example.serviceapplication.department.Demoservices.Entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "department")
public class Department {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int department_id;
	
	@Column 
	private String department_name;
	
	@Column 
	private String department_detals;
	
	@Column 
	private int deletes;
	
	public Department(){
		
	}

	
	
	public Department(int department_id, String department_name, String department_detals, int deletes) {
		super();
		this.department_id = department_id;
		this.department_name = department_name;
		this.department_detals = department_detals;
		this.deletes = deletes;
	}



	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
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



	@Override
	public String toString() {
		return "Department [department_id=" + department_id + ", department_name=" + department_name
				+ ", department_detals=" + department_detals + ", deletes=" + deletes + "]";
	}
	
	
	
	

}