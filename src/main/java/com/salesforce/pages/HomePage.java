package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	
	
			
	public HomePage clickToggleMenu()
	{
		click(locateElement(Locators.XPATH, "//div[@class = 'slds-icon-waffle']"));
		return this;
	}
	
	public ApplauncherPage viewall()
	{
		click(locateElement(Locators.XPATH, "//button[text()='View All']"));
		return new ApplauncherPage();
	}

}
