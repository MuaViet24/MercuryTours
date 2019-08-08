package com.MercuryTour.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.MercuryTour.Utility.CommonUtility;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException{
		
		prop = new Properties();
		FileInputStream fip = new FileInputStream("C:\\Stuff\\Reetu\\WorkSpace\\MercuryTour\\src\\main\\java\\com\\MercuryTour\\Configuration\\config.properties");
		prop.load(fip);
	}
	
	public void initialization(){
		
		String browser = prop.getProperty("browser");
		if(browser.contains("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Stuff\\Reetu\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(CommonUtility.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(CommonUtility.IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
			
	}

}
