package com.tripadvisor.pageevents;

import org.testng.Assert;

import com.tripadvisor.actiondriver.Action;
import com.tripadvisor.base.BaseClass;
import com.tripadvisor.pageobjects.LoginPageObjects;
import com.tripadvisor.utilities.ElementFetch;

public class LoginPageEvents extends BaseClass {

	ElementFetch elementFetch = new ElementFetch();
	Action action = new Action();

	public void verifyLoginPageOpenedOrNot() {
		Assert.assertTrue(elementFetch.getListWebElements("XPATH", LoginPageObjects.signIntext).size() > 0,
				"Login pop up did not open");
	}

	public void clickOnContinueWithEmailOption() {
		elementFetch.getWebElement("XPATH", LoginPageObjects.continueWithEmailButton).click();
	}

	public void verifyWelcomeBackText() {
		Assert.assertTrue(elementFetch.getListWebElements("XPATH", LoginPageObjects.welcomeBackText).size() > 0,
				"Login pop up did not open");
	}

	public void enterEmailId() {
		elementFetch.getWebElement("ID", LoginPageObjects.emailTextField).sendKeys(prop.getProperty("username"));
	}

	public void enterPassword() {
		elementFetch.getWebElement("ID", LoginPageObjects.pwdTextField).sendKeys(prop.getProperty("password"));
	}

	public void clickOnSignInButton() {
		elementFetch.getWebElement("XPATH", LoginPageObjects.signInButton).click();
	}
	
	public void switchToFrame() {
		action.switchToFrameByWebElement(elementFetch.getWebElement("XPATH",LoginPageObjects.frameXpath));
	}

}
