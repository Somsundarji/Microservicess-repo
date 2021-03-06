package com.example.serviceapplication.department.Demoservices.Servicess;

import java.util.List;
import java.util.Optional;

import com.example.serviceapplication.department.Demoservices.Entity.Department;

public interface DepartmentServicess {
	
	public List<Department> getAllDepartment();
	
	public Department getDepartmentById(int department_id);
	
	public Department createOrSaveDepartment(Department department);
	
	public Department updateDepartment(Department department, int department_id);
	
	public void deleteDepartment(int department_id);
	

}
