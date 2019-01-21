package com.mywork.services.impl;

import java.util.List;

import com.mywork.domainmodels.City;
import com.mywork.domainmodels.Company;
import com.mywork.services.GetCityDetails;

public class CityDetails implements GetCityDetails
{

	@Override
	public City getCityDetails(String cityName, String filePath) 
	{
		CompanyDetails getData = new CompanyDetails();
    	List<Company> companiesList = getData.getCompanyDetails(filePath);
    	City cityData = new City();
    	cityData.setCityName(cityName);
    	cityData.setCompanyDetails(companiesList);
		return cityData;
	}
}
