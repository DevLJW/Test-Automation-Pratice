package com.example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.Assert;
public class BroswerNav {
	
	WebDriver driver; 	// 셀레늄 웹 드라이버

  @BeforeMethod
  public void beforeMethod() {
	  
	// 크롬드라이버 사용경로 설정
	System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\qatest\\src\\test\\resources\\chromedriver-win64/chromedriver.exe");
	
	// 크롬 드라이버 인스턴스로 초기화
    driver = new ChromeDriver();	
    
    //네비게이션 클래스의 to메서드를 사용하여 웹페이지 URL로 이동한다.
    driver.navigate().to("http://demo-store.seleniumacademy.com/");
	
  }

  @Test
  public void broswernav1() {
	  
	
	  WebElement searchBox = driver.findElement(By.name("q"));
	  searchBox.sendKeys("Phones");
	  
	  WebElement searchButton = driver.findElement(By.className("search-button"));
	  searchButton.click();
	  

	  // 뒤로가기
	  driver.navigate().back();
	  
	  // 앞으로가기
	  driver.navigate().forward();
	  
	  // 새로고침
	  driver.navigate().refresh();
	  

	
	   
  }
  
  @AfterMethod
  public void afterMethod() {
  }

}
