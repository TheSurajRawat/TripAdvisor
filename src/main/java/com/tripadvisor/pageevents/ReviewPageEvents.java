package com.tripadvisor.pageevents;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.tripadvisor.actiondriver.Action;
import com.tripadvisor.base.BaseClass;
import com.tripadvisor.pageobjects.ReviewPageObjects;
import com.tripadvisor.utilities.ElementFetch;

public class ReviewPageEvents extends BaseClass { // Remove Thread.sleep

	ElementFetch elementFetch = new ElementFetch();
	Action action = new Action();

	public void enterTextIntoSearchBarForReview() throws InterruptedException {
		WebElement performOps = elementFetch.getWebElement("XPATH", ReviewPageObjects.searchBarForReview);
		performOps.click();
		performOps.clear();
		performOps.sendKeys(prop.getProperty("locationNameForReview"));
		Thread.sleep(5000);
		performOps.sendKeys(Keys.ENTER);
	}

	public void giveReviewToLocation() throws InterruptedException {
		String monthAndYear = prop.getProperty("visitedDate");
		String withWhomVisited = prop.getProperty("members");
		elementFetch.getWebElement("ID", ReviewPageObjects.ratingBar).click();
		Thread.sleep(5000);
		elementFetch.getWebElement("ID", ReviewPageObjects.reviewText).click();
		elementFetch.getWebElement("ID", ReviewPageObjects.reviewText).sendKeys(prop.getProperty("reviewText"));
		Thread.sleep(5000);
		elementFetch.getWebElement("ID", ReviewPageObjects.reviewTitle).sendKeys(prop.getProperty("reviewTitle"));
		elementFetch.getWebElement("ID", ReviewPageObjects.reviewTitle).click();
		WebElement visitedDate = elementFetch.getWebElement("ID", ReviewPageObjects.visitedDate);
		action.selectByValue(visitedDate, monthAndYear);
		Thread.sleep(5000);
		WebElement members = elementFetch.getWebElement("ID", ReviewPageObjects.members);
		action.selectByValue(members, withWhomVisited);
		Thread.sleep(5000);
		elementFetch.getWebElement("XPATH", ReviewPageObjects.reviewConsentCheckbox).click();
		Thread.sleep(5000);

	}

	public void clickOnSubmitForReviewButton() throws InterruptedException {
		Thread.sleep(5000);
		elementFetch.getWebElement("ID", ReviewPageObjects.submitForReview).click();
		Thread.sleep(5000);
	}

	public void verifyReviewIsPosted() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(
				action.isElementPresent(elementFetch.getWebElement("XPATH", ReviewPageObjects.reviewPostedMessage), 10),
				"Thanks for the Review message does not display and Review is not posted");
	}

}