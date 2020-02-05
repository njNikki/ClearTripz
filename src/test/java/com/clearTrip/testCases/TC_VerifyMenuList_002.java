package com.clearTrip.testCases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.clearTrip.basePage.BaseClass;
import com.clearTrip.pageObjects.HomePage;

public class TC_VerifyMenuList_002 extends BaseClass{
	
	@Test(priority=4)
	public void verifyMainMenuTexts() throws IOException {
	 
	HomePage hp=new HomePage(driver);
	
	logger.info("Main menu lists displayed on console");
	List<String> sampleList = Arrays.asList( "Flights", "Hotels", "Activities","Trains","Flight Deals","Cleartrip for Work","Mobile","Manage trips");
	ArrayList<String> mainMenuList = new ArrayList<String>();
	mainMenuList.addAll(sampleList);
	Collections.sort(mainMenuList);
	ArrayList<String>webList=hp.leftMenuList();
	Collections.sort(webList);
	if(mainMenuList.equals(webList)) {
		Assert.assertTrue(true);
		logger.info("Left main menus text spellings are verified. TestCase Passed");
		logger.info("TestCase passed");
			}
	else {
		
		captureScreen(driver,"verifyMainMenuTexts");
		Assert.assertTrue(false);
		logger.info("TestCase Failed");
	}
	
}
}