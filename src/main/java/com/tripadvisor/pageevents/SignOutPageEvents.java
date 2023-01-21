package com.tripadvisor.pageevents;

import com.tripadvisor.base.BaseClass;
import com.tripadvisor.pageobjects.SignOutPageObjects;
import com.tripadvisor.utilities.ElementFetch;

public class SignOutPageEvents extends BaseClass {

	ElementFetch elementFetch = new ElementFetch();

	public void clickOnProfileLogoImage() {
		elementFetch.getWebElement("XPATH", SignOutPageObjects.profileLogo).click();
	}

	public void clickOnSignOutButton() {
		elementFetch.getWebElement("XPATH", SignOutPageObjects.signOutButton).click();
	}
}
