package com.example.serviceapplication.employee.Demoservices.Dao;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.serviceapplication.employee.Demoservices.Dao.Department;

@FeignClient(name="DEPARTMENT-SERVER")
public interface DepartmentServiceProxy {
	
	@GetMapping("/department/getall")
	public List<Department> getAllDepartment();
	
	@RequestMapping(value="/department/getall/{department_id}" , method = RequestMethod.GET ,consumes = "application/json")
	public Department getDepartmentById(@PathVariable("department_id")int department_id);
	
}
