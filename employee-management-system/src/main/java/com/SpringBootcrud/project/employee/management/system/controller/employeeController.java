package com.SpringBootcrud.project.employee.management.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootcrud.project.employee.management.system.model.Employee;
import com.SpringBootcrud.project.employee.management.system.service.EmployeeService;

@RestCotroller
public class employeeController{
	@Autowired
	private employeeService serv;
	@PostMapping("/addemployee")
	public employee addEmployee(@RequestBody employee emps) {
		return serv.saveemployees(emps);
	}
	@PostMapping("/addEmployee")
	public List<employee> addEmployee(@RequestBody List<Employee> emps) {
		return serv.saveEmployees(emps);
	}
	@GetMapping("/employee")
	public List<employee> findAllEmployee(){
		return serv.getemployees();
	}
	@GetMapping("/employeeById/{id}")
	public employee findEmployeeById(@PathVariable int id){
		return serv.getEmployeeById(id);
	}
	@GetMapping("/employee/{name}")
	public employee findEmployeeByName(@PathVariable String name){
		return serv.getEmployeeByName(name);
	}
	@PutMapping("/update")
	public employee updateEmployee(@RequestBody employee emps) {
		return serv.updateEmployee(emps);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteemps(@PathVariable int id) {
		return serv.deleteEmployee(id);
	}
}
	
	
	
}




public class employeeController {

}
