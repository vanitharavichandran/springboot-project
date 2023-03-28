package com.SpringBootcrud.project.employee.management.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootcrud project.model.Student;
import com.SpringBootcrud project.repository.StudentRepository;

@Service
public class employeeService {
	@Autowired
	private employeeRepository resp;
	
	public employee saveStudent(employee emp) {
		return resp.save(emps);
	}
	public List<employee> saveemployees(List<employee> emps) {
		return resp.saveAll(emps);
	}
	public List<employee> getemployee(){
		return resp.findAll();
	}
	public employee getemployeeById(int id){
		return resp.findById(id).orElse(null);
	}
	public employee getemployeeByName(String name){
		return resp.findByName(name);
	}
	public String deleteemployee(int id) {
		resp.deleteById(id);
		return "employee Removed || "+id;
	}
	public employee updateemployee(employee emp) {
		employee exemp=resp.findById(emp.getId()).orElse(null);
		exemp.setName(emp.getName());
		exemp.setPhoneno(emp.getPhoneno());
		exemp.setEmail(emp.getEmail());
		return resp.save(exstud);
	}
	
}



