package com.tripadvisor.pageobjects;

public interface AskQuestionPageObjects {

	String questionAnswerTab = "//span[text() = 'Q&A']";

	String askQuestionButton = "(//span[text() = 'Ask a question'])[2]";

	String askQuestionTextField = "//textarea[@name = 'topictext']";

	String askButton = "SBMT_QUESTION";

	String deleteIcon = "//span[@class = 'sprite-trash']";

//	String deleteQuestionConfirmation = "//h3[text() = 'Are you sure you want to delete this question?']";

	String deleteQuestionButton = "//span[text() = 'Delete question']";

}
