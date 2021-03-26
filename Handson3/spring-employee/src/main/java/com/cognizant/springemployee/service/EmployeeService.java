package com.cognizant.springemployee.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.springemployee.dao.EmployeeDao;
import com.cognizant.springemployee.model.Employee;

@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeDao employeeDao;
	
	@Transactional
	public ArrayList<Employee> getAllEmployees()
	{
		return employeeDao.getAllEmployees();
	}
}
