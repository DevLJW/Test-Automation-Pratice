package com.example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class ShouldPerformCompositeAction {
	
	 WebDriver driver;

  @BeforeMethod
  public void beforeMethod() {
	  
	
	  
	  System.setProperty("webdriver.chrome.driver","C:\\eclipse\\qatest\\src\\test\\resources\\chromedriver-win64/chromedriver.exe");
      driver = new ChromeDriver();
	  driver.get("http://guidebook.seleniumacademy.com/Selectable.html"); 
	
  }
  
  @Test
  public void shouldPerformCompositeAction() {
	  
	  // 엘리먼트 가져오기
	  WebElement one = driver.findElement(By.name("one"));
	  
	  WebElement three = driver.findElement(By.name("two"));
	  WebElement five = driver.findElement(By.name("five"));
	  
	  //액션 빌더에 모든 액션 추가
	  Actions actions = new Actions(driver);
	  actions.keyDown(Keys.CONTROL)
	  .click(one).click(three).click(five).keyUp(Keys.CONTROL);
	  
	  
	  // 복합 액션 설정
	  Action compositeAction = actions.build();
	  
	  
	  // 복합 액션 실행
	  compositeAction.perform();
	  
	
    
  }

  @AfterMethod
  public void afterMethod() {
  }

}
