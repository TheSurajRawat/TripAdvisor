package com.tripadvisor.pageevents;

import com.tripadvisor.base.BaseClass;
import com.tripadvisor.pageobjects.IndexPageObjects;
import com.tripadvisor.utilities.ElementFetch;

public class IndexPageEvents extends BaseClass {

	ElementFetch elementFetch = new ElementFetch();

	public void clickOnSignInButton() {
		elementFetch.getWebElement("XPATH", IndexPageObjects.signInButton).click();
	}

}
