package com.SpringBootcrud.project.employee.management.system.repository;

import org.springframework.data.jpa.repository.jpaRepository;

import com.SpringBootcrud.project.model.Employee;
public interface employeeRepository extends jpaRepository<Employee,Integer> {
	Employee findByName(String name);

}
