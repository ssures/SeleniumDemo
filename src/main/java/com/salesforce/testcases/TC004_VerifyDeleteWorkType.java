package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.NewLoginPage;

public class TC004_VerifyDeleteWorkType extends ProjectSpecificMethods{
	
	
	
	@BeforeTest
	public void beforetest()
	{
		testcaseName = "VerifyDeleteWorkType";
		testDescription = "VerifyDeleteWorkType functionality with positive data";
		authors = "Suresh";
		category = "Smoke";
		excelFileName = "DeleteWorkType";
	}
	
	
	@Test(dataProvider = "fetchData")
	public void deleteworktype(String username,String password)
	{
		new NewLoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.login()
		.clickToggleMenu()
		.viewall()
		.clickworktype()
		.clickedit()
		.clickdeletelink()
		.clicksave();
		
		
	}
	
	

}
