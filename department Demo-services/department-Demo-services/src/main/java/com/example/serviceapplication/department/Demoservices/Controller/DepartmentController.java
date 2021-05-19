package com.example.serviceapplication.department.Demoservices.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.serviceapplication.department.Demoservices.Entity.Department;
import com.example.serviceapplication.department.Demoservices.Entity.Status;
import com.example.serviceapplication.department.Demoservices.Servicess.DepartmentServicess;


import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
@RequestMapping(value = "/department")
public class DepartmentController {
	
	  //Creating the Logger object
	 org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(DepartmentController.class);
    
	@Autowired
	private DepartmentServicess departmentServicess;
	
	@GetMapping("/getall")
	public List<Department> getAllDepartment() {		
		List<Department> departmentdata = null;		
		try {
			departmentdata=departmentServicess.getAllDepartment();
			log.info("departmentServicess respons"+departmentdata);
			return departmentdata;
		} catch (Exception e) {
			log.info("Exception"+e);
			return null;
		}
				
	}
	@GetMapping("/getall/{department_id}")
	public Department getDepartmentById(@PathVariable int department_id){			
		try {
			log.info("departmentServicess getDepartmentById respons is sucessfull");			
			return departmentServicess.getDepartmentById(department_id);
			
		} catch (Exception e) {
			log.info("Exception"+e);
			return null;
		}			
		
	}
	
	@PostMapping("/adddepartment")
	public Department createOrSaveDepartment(@RequestBody Department department){
				
		try {
			log.info("createOrSaveDepartment is with {}"+department );
			
			return departmentServicess.createOrSaveDepartment(department);	
			
		} catch (Exception e) {
			
			log.info("Exception"+e);
			return null;
		}
		
	}
	
	@PutMapping("/update/{department_id}")
	public Department updateDepartment(@RequestBody Department department ,@PathVariable int  department_id){
	 
		try {
			log.info("update Department sucessfull"+department );	
			return departmentServicess.updateDepartment(department ,department_id);
		} catch (Exception e) {
			log.info("Exception"+e);
			return department;
		}
		
		
		
	}
	
	
	@DeleteMapping("/deleteDepartment/{department_id}")
	public Status deleteDepartment(@PathVariable int department_id){
	
		try {
			departmentServicess.deleteDepartment(department_id);
			
			log.info("Soft Deleted Successfully !"+department_id);
			return new Status("Soft Deleted Successfully !");
		} catch (Exception e) {
			
			log.info("No data Avalibel already Deleted !"+department_id +""+e);
			return new Status("No data Avalibel already Deleted !");
		}
		
		
		
	}
	

}
