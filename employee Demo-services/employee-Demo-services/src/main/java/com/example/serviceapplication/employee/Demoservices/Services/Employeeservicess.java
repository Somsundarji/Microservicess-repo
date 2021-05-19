package com.example.serviceapplication.employee.Demoservices.Services;

import java.util.List;
import java.util.Optional;

import com.example.serviceapplication.employee.Demoservices.Dao.Department;
import com.example.serviceapplication.employee.Demoservices.Dao.ResponsTemplate;
import com.example.serviceapplication.employee.Demoservices.Entety.Employee;

public interface Employeeservicess {

	public List<Employee> getAllEmployees();

	public Optional<Employee> findAllById(int employee_id);

	public Employee createOrSaveEmployee(Employee newEmployee);

	public ResponsTemplate getEmployeedetailsById(int employee_id);

	public List<Department> getAllDepartment();

	public Department getDepartmentById(int department_id);

}
