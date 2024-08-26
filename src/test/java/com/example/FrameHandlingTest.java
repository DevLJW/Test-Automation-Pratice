package com.example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FrameHandlingTest {
	
	WebDriver driver; 	// 셀레늄 웹 드라이버

  @BeforeMethod
  public void beforeMethod() {
	  
	  // 크롬드라이버 사용경로 설정
	  System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\qatest\\src\\test\\resources\\chromedriver-win64/chromedriver.exe");
	  
	  //크롬 드라이버 인스턴스로 초기화
	  driver = new ChromeDriver();	
	  
	  //해당 주소 사이트를 오픈한다.
	  driver.get("http://guidebook.seleniumacademy.com/Frames.html");
	  
  }
  
  @Test
  public void switchBetweenFrames() {
	  
	  // 첫번쨰 프레임
	  driver.switchTo().frame(0);
	  WebElement firstField = driver.findElement(By.name("1"));
	  firstField.sendKeys("첫번째 입력 값 입니다.");
	  driver.switchTo().defaultContent();
	  
	  // 두번쨰 프레임
	  driver.switchTo().frame(1);
	  WebElement SecondField = driver.findElement(By.name("2"));
	  SecondField.sendKeys("두번째 입력 값 입니다.");
	

	  
	  
  }
  

  @AfterMethod
  public void afterMethod() {
	  
	  
  }

}
