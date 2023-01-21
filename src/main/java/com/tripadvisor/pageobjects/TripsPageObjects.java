package com.tripadvisor.pageobjects;

import java.util.Properties;

public interface TripsPageObjects {

	public static final Properties prop = new Properties();

	String tripNameConfigFile = prop.getProperty("tripName");
	
	String abc = "New Delhi Trip";

	String getStartedButton = "//button[text() = 'Get started']";

	String createTripOption = "//span[text() = 'Create a Trip']";

	String tripNameTextField = "//input[@name = 'tripName']";

	String privateRadioButton = "//span[text() = 'Private']";

	String createButton = "//button[text() = 'Create']";

	String divCreate = "//div[@class = 'AXwnD u Gi B1 Z BB z _S _Z w']";
	
	String tripName = "//div[@class = 'eaMBq f e _Y G z H IEzZY']/div[1]/div[2]//div[text() = 'New Delhi Trip']";

	String createdTripMessage = "//span[contains(text(), 'You’ve created a Trip')]";
	
	String searchBarForTrips = "//input[@type = 'search']";
	
	String firstOptionInSearch =  "(//input[@type = 'search'])[1]/parent::form//div//a";
	
	String 	saveOption = "//span[text() = 'Save']";
	
	String saveInATrip = "//span[text() = 'New Delhi Trip']";
	
	String place = prop.getProperty("placeName");
	
	String placeName = "div[text() = 'The Oberoi, New Delhi']";
	
	String threedots = "(//span[@class = 'GXoUa NF S8 _S MVUuZ fdbUq'])[1]";
	
	String deleteTrip = "//span[text() = 'Delete Trip']";
	
	String deleteButton = "//button[text() = 'Delete']";
	
	

}