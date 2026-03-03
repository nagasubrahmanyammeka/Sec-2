package com.klu.service;

import java.util.List;

import com.klu.model.Employee;

public interface EmployeeService {
	//Feature for creating employee into DB
	Employee saveEmployee(Employee e);
	//Retrieving all EMployees from DB
	List<Employee> getEmployees();
	//Retrieving specific Employee from the DB
	Employee getEmployee(Long id);
	//Updating specific Employee based on ID into DB
	Employee updateEmployee(Long id, Employee e);
	//deleting specific Employee based on ID from DB
	String deleteEmployee(Long id);
}
