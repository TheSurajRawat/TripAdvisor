package com.tripadvisor.pageobjects;

public interface ReviewPageObjects {
	
	String searchBarForReview = "//input[@placeholder = 'What would you like to review?']";
	
	String ratingsBar = "qid10";
	
	String reviewText = "ReviewText";
	
	String reviewTitle = "ReviewTitle";
	
	String visitedDate = "trip_date_month_year";
		
	String members = "qid505";
	
	String ratingBar = "bubble_rating";
	
	String submitForReview = "SUBMIT";
	
	String reviewConsentCheckbox = "//label[@for = 'noFraud']";
	
	String postUserName = ":login-gate-r2:";
	
	String doneButton = "//span[text() = 'Done']";
	
	String reviewPostedMessage = "//div[contains(text(), 'thanks for your review')]";

}
