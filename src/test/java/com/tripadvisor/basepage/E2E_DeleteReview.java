package com.tripadvisor.basepage;

import org.testng.annotations.Test;

import com.tripadvisor.actiondriver.Action;
import com.tripadvisor.base.BaseClass;
import com.tripadvisor.pageevents.AskQuestionPageEvents;
import com.tripadvisor.pageevents.HomePageEvents;
import com.tripadvisor.pageevents.IndexPageEvents;
import com.tripadvisor.pageevents.LoginPageEvents;
import com.tripadvisor.pageevents.MyProfilePageEvents;
import com.tripadvisor.pageevents.ReviewPageEvents;
import com.tripadvisor.pageevents.SignOutPageEvents;
import com.tripadvisor.pageevents.TripsPageEvents;
import com.tripadvisor.utilities.ElementFetch;

public class E2E_DeleteReview extends BaseClass {

	ElementFetch elementFetch = new ElementFetch();
	Action action = new Action();
	IndexPageEvents indexPageEvents = new IndexPageEvents();
	LoginPageEvents loginPageEvents = new LoginPageEvents();
	SignOutPageEvents signOutPageEvents = new SignOutPageEvents();
	HomePageEvents homePageEvents = new HomePageEvents();
	ReviewPageEvents reviewPageEvents = new ReviewPageEvents();
	MyProfilePageEvents myProfilePageEvents = new MyProfilePageEvents();
	TripsPageEvents tripsPageEvents = new TripsPageEvents();
	AskQuestionPageEvents askQuestionPageEvents = new AskQuestionPageEvents();
	E2E_AllTestCases allTestCases = new E2E_AllTestCases();

	@Test()
	public void deleteReviewE2E() throws InterruptedException {
		allTestCases.loginMethod();
		Thread.sleep(5000);
		signOutPageEvents.clickOnProfileLogoImage();
		Thread.sleep(5000);
		myProfilePageEvents.clickOnViewProfileMenu();
		Thread.sleep(5000);
		myProfilePageEvents.clickOnDeleteMenu();
		Thread.sleep(5000);
		myProfilePageEvents.selectDeleteReviewReason();
		Thread.sleep(5000);
		myProfilePageEvents.clickOnDeleteButton();
		Thread.sleep(5000);
		myProfilePageEvents.verifyConfirmationMessageAndClickOnRemoveReviewButton();
		Thread.sleep(5000);
		allTestCases.logoutMethod();
	}

}
