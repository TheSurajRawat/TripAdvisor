package com.tripadvisor.pageevents;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.tripadvisor.actiondriver.Action;
import com.tripadvisor.base.BaseClass;
import com.tripadvisor.pageobjects.MyProfilePageObjects;
import com.tripadvisor.utilities.ElementFetch;

public class MyProfilePageEvents extends BaseClass { // Remove Thread.sleep and add scroll down

	ElementFetch elementFetch = new ElementFetch();
	Action action = new Action();

	public void clickOnViewProfileMenu() {
		elementFetch.getWebElement("XPATH", MyProfilePageObjects.viewProfileMenu).click();
	}

	public void clickOnDeleteMenu() throws InterruptedException {
		Thread.sleep(5000);
		elementFetch.getWebElement("XPATH", MyProfilePageObjects.latestGivenReview).click();
		Thread.sleep(5000);
		elementFetch.getWebElement("XPATH", MyProfilePageObjects.deleteReviewMenu).click();
	}

	public void selectDeleteReviewReason() throws InterruptedException {
		Thread.sleep(5000);
		elementFetch.getWebElement("XPATH", MyProfilePageObjects.deleteReviewReason).click();
		Thread.sleep(5000);

	}

	public void clickOnDeleteButton() throws InterruptedException {
		Thread.sleep(5000);
		elementFetch.getWebElement("XPATH", MyProfilePageObjects.deleteReviewButton).click();
	}

	public void verifyConfirmationMessageAndClickOnRemoveReviewButton() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(
				action.isElementPresent(
						elementFetch.getWebElement("XPATH", MyProfilePageObjects.deleteConfirmationMessage), 2),
				"Confirmation message did not display");
		Thread.sleep(5000);
		elementFetch.getWebElement("XPATH", MyProfilePageObjects.removeReviewButton).click();
	}

	public void clickOnEditProfileButton() throws InterruptedException {
		Thread.sleep(5000);
		elementFetch.getWebElement("XPATH", MyProfilePageObjects.editProfileButton).click();
	}

	public void enterProfileData() throws InterruptedException {
		Thread.sleep(5000);
		elementFetch.getWebElement("XPATH", MyProfilePageObjects.searchAddressBar).click();
		elementFetch.getWebElement("XPATH", MyProfilePageObjects.searchAddressBar).clear();
		Thread.sleep(5000);
		elementFetch.getWebElement("XPATH", MyProfilePageObjects.searchAddressBar).click();
		elementFetch.getWebElement("XPATH", MyProfilePageObjects.searchAddressBar)
				.sendKeys(prop.getProperty("currentCity"));
		elementFetch.getWebElement("XPATH", MyProfilePageObjects.selectAddress).click();
		Thread.sleep(5000);
		elementFetch.getWebElement("XPATH", MyProfilePageObjects.websiteInputField).click();
		elementFetch.getWebElement("XPATH", MyProfilePageObjects.websiteInputField).clear();
		elementFetch.getWebElement("XPATH", MyProfilePageObjects.websiteInputField)
				.sendKeys(prop.getProperty("websiteLink"));
		Thread.sleep(5000);
		elementFetch.getWebElement("XPATH", MyProfilePageObjects.aboutYouInputField).click();
		elementFetch.getWebElement("XPATH", MyProfilePageObjects.aboutYouInputField).clear();
		elementFetch.getWebElement("XPATH", MyProfilePageObjects.aboutYouInputField)
				.sendKeys(prop.getProperty("aboutYourself"));
	}

	public void clickOnSaveButton() {
		elementFetch.getWebElement("XPATH", MyProfilePageObjects.saveButton).click();
	}

	public void verifyTheUpdatedProfileData() {
		String currentCity = prop.getProperty("currentCity");
		String websiteLink = prop.getProperty("websiteLink");
		String aboutYourself = prop.getProperty("aboutYourself");
		String expectedCurrentCity = driver.findElement(By.xpath("//span[@class = 'PacFI _R S4 H3 LXUOn default']"))
				.getText().trim();
		System.out.println("currentCity= " + currentCity);
		System.out.println("expectedCurrentCity= " + expectedCurrentCity);
		Assert.assertTrue(expectedCurrentCity.contains(currentCity),
				"Updated data does not match with the actual data");
		String expectedWebsiteLink = driver.findElement(By.xpath("//div[@class = 'ui_link BcPve b o W q']")).getText()
				.trim();
		System.out.println("websiteLink= " + websiteLink);
		System.out.println("expectedWebsiteLink= " + expectedWebsiteLink);
		Assert.assertTrue(websiteLink.contains(expectedWebsiteLink),
				"Updated data does not match with the actual data");
		String expectedAboutYourself = driver.findElement(By.xpath("//div[@class = 'PwbCu S4 H3']")).getText().trim();
		System.out.println("aboutYourself= " + aboutYourself);
		System.out.println("expectedAboutYourself= " + expectedAboutYourself);
		Assert.assertTrue(aboutYourself.contains(expectedAboutYourself),
				"Updated data does not match with the actual data");
	}

}
