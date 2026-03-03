package com.klu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klu.model.Employee;
import com.klu.service.EmployeeService;
import com.klu.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@PostMapping("/saveEmp")
	public Employee saveEmployee(@RequestBody Employee e) {
		return employeeService.saveEmployee(e);
		
	}
	@GetMapping("/getAllEmp")
	public List<Employee> getEmployees(){
		return employeeService.getEmployees();
	}
	@GetMapping("/getEmp/{id}")
	public Employee getEmployee(@PathVariable Long id) {
		return employeeService.getEmployee(id);
	}
	@PutMapping("/updateEmp/{id}")
	public Employee updateEmployee(@PathVariable Long id,@RequestBody Employee e) {
		return employeeService.updateEmployee(id, e);
		
	}
	@DeleteMapping("/deleteEmp/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		String msg =  employeeService.deleteEmployee(id);
		return msg;
	}


}
