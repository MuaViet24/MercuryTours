package com.MercuryTour.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.MercuryTour.Base.TestBase;
import com.MercuryTour.Pages.CruisePage;
import com.MercuryTour.Pages.FlightPage;
import com.MercuryTour.Pages.HomePage;
import com.MercuryTour.Pages.RegisterPage;
import com.MercuryTour.Pages.SignOnPage;

public class HomePageTest extends TestBase {
	
	HomePage hp;

	public HomePageTest() throws IOException {
		super();
		
	}
	
	@BeforeMethod
	public void setup() throws IOException{
		initialization();// call Initialization method
		hp = new HomePage();//Create object of home page
		
	}
	
	@Test(priority=1)
	public void validatePageTitle(){
		String title = hp.validateTitle();
		Assert.assertEquals(title, "Welcome: Mercury Tours");
	}
	
	@Test(priority=2)
	public void validatePageURL(){
		System.out.println("Page URL===>" + hp.validateCurrentURL());
	}
	
	@Test(priority=3)
	public void navigateFlightPage() throws IOException{
		FlightPage fp = hp.navigateFlightPage();
	}
	
	@Test(priority=4)
	public void navigateCruisePage() throws IOException{
		CruisePage cp = hp.navigateCruisePage();
	}
	
	@Test(priority=5)
	public void navigateSignOnPage(){
		
		SignOnPage sp = hp.navigateSignOnPage();
	}
	
	@Test(priority=6)
	public void navigateRegisterPage(){
		RegisterPage rp = hp.navigateRegisterPage();
	}
	
		
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
