package com.example.serviceapplication.employee.Demoservices.DTO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.serviceapplication.employee.Demoservices.Entety.Employee;

@Repository
public interface Employeeservicesrepository extends JpaRepository<Employee, Integer> {
		public Employee findByemployeeid(int employeeid);

}
