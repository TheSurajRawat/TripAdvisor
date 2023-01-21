package com.tripadvisor.pageobjects;

public interface HomePageObjects {
	
	String reviewButton = "//span[text() = 'Review']";
	
	String tripsButton = "//span[text() = 'Trips']";
	
	String searchBox = "(//input[@type = 'search'])[2]";
	
	String firstOptionSearchBox = "(//input[@type = 'search'])[2]/parent::form//div//a";

}
