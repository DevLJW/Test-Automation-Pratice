package com.example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class ElementWait {

	WebDriver driver; 	// 셀레늄 웹 드라이버
	
  @BeforeMethod
  public void beforeMethod() {
	  
	  	// 크롬드라이버 사용경로 설정
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\qatest\\src\\test\\resources\\chromedriver-win64/chromedriver.exe");
		
		// 크롬 드라이버 인스턴스로 초기화
	    driver = new ChromeDriver();	
	    
	    //네비게이션 클래스의 to메서드를 사용하여 웹페이지 URL로 이동한다.
	    driver.navigate().to("http://demo-store.seleniumacademy.com/");
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
  }
  
  @Test
  public void elementwait() {
	  
	  WebElement searchBox = (new WebDriverWait(driver, 20).until((ExpectedCondition<WebElement>) d ->
	  		d.findElement(By.name("q"))
			  ));
	  
  }
  
  

  @AfterMethod
  public void afterMethod() {
  }

}
