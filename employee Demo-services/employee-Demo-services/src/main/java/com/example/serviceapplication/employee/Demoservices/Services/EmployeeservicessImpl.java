package com.example.serviceapplication.employee.Demoservices.Services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.serviceapplication.employee.Demoservices.DTO.Employeeservicesrepository;
import com.example.serviceapplication.employee.Demoservices.Dao.Department;
import com.example.serviceapplication.employee.Demoservices.Dao.DepartmentServiceProxy;
import com.example.serviceapplication.employee.Demoservices.Dao.ResponsTemplate;
import com.example.serviceapplication.employee.Demoservices.Entety.Employee;




@Service
public class EmployeeservicessImpl implements Employeeservicess {

	@Autowired
	private Employeeservicesrepository employeeservicesrepository;
	
	   @Autowired
	    private DepartmentServiceProxy DepServiceProxy;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	Logger logger = LoggerFactory.getLogger(EmployeeservicessImpl.class);
	
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> getAllEmployees = null;
		getAllEmployees = employeeservicesrepository.findAll().stream().filter(p -> p.getDeletes() != 0)
				.collect(Collectors.toList());

		return getAllEmployees;
	}

	@Override
	public Optional<Employee> findAllById(int employee_id) {
	
		return employeeservicesrepository.findById(employee_id);

	}

	@Override
	public Employee createOrSaveEmployee(Employee newEmployee) {

		return employeeservicesrepository.save(newEmployee);

	}

   @CircuitBreaker(name = "service1", fallbackMethod = "fallbackForDEPARTMENT")
   @RateLimiter(name = "service1", fallbackMethod = "fallbackForDEPARTMENT")
   @Retry(name = "retryService1", fallbackMethod = "fallbackForDEPARTMENT")
   //, fallbackMethod = "fallbackForRegister"
	public ResponsTemplate getEmployeedetailsById(int employee_id) {

		ResponsTemplate RT = new ResponsTemplate();
		Employee newEmployee = employeeservicesrepository.findByemployeeid(employee_id);				
		Department departments = restTemplate.getForObject("http://DEPARTMENT-SERVER/department/getall/"+newEmployee.getDepartmentid()
				, Department.class);
						
		RT.setDepartment(departments);
		RT.setEmployee(newEmployee);

		return RT;
		//return null;
	}

	@Override
	public List<Department> getAllDepartment() {	
		
		try {
			
			return DepServiceProxy.getAllDepartment() ;
			
		} catch (Exception e) {			
			System.out.println("Exception "+e);
			return null;
		}
		
	
	}

	@Override
	public Department getDepartmentById(int department_id) {
		// TODO Auto-generated method stub		
		Department Departmentlist = DepServiceProxy.getDepartmentById(department_id);
		
		return Departmentlist;
		
		
	}
	
	  public ResponsTemplate fallbackForDEPARTMENT(int employee_id, Throwable t) {
	        logger.error("Inside circuit breaker fallbackForDepService, cause - {}", t.toString());
	        ResponsTemplate RT = new ResponsTemplate();
	        
	        return RT;
	    }


}
