package com.orangehrm.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
	
	public LoginPage()
	{
		addObject("usernameTextbox", By.name("username"));
		addObject("passwordTextbox", By.id("password"));
		addObject("loginButton", By.xpath("//input[@name='login']"));
		addObject("forgotPasswordLink", By.linkText("Forgot Password?"));
	}
	

}
