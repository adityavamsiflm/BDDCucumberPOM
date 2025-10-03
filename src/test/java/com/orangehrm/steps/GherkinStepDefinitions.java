package com.orangehrm.steps;

import com.orangehrm.base.BaseTest;
import com.orangehrm.pages.BasePage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.RegistrationPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GherkinStepDefinitions extends BaseTest {
	BasePage page;
	
	@Before
	public void setUp()
	{
		BaseTest.launchApplictaion();
	}
	
	@After
	public void teardown()
	{
		driver.quit();
	}
		
	
	@Given("user is on {string}")
	public void user_is_on(String pageName) {
		
		switch(pageName.toLowerCase())
		{
		case "loginpage" : 
			page=new LoginPage();
			break;
			
		case "registrationpage":
			page=new RegistrationPage();
			break;
			default: break;
			
			
		}
	    
	}
	
	@Then("validate title to be {string}")
	public void validate_title_to_be(String expTitle) {
		
		page.validateTitle(expTitle);
	    
	}

	
	@When("user enters text into textbox {string} {string}")
	public void user_enters_text_into_textbox(String logicalName, String text) {
	    
		page.type(logicalName, text);
	}
	
	
	@When("user clicks {string}")
	public void user_clicks(String logicalName) {
	    
		page.click(logicalName);
	}

	
}
