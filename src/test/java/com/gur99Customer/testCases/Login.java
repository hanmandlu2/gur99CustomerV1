package com.gur99Customer.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
@Test
	public void loginPage() throws InterruptedException {
		
//		System.setProperty("webdriver.gecko.driver", "F:\\DevOps_Maven\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", "F:\\DevOps_Maven\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		
		WebElement UserId=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
		WebElement pwd=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		WebElement btnLogin=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		
		Thread.sleep(5000);
		UserId.sendKeys("mngr270844");
		pwd.sendKeys("EruzupU");
		btnLogin.click();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
		}
		else{	
				Assert.assertTrue(false);
		}

		driver.close();
	}

}
