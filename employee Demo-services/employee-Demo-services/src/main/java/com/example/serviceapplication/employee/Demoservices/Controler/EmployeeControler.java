package com.example.serviceapplication.employee.Demoservices.Controler;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.serviceapplication.employee.Demoservices.Dao.ResponsTemplate;
import com.example.serviceapplication.employee.Demoservices.Entety.Employee;
import com.example.serviceapplication.employee.Demoservices.Services.Employeeservicess;




@RestController
@RequestMapping("/Employeeservices")
public class EmployeeControler {
	
    @Autowired
	private Employeeservicess employeeservicess;

	@GetMapping(value = "/employees")
	public List<Employee> getAllEmployees() {
		List<Employee> employeeList = null;
		try {
			employeeList = employeeservicess.getAllEmployees();
			return employeeList;
		} catch (Exception e) {

			return null;
		}

	}

	@GetMapping("/employees/{employee_id}")
	public  Optional<Employee>  getEmployeeById(@PathVariable int employee_id) {
		Optional<Employee> employeelist = null;
		try {
			employeelist = employeeservicess.findAllById(employee_id);
			return employeelist;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	@PostMapping("/add_employees")
	public Employee createOrSaveEmployee(@RequestBody Employee newEmployee) {
		return employeeservicess.createOrSaveEmployee(newEmployee);
	}

	@GetMapping("/alldetails/{employee_id}")
	public ResponsTemplate getEmployeedetailsById(@PathVariable int employee_id) {
		
		try {
			return employeeservicess.getEmployeedetailsById(employee_id);			 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

}
