package com.mywork.services;

import java.util.List;

import com.mywork.domainmodels.Employee;

public interface GetEmployeeDetails 
{
	public List<Employee> getEmployeeDetails(String filepath);
}
