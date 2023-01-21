package com.tripadvisor.pageevents;

import com.tripadvisor.actiondriver.Action;
import com.tripadvisor.base.BaseClass;
import com.tripadvisor.pageobjects.AskQuestionPageObjects;
import com.tripadvisor.utilities.ElementFetch;

public class AskQuestionPageEvents extends BaseClass {

	ElementFetch elementFetch = new ElementFetch();
	Action action = new Action();

	public void clickOnQnATab() throws InterruptedException {
		action.innerScrollDown();
		Thread.sleep(5000);
		elementFetch.getWebElement("XPATH", AskQuestionPageObjects.questionAnswerTab).click();
	}

	public void clickOnAskQuestionButton() {
		action.innerScrollDown();
		elementFetch.getWebElement("XPATH", AskQuestionPageObjects.askQuestionButton).click();
	}

	public void enterQuestion() {
		elementFetch.getWebElement("XPATH", AskQuestionPageObjects.askQuestionTextField).click();
		elementFetch.getWebElement("XPATH", AskQuestionPageObjects.askQuestionTextField)
				.sendKeys(prop.getProperty("question"));

	}

	public void clickOnAskButton() {
		elementFetch.getWebElement("ID", AskQuestionPageObjects.askButton).click();
	}

	public void clickOnDeleteIcon() {
		elementFetch.getWebElement("XPATH", AskQuestionPageObjects.deleteIcon).click();
	}

	public void clickOnDeleteQuestionButton() {
		elementFetch.getWebElement("XPATH", AskQuestionPageObjects.deleteQuestionButton).click();
	}
}
