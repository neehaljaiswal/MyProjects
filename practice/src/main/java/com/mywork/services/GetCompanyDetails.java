package com.mywork.services;

import java.util.List;

import com.mywork.domainmodels.Company;

public interface GetCompanyDetails 
{
	public List<Company> getCompanyDetails(String filepath); 	
}
