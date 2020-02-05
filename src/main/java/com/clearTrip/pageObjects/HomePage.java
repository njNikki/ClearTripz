package com.clearTrip.pageObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver ldriver;
	public HomePage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(xpath="//a[@title='Find flights from and to international destinations around the world']")
	WebElement menu_Flights;

	@FindBy(xpath="//a[@title='Find hotels in destinations around the world']")
	WebElement menu_Hotels;
	
	@FindBy(xpath="//a[@id='localsNav']")
	WebElement menu_Activities;
	
	@FindBy(xpath="//a[@title='Find trains to destinations within India']")
	WebElement menu_Trains;

	@FindBy(xpath="//a[@title='Top flight deals']")
	WebElement menu_FlightDeals;
	
	@FindBy(xpath="//span[contains(text(),'Cleartrip for Work')]")
	WebElement menu_ClrTripFrWrk;
	
	@FindBy(xpath="//a[@title='Cleartrip Mobile']")
	WebElement menu_ClrTripMobile;

	@FindBy(xpath="//a[@title='Cancel or change your trips online. View your past and upcoming trips.']")
	WebElement menu_MngTrip;


public ArrayList<String> leftMenuList() {
	String flights=menu_Flights.getText();
	String hotels=menu_Hotels.getText();
	String activities=menu_Activities.getText();
	String trains=menu_Trains.getText();
	String flightDeals=menu_FlightDeals.getText();
	String clrtrpfrwrk=menu_ClrTripFrWrk.getText();
	String clrtrpMobile=menu_ClrTripMobile.getText();
	String mngTrip=menu_MngTrip.getText();
			ArrayList<String> list=new ArrayList<String>();
			list.add(flights);
			list.add(hotels);
			list.add(activities);
			list.add(trains);
			list.add(flightDeals);
			list.add(clrtrpfrwrk);
			list.add(clrtrpMobile);
			list.add(mngTrip);
			Collections.sort(list);
			return (list);
			
	}	
}