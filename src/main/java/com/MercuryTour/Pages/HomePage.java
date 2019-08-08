package com.MercuryTour.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MercuryTour.Base.TestBase;

public class HomePage extends TestBase{
	
	public HomePage() throws IOException{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='Home']")
	WebElement eleHome;
	
	@FindBy(xpath="//*[text()='Flights']")
	WebElement eleFlight;
	
	@FindBy(xpath="//*[text()='Cruises']")
	WebElement eleCruise;
	
	@FindBy(xpath="//*[text()='SIGN-ON']")
	WebElement eleSignOn;
	
	@FindBy(xpath="//*[text()='REGISTER']")
	WebElement eleRegister;
	
	public String validateTitle(){
		return driver.getTitle();
	}
	
	public String validateCurrentURL(){
		return driver.getCurrentUrl();
	}
	
	public FlightPage navigateFlightPage() throws IOException{
		 eleFlight.click();
		 return new FlightPage();
	}
	
	public CruisePage navigateCruisePage() throws IOException{
		 eleCruise.click();
		 return new CruisePage();
	}
	
	public SignOnPage  navigateSignOnPage(){
		eleSignOn.click();
		return new SignOnPage();
	}
	
	public RegisterPage navigateRegisterPage(){
		eleRegister.click();
		return new RegisterPage();
	}

}
