package com.mywork.domainmodels;

import java.util.List;

public class Company 
{
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", empDetails=" + empDetails + "]";
	}
	private String companyName;
	private List<Employee> empDetails;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public List<Employee> getEmpDetails() {
		return empDetails;
	}
	public void setEmpDetails(List<Employee> empDetails) {
		this.empDetails = empDetails;
	}
}
