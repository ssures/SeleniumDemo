package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.*;

public class TC002_VerifyCreateWorkType extends ProjectSpecificMethods {
	
	
	
	@BeforeTest
	public void beforetest()
	{
		testcaseName = "VerifyCreateWorkType";
		testDescription = "VerifyCreateWorkType functionality with positive data";
		authors = "Suresh";
		category = "Smoke";
		excelFileName = "CreateWorkType";
	}
	
	
	@Test(dataProvider = "fetchData")
	public void runnewlogin(String username,String password,String Operatinghours,String projectname,String networktype,String estimatedhours) throws InterruptedException
	{
		new NewLoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.login()
		.clickToggleMenu()
		.viewall()
		.clickworktype()
		.clicknew()
		.clickworktypename()
		.enterworktypename(projectname)
		.clickdescription()
		.enterdescription(networktype)
		.clickoperatinghours()
		.clicknewoperatinghours()
		.entername(Operatinghours)
		.clicksave()
		.clickestimatedduration()
		.enterestimatedhours(estimatedhours)
		.clickSave();
		
		
	}

}
