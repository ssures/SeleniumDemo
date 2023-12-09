package com.salesforce.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class NewOperatingHoursPage extends ProjectSpecificMethods {
	
	//span[text()='Name']//following::input
	//button[@class='slds-button slds-button--neutral uiButton--brand uiButton forceActionButton']
	public NewOperatingHoursPage entername(String Operatinghours)
	{
		type(locateElement(Locators.XPATH, "//span[text()='Name']//following::input"), Operatinghours);
		return this;
		
	}
	
	public NewWorktypePage clicksave() throws InterruptedException
	{
		//waitForApperance(locateElement(Locators.XPATH,"//button[@title='Save & New']//following::button"));
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "//div[contains(@class,'forceModalActionContain')]//following::button[@title='Save']"));
		
		//clickUsingJs(locateElement(Locators.XPATH,""));
		return new NewWorktypePage();
	}

}
