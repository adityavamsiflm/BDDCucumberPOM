package com.orangehrm.pages;

import java.util.HashMap;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.orangehrm.base.BaseTest;

public class BasePage extends BaseTest {
	
	HashMap<String,By> objectRepo=new HashMap<String,By>();
	
	public void addObject(String logicalName,By by)
	{
		objectRepo.put(logicalName, by);
	}
	
	
	public void validateTitle(String expTitle)
	{
		Assert.assertTrue(driver.getTitle().equals(expTitle));
	}
	
	public void type(String logicalName,String text)
	{
		getElement(logicalName).sendKeys(text);
	}


	public void click(String logicalName)
	{
		getElement(logicalName).click();
	}
	private WebElement  getElement(String logicalName) {
		
		By by=objectRepo.get(logicalName);
		
		WebElement element=driver.findElement(by);
		return element;
		
		
	}
	
	
	
	

}
