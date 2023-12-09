package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class EditWorkTypePage extends ProjectSpecificMethods {

	
	public EditWorkTypePage clickstarttimeframe()
	{
		click(locateElement(Locators.XPATH,"//span[text()='Timeframe Start']//following::input[1]"));
		return this;
	}
	
	
	public EditWorkTypePage enterstarttime()
	{
		type(locateElement(Locators.XPATH, "//span[text()='Timeframe Start']//following::input[1]"), "9");
		return this;
	}
	
	
	public EditWorkTypePage clickendtimeframe()
	{
		click(locateElement(Locators.XPATH, "//span[text()='Timeframe Start']//following::input[2]"));
		return this;
	}
	
	public EditWorkTypePage enterendtime()
	{
		type(locateElement(Locators.XPATH, "//span[text()='Timeframe Start']//following::input[2]"), "18");
		return this;
	}
	
	public EditWorkTypePage clicksave()
	{
		click(locateElement(Locators.XPATH, "//span[text()='Save & New']//following::button"));
		return this;
	}
}
