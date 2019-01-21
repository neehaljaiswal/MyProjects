package com.mywork.services.impl;

import java.util.LinkedList;
import java.util.List;

import com.mywork.domainmodels.Company;
import com.mywork.domainmodels.Employee;
import com.mywork.services.GetCompanyDetails;

public class CompanyDetails implements GetCompanyDetails
{
	public List<Company> getCompanyDetails(String filepath) 
	{
		List<Company> listOfCompanies = new LinkedList<Company>();
		EmployeeDetails getEmpData = new EmployeeDetails();
		List<Employee> empList = getEmpData.getEmployeeDetails(filepath);
		
		Company companyCompugain = new Company();
		companyCompugain.setCompanyName("CompugainSolutions");
		companyCompugain.setEmpDetails(empList);
		listOfCompanies.add(companyCompugain);
		
		Company companyTCS = new Company();
		companyTCS.setCompanyName("Tata Consultancy Services");
		companyTCS.setEmpDetails(empList);
		listOfCompanies.add(companyTCS);
		
		Company companyDell = new Company();
		companyDell.setCompanyName("Dell Limited");
		companyDell.setEmpDetails(empList);
		listOfCompanies.add(companyDell);
		
		Company companyDl = new Company();
		companyDl.setCompanyName("Digital Labs");
		companyDl.setEmpDetails(empList);
		listOfCompanies.add(companyDl);
		
		Company companyEclipse = new Company();
		companyEclipse.setCompanyName("Eclipse Org");
		companyEclipse.setEmpDetails(empList);
		listOfCompanies.add(companyEclipse);
		return listOfCompanies;
	}

}
