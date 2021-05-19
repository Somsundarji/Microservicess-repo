package com.example.serviceapplication.department.Demoservices.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.serviceapplication.department.Demoservices.Entity.Department;


@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

        Department findBydepartmentid(int department_id);

}
