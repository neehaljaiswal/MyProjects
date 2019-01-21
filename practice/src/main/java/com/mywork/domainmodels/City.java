package com.mywork.domainmodels;

import java.util.List;

public class City 
{
	private String cityName;
	private List<Company> companyDetails;
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public List<Company> getCompanyDetails() {
		return companyDetails;
	}
	public void setCompanyDetails(List<Company> companyDetails) {
		this.companyDetails = companyDetails;
	}
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", companyDetails=" + companyDetails + "]";
	}
}
