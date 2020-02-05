package com.clearTrip.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.clearTrip.basePage.BaseClass;
import com.clearTrip.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test(priority=1)
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
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	  System.out.println("thread interrupted");
	}
	lp.setPassword(password); 
	logger.info("Password is entered");
	lp.clickSignInBtn();
	logger.info("User logged in successfully");
		
	}
	
	@Test(priority=2)
	public void verifyTitle() throws IOException
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		  System.out.println("thread interrupted");
		}
	String actualTitle=driver.getTitle();
	System.out.println(actualTitle);
	
	if(actualTitle.equals("#1 Site for Booking Flights, Hotels, Packages, Trains & Local activities."))
			{
		Assert.assertTrue(true);
		logger.info("Title is verified");
		logger.info("TestCase passed");
			}
	else {
		
		captureScreen(driver,"verifyTitle");
		Assert.assertTrue(false);
		logger.info("TestCase Failed");
		
	}
			
	}
	
	@Test(priority=3)
	public void logoutTest() throws InterruptedException 
	{
	LoginPage lp2= new LoginPage(driver);
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	  System.out.println("thread interrupted");
	}
	lp2.clickLoggedInName();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	  System.out.println("thread interrupted");
	}
	lp2.clickSignOut();
	logger.info("Signout successful");
	}
}
