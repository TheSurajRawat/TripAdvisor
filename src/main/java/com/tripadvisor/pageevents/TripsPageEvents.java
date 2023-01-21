package com.tripadvisor.pageevents;

import org.testng.Assert;

import com.tripadvisor.actiondriver.Action;
import com.tripadvisor.base.BaseClass;
import com.tripadvisor.pageobjects.LoginPageObjects;
import com.tripadvisor.pageobjects.TripsPageObjects;
import com.tripadvisor.utilities.ElementFetch;

public class TripsPageEvents extends BaseClass { // Remove Thread.sleep

	ElementFetch elementFetch = new ElementFetch();
	Action action = new Action();
	HomePageEvents homePageEvents = new HomePageEvents();

	public void ProcessCreateTrip() throws InterruptedException {
		elementFetch.getWebElement("XPATH", TripsPageObjects.divCreate).click();
	}

	public void enterTripDetails() throws InterruptedException {
		elementFetch.getWebElement("XPATH", TripsPageObjects.tripNameTextField).click();
		elementFetch.getWebElement("XPATH", TripsPageObjects.tripNameTextField).sendKeys(prop.getProperty("tripName"));
		Thread.sleep(5000);
		elementFetch.getWebElement("XPATH", TripsPageObjects.privateRadioButton).click();
		Thread.sleep(5000);

	}

	public void clickOnCreateButton() {
		elementFetch.getWebElement("XPATH", TripsPageObjects.createButton).click();
	}

	public void verifyTripIsCreated() {
		Assert.assertTrue(elementFetch.getListWebElements("XPATH", TripsPageObjects.tripName).size() > 0,
				"Trip is not created");
	}

	public void OpenTheTripCreated() {
		elementFetch.getWebElement("XPATH", TripsPageObjects.tripName).click();

	}

	public void verifyTheCreatedTripMessage() {
		Assert.assertTrue(elementFetch.getListWebElements("XPATH", TripsPageObjects.createdTripMessage).size() > 0,
				"Trip is not created");
	}

	public void deleteTheTrip() throws InterruptedException {
		elementFetch.getWebElement("XPATH", TripsPageObjects.threedots).click();
		Thread.sleep(3000);
		elementFetch.getWebElement("XPATH", TripsPageObjects.deleteTrip).click();
		Thread.sleep(3000);
		elementFetch.getWebElement("XPATH", TripsPageObjects.deleteButton).click();
	}

	public void verifyTripIsdeleted() {
		Assert.assertTrue(elementFetch.getListWebElements("XPATH", TripsPageObjects.tripName).size() == 0,
				"Trip is not deleted yet");
	}
}
