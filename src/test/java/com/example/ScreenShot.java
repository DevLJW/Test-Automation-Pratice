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
	WebDriver driver; 	// ������ �� ����̹�
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  // ũ�ҵ���̹� ����� ����
	  System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\qatest\\src\\test\\resources\\chromedriver-win64/chromedriver.exe");
	  
	  //ũ�� ����̹� �ν��Ͻ��� �ʱ�ȭ
	  driver = new ChromeDriver();	
	  
	  //�ش� �ּ� ����Ʈ�� �����Ѵ�.
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
