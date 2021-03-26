package com.cognizant.springemployee.dao;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.springemployee.model.Employee;

@Repository
public class EmployeeDao 
{
	private static ArrayList<Employee> EMPLOYEE_LIST;
	
	private static final Logger LOGGER=LoggerFactory.getLogger(EmployeeDao.class);
	
	@SuppressWarnings({ "resource", "unchecked" })
	public EmployeeDao()
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("employee.xml");
		
		EMPLOYEE_LIST=context.getBean("employeeList",ArrayList.class);
		
		LOGGER.info("Employees:{}",EMPLOYEE_LIST);
	}
	
	public ArrayList<Employee> getAllEmployees()
	{
		return EMPLOYEE_LIST;
	}
	
}
