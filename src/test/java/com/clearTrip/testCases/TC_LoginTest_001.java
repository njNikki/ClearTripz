package com.clearTrip.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.clearTrip.basePage.BaseClass;
import com.clearTrip.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws IOException 
	{
	LoginPage lp= new LoginPage(driver);
	
	lp.clickYourTrips();
	lp.clickSignIn();
	driver.switchTo().frame("modal_window");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	  System.out.println("thread interrupted");
	
	}
	lp.setUserName(username);
	logger.info("Username is entered");
	
	lp.setPassword(password);
	logger.info("Password is entered");
	lp.clickSignInBtn();
	lp.clickLoggedInName();
	lp.clickSignOut();
	String actualTitle=driver.getTitle();
	System.out.println(actualTitle);
	
	if(actualTitle.equals("#1 Site for Booking Flights, Hotels, Packages, Trains & Local activities."))
			{
		Assert.assertTrue(true);
		logger.info("TestCase passed");
			}
	else {
		
		captureScreen(driver,"loginTest");
		Assert.assertTrue(false);
		logger.info("TestCase Failed");
		
	}
			
	}
	
}
