package com.IITR.ems.service;

import java.util.List;

import com.IITR.ems.entity.Employee;

public interface EmployeeService {
		
	List<Employee> getAllEmployees();
	
	Employee saveEmployee(Employee employee);
	
	Employee getEmployeeById(Long id);
	   
	Employee updateEmployee(Employee employee);

	void deleteEmployeeById(Long id);

}