package com.example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class RemoteWebDriverTest {
	WebDriver driver; 	// 셀레늄 웹 드라이버

  @BeforeMethod
  public void beforeMethod() throws MalformedURLException{
	  DesiredCapabilities caps = new DesiredCapabilities(); //원격 드라이버 설정
	  caps.setBrowserName("chrome");  // 크롬드라이버 사용경로 설정
	  driver = new RemoteWebDriver(new URL("http://192.168.219.106:4444"),caps); 
	  
	  //해당 주소 사이트를 오픈한다.
	  driver.get("http://demo-store.seleniumacademy.com");
	  
  }
  
  @Test
  public void f() {
	  WebElement searchBox = driver.findElement(By.name("q"));
	  searchBox.sendKeys("phones");
	  
	  
	  
	  
  }
  
  

  @AfterMethod
  public void afterMethod() {
  }

}
