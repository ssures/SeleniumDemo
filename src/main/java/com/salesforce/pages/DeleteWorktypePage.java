package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class DeleteWorktypePage extends ProjectSpecificMethods {
	
	public DeleteWorktypePage clicksave()
	{
		click(locateElement(Locators.XPATH, "//span[text()='Delete']"));
		return this;
	}

}
