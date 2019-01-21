package com.mywork.services.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import com.mywork.domainmodels.Employee;
import com.mywork.services.GetEmployeeDetails;

public class EmployeeDetails implements GetEmployeeDetails
{

	public List<Employee> getEmployeeDetails(String s) 
	{
		List<Employee> emp_list = new LinkedList<Employee>();
		try(BufferedReader br = new BufferedReader(new FileReader(s)))
		{
			String line = "";
			while((line = br.readLine())!=null)
			{
			 //splits() the given string and stores each element based on delimiter supplied
			 String[] attributes = line.split(",");
			 Employee e = new Employee();
			 e.setEmployeeName(attributes[0]);
			 e.setEmployeeId(attributes[1]);
			 e.setDesignation(attributes[2]);
			 e.setWorkLocation(attributes[3]);
			 emp_list.add(e);
			}	
		} 
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
		return emp_list ;
	}
}
