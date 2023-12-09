package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class NewLoginPage extends ProjectSpecificMethods {
	
	public NewLoginPage enterUsername(String username)
	{
		type(locateElement(Locators.ID,"username"),username);
		return this;
	}
	
	public NewLoginPage enterPassword(String password)
	{
		type(locateElement(Locators.ID, "password"), password);
		return this;
	}

	
	public HomePage login()
	{
		click(locateElement(Locators.ID, "Login"));
		return new HomePage();
	}
}
