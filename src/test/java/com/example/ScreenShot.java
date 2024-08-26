package com.example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class ScreenShot {
	WebDriver driver; 	// 셀레늄 웹 드라이버
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  // 크롬드라이버 사용경로 설정
	  System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\qatest\\src\\test\\resources\\chromedriver-win64/chromedriver.exe");
	  
	  //크롬 드라이버 인스턴스로 초기화
	  driver = new ChromeDriver();	
	  
	  //해당 주소 사이트를 오픈한다.
	  driver.get("http://demo-store.seleniumacademy.com");
	  
	  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(scrFile,new File("./target/screenshot.png"));
  }

  @Test
  public void run() {
	  Assert.assertEquals(driver.getTitle(),"Madison Island");
  }
  
  
  @AfterMethod
  public void afterMethod() {
  }

}
