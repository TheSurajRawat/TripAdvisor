package com.tripadvisor.pageevents;

import com.tripadvisor.actiondriver.Action;
import com.tripadvisor.base.BaseClass;
import com.tripadvisor.pageobjects.HomePageObjects;
import com.tripadvisor.utilities.ElementFetch;

public class HomePageEvents extends BaseClass {

	ElementFetch elementFetch = new ElementFetch();
	Action action = new Action();

	public void clickOnReviewButtonInHomePage() {
		elementFetch.getWebElement("XPATH", HomePageObjects.reviewButton).click();
	}

	public void clickOnTripsButtonInHomepage() {
		elementFetch.getWebElement("XPATH", HomePageObjects.tripsButton).click();
	}

	public void enterTextIntoSearchBox() throws InterruptedException {
		Thread.sleep(5000);
		elementFetch.getWebElement("XPATH", HomePageObjects.searchBox).click();
		elementFetch.getWebElement("XPATH", HomePageObjects.searchBox).clear();
		Thread.sleep(5000);
		elementFetch.getWebElement("XPATH", HomePageObjects.searchBox).sendKeys(prop.getProperty("tripPackageName"));
		Thread.sleep(5000);
		elementFetch.getWebElement("XPATH", HomePageObjects.firstOptionSearchBox).click();
		Thread.sleep(5000);
	}

}
