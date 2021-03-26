package com.cognizant.springemployee.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springemployee.model.Employee;
import com.cognizant.springemployee.service.EmployeeService;

@RestController
public class EmployeeController 
{
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public ArrayList<Employee> getAllEmployees()
	{
		return employeeService.getAllEmployees();
	}
}
