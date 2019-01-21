package com.mywork.practice;

import com.mywork.services.impl.CityDetails;
public class App 
{
    public static void main(String[] args) 
    {
    	CityDetails getData = new CityDetails();
    	System.out.println(getData.getCityDetails(args[0],args[1]));	
    }	
}
