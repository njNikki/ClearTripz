package com.clearTrip.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
@FindBy(xpath="//span[contains(text(),'Your trips')]")
WebElement lnk_yrTrips;

@FindBy(xpath="//input[@id='SignIn']")
WebElement lnk_signIn;

@FindBy(xpath="//input[@name='email']")
WebElement txt_username;

@FindBy(xpath="//input[@name='password']")
WebElement txt_password;

@FindBy(xpath="//span[contains(text(),'nishantjh39@gmail.com')]")
WebElement lnk_loggedInLink;

@FindBy(xpath="//*[@id='global_signout']")
WebElement lnk_signOut;

@FindBy(xpath="//button[@id='signInButton']")
WebElement btn_signIn;


public void setUserName(String uname)
{
	txt_username.sendKeys(uname);
}

public void setPassword(String pwd)
{
	txt_password.sendKeys(pwd);
}
public void clickYourTrips()
{
	lnk_yrTrips.click();
}
public void clickSignIn()
{
	lnk_signIn.click();
}

public void clickSignInBtn()
{
	btn_signIn.click();
}

public void clickLoggedInName()
{
	lnk_loggedInLink.click();
}

public void clickSignOut()
{
	lnk_signOut.click();
}

}
