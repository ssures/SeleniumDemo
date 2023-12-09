package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class NewWorktypePage extends ProjectSpecificMethods {
	
	//input[@title='Search Operating Hours']
	//span[@title='New Operating Hours']
	
	//input[contains(@id,'21')]
	
	public NewWorktypePage clickworktypename()
	{
		click(locateElement(Locators.XPATH, "//input[@class=' input']"));
		return this;
	}

	public NewWorktypePage enterworktypename(String projectname)
	{
		type(locateElement(Locators.XPATH, "//input[@class=' input']"), projectname);
		return this;
	}
	
	public NewWorktypePage clickdescription()
	{
		click(locateElement(Locators.XPATH, "//textarea[@role='textbox']"));
		return this;
	}
	
	public NewWorktypePage enterdescription(String networktype)
	{
		type(locateElement(Locators.XPATH, "//textarea[@role='textbox']"), networktype);
		return this;
	}
	
	public NewWorktypePage clickoperatinghours()
	{
		click(locateElement(Locators.XPATH, "//input[@title='Search Operating Hours']"));
		return this;
	}
	
	
	public NewOperatingHoursPage clicknewoperatinghours()
	{
		click(locateElement(Locators.XPATH, "//span[@title='New Operating Hours']"));
		return new NewOperatingHoursPage();
	}
	
	
	public NewWorktypePage clickestimatedduration()
	{
		clickUsingJs(locateElement(Locators.XPATH,"//*[text()='Estimated Duration']//following::input[7]"));
		//click(locateElement(Locators.XPATH,"//*[text()='Estimated Duration']//following::input[7]"));
		return this;
	}
	
	public NewWorktypePage enterestimatedhours(String estimatedhours)
	{
		type(locateElement(Locators.XPATH, "//*[text()='Estimated Duration']//following::input[7]"),estimatedhours);
		return this;
	}
	
	public NewWorktypePage clickSave()
	{
		click(locateElement(Locators.XPATH,"//button[@title='Save']"));
		return this;
	}
	
}
