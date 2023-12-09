package com.salesforce.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class ApplauncherPage extends ProjectSpecificMethods {
	
	
	public WorktypePage clickworktype()
	{
		clickUsingJs(locateElement(Locators.XPATH, "//p[text()='Work Types']"));
		return new WorktypePage();
	}

}
