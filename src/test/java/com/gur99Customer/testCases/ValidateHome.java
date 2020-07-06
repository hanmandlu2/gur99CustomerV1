package com.gur99Customer.testCases;


import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
/*
import java.io.File;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
*/


public class ValidateHome {

@Test 	
public void homeVal() {
	
//	System.setProperty("webdriver.gecko.driver", "F:\\DevOps_Maven\\geckodriver.exe");
//	WebDriver driver = new FirefoxDriver();
	System.setProperty("webdriver.chrome.driver", "F:\\DevOps_Maven\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/V4/");
	
	if(driver.getTitle().equals("Guru99 Bank Home Page")) {
		Assert.assertTrue(true);
	}
	else{	
			Assert.assertTrue(false);
	}
	driver.close();
	
}

}
