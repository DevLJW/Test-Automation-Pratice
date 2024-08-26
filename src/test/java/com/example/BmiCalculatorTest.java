package com.example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.net.URL;
import java.text.MessageFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class BmiCalculatorTest {
	
	WebDriver driver;
	
	 @BeforeMethod
	  public void beforeMethod() throws Exception {
		 	String SAUCE_USER = "oauth-jaewookvvv123-f8037";
		 	String SAUCE_KEY = "dc3fc0d9-f015-4c87-bffb-5f5b8e5ac376";
		 	
		 	DesiredCapabilities caps = new DesiredCapabilities();
		 	caps.setCapability("platformName", "Windows 10");
			caps.setCapability("browserName", "Firefox");
		//caps.setCapability("name", "BMI Calculator Test");
			  driver = new RemoteWebDriver(new URL(MessageFormat.format("http://{0}:{1}@ondemand.saucelabs.com:80/wd/hub",SAUCE_USER,SAUCE_KEY)),caps); 
		 	driver.get("http://cookbook.seleniumacademy.com/bmicalculator.html");
		 	
		 
		 
	  }
	
  @Test
  public void testBmiCalc() {
	  
	  	WebElement height = driver.findElement(By.name("heightCMS"));
	  	height.sendKeys("181");
	  	
		WebElement weight = driver.findElement(By.name("weightKg"));
	  	height.sendKeys("80");
	  	
	  	WebElement calculateButton = driver.findElement(By.id("Calculate"));
	  	calculateButton.click();
	  	
	  	WebElement bmi_category = driver.findElement(By.name("bmi_category"));
	 
	  
	  
  }
 

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
