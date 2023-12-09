package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class WorktypePage extends ProjectSpecificMethods {
	
	
	public NewWorktypePage clicknew()
	{
		click(locateElement(Locators.XPATH, "//div[text()='New']"));
		return new NewWorktypePage();
	}
	
	public WorktypePage clickedit()
	{
		click(locateElement(Locators.XPATH, "(//div[@class='forceVirtualActionMarker forceVirtualAction'])[1]"));
		return this;
	}

	public EditWorkTypePage clickeditlink()
	{
		clickUsingJs(locateElement(Locators.XPATH, "//div[text()='Edit']"));
		//waitForApperance(locateElement(Locators.XPATH, "//div[text()='Edit']"));
		//click(locateElement(Locators.XPATH, "//div[text()='Edit']"));
		return new EditWorkTypePage();
	}
	
	public DeleteWorktypePage clickdeletelink()
	{
		clickUsingJs(locateElement(Locators.XPATH, "//div[text()='Delete']"));
		//click(locateElement(Locators.XPATH, "//div[text()='Delete']"));
		return new DeleteWorktypePage() ;
	}
}
