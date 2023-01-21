package com.tripadvisor.pageobjects;

public interface MyProfilePageObjects {

	
	String viewProfileMenu = "//span[text() = 'View profile']";
	
	String latestGivenReview = "(//span[@class = 'GXoUa NF S8 _S MVUuZ'])[1]";
	
	String deleteReviewMenu = "//span[text() = 'Delete']";
	
	String deleteReviewReason = "//label[@id  = ':component_1-r1:_label']";
	
	String deleteReviewButton = "//button[text() = 'Delete']";
	
	String deleteConfirmationMessage = "//div[contains(text(), 'Are you sure you want to remove your review completely')]";
	
	String removeReviewButton = "//span[text() = 'Remove review']";
	
	String editProfileButton = "//button[text() = 'Edit profile']";
	
	String searchAddressBar = "//input[@placeholder = 'Search']";
	
	String selectAddress = "//div[@class = 'JfFlP Za w z']//div[1]";
	
	String websiteInputField = "//input[@placeholder = 'Add a website']";
	
	String aboutYouInputField = "//textarea[@placeholder = 'Write some details about yourself']";
	
	String saveButton = "//button[text() = 'Save']";
	
	
}