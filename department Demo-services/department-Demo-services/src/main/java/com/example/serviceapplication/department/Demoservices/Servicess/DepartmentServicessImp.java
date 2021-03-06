package com.example.serviceapplication.department.Demoservices.Servicess;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.serviceapplication.department.Demoservices.Entity.Department;
import com.example.serviceapplication.department.Demoservices.Repository.DepartmentRepository;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.Builder;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class DepartmentServicessImp implements DepartmentServicess{

	org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(DepartmentServicessImp.class);

	@Autowired
	private DepartmentRepository departmentRepository;

	public List<Department> getAllDepartment() {

		return departmentRepository.findAll();
	}

	public Department getDepartmentById(int department_id) {
		
		
		
		return departmentRepository.findBydepartmentid(department_id);
		//Optional<Department>Depdata =departmentRepository.findById(department_id);		
		//BeanUtils.copyProperties(Depdata, Departmentlist);
		//log.info("department Repository findByIdt is with-->"+Departmentlist );
		 
		
				

	}

	public Department createOrSaveDepartment(Department newdepartment) {	
		
		log.info("SaveDepartment is with-->"+newdepartment );
		
		Department obdepartment =departmentRepository.save(newdepartment);
		
		log.info("after SaveDepartment is with-->"+obdepartment );
		
		return obdepartment;
		
	}

	public void deleteDepartment(int department_id) {
		departmentRepository.findById(department_id).map(department -> {
			department.setDeletes(0);
			return departmentRepository.save(department);
		});
	}

	public Department updateDepartment(Department department, int department_id) {

		try {
			return departmentRepository.findById(department_id).map(d -> {
				d.setDepartmentid(department.getDepartmentid());
				d.setDepartment_name(department.getDepartment_name());
				d.setDepartment_detals(department.getDepartment_detals());
				d.setDeletes(department.getDeletes());
				return departmentRepository.save(department);
			}).orElseGet(() -> {
				department.setDepartmentid(department_id);
				return departmentRepository.save(department);
			});
		} catch (Exception e) {
			log.info("Exception" + e);
			return null;
		}

	}

}
