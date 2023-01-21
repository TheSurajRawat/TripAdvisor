package com.tripadvisor.basepage;

import org.testng.Assert;
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
import com.tripadvisor.pageobjects.IndexPageObjects;
import com.tripadvisor.utilities.ElementFetch;

public class E2E_AllTestCases extends BaseClass {

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

	public void loginMethod() throws InterruptedException {
		indexPageEvents.clickOnSignInButton();
		Thread.sleep(2000);
		loginPageEvents.switchToFrame();
		Thread.sleep(5000);
		loginPageEvents.clickOnContinueWithEmailOption();
		loginPageEvents.verifyWelcomeBackText();
		loginPageEvents.enterEmailId();
		loginPageEvents.enterPassword();
		Thread.sleep(2000);
		loginPageEvents.clickOnSignInButton();

	}

	public void logoutMethod() throws InterruptedException {
		signOutPageEvents.clickOnProfileLogoImage();
		Thread.sleep(5000);
		signOutPageEvents.clickOnSignOutButton();
		Thread.sleep(5000);
		Assert.assertTrue(elementFetch.getListWebElements("XPATH", IndexPageObjects.signInButton).size() > 0,
				"User did not logged out Successfully");
	}

	@Test(priority = 1)
	public void postQuestions() throws InterruptedException {
		loginMethod();
		Thread.sleep(5000);
		homePageEvents.enterTextIntoSearchBox();
		Thread.sleep(5000);
		askQuestionPageEvents.clickOnQnATab();
		Thread.sleep(5000);
		askQuestionPageEvents.clickOnAskQuestionButton();
		Thread.sleep(5000);
		askQuestionPageEvents.enterQuestion();
		Thread.sleep(5000);
		askQuestionPageEvents.clickOnAskButton();
		Thread.sleep(5000);
		askQuestionPageEvents.clickOnDeleteIcon();
		Thread.sleep(5000);
		askQuestionPageEvents.clickOnDeleteQuestionButton();
		logoutMethod();
	}

	@Test(priority = 2)
	public void createTripsAndDeleteTrips() throws InterruptedException {
		loginMethod();
		Thread.sleep(5000);
		homePageEvents.clickOnTripsButtonInHomepage();
		Thread.sleep(5000);
		tripsPageEvents.ProcessCreateTrip();
		Thread.sleep(5000);
		tripsPageEvents.enterTripDetails();
		Thread.sleep(5000);
		tripsPageEvents.clickOnCreateButton();
		Thread.sleep(5000);
		tripsPageEvents.verifyTripIsCreated();
		Thread.sleep(5000);
		tripsPageEvents.OpenTheTripCreated();
		Thread.sleep(5000);
		tripsPageEvents.verifyTheCreatedTripMessage();
		Thread.sleep(5000);
		tripsPageEvents.deleteTheTrip();
		Thread.sleep(5000);
		tripsPageEvents.verifyTripIsdeleted();
		Thread.sleep(5000);
		logoutMethod();
	}

	@Test(priority = 3)
	public void editProfile() throws InterruptedException {
		loginMethod();
		Thread.sleep(5000);
		signOutPageEvents.clickOnProfileLogoImage();
		Thread.sleep(5000);
		myProfilePageEvents.clickOnViewProfileMenu();
		Thread.sleep(5000);
		myProfilePageEvents.clickOnEditProfileButton();
		Thread.sleep(5000);
		myProfilePageEvents.enterProfileData();
		Thread.sleep(5000);
		myProfilePageEvents.clickOnSaveButton();
		Thread.sleep(5000);
		myProfilePageEvents.verifyTheUpdatedProfileData();
		Thread.sleep(5000);
		logoutMethod();
	}

	@Test(priority = 4)
	public void postReviewE2E() throws InterruptedException {
		loginMethod();
		Thread.sleep(5000);
		homePageEvents.clickOnReviewButtonInHomePage();
		Thread.sleep(5000);
		reviewPageEvents.enterTextIntoSearchBarForReview();
		Thread.sleep(5000);
		reviewPageEvents.giveReviewToLocation();
		Thread.sleep(5000);
		reviewPageEvents.clickOnSubmitForReviewButton();
		Thread.sleep(5000);
		reviewPageEvents.verifyReviewIsPosted();
		logoutMethod();
	}

	@Test(priority = 5)
	public void deleteReviewE2E() throws InterruptedException {
		loginMethod();
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
		logoutMethod();
	}

}
