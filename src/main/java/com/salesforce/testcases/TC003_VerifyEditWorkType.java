package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.HomePage;
import com.salesforce.pages.NewLoginPage;

public class TC003_VerifyEditWorkType extends ProjectSpecificMethods {
	
	@BeforeTest
	public void beforetest()
	{
		testcaseName = "VerifyEditWorkType";
		testDescription = "VerifyEditWorkType functionality with positive data";
		authors = "Suresh";
		category = "Smoke";
		excelFileName = "EditWorkType";
	}
	
	@Test(dataProvider = "fetchData")
	public void editworktype(String username,String password)
	{
		new NewLoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.login()
		.clickToggleMenu()
		.viewall()
		.clickworktype()
		.clickedit()
		.clickeditlink()
		.clickstarttimeframe()
		.enterstarttime()
		.clickendtimeframe()
		.enterendtime()
		.clicksave();
		
	}

}
