package com.tripadvisor.pageobjects;

public interface LoginPageObjects {

	String signIntext = "//div[text() = 'Sign in to unlock the best of Tripadvisor.']";

	String continueWithEmailButton = "//span[text() = 'Continue with email']";

	String welcomeBackText = "//div[text() = 'Welcome back. ']";

	String emailTextField = "regSignIn.email";

	String pwdTextField = "regSignIn.password";

	String signInButton = "(//button[text() = 'Sign in'])[1]";
	
	String frameXpath = "//div[@class = 'VZmgo D X0 X1 Za Ra']//iframe";

}
