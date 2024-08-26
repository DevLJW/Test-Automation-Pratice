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
	  
	  // ������Ʈ ��������
	  WebElement one = driver.findElement(By.name("one"));
	  
	  WebElement three = driver.findElement(By.name("two"));
	  WebElement five = driver.findElement(By.name("five"));
	  
	  //�׼� ������ ��� �׼� �߰�
	  Actions actions = new Actions(driver);
	  actions.keyDown(Keys.CONTROL)
	  .click(one).click(three).click(five).keyUp(Keys.CONTROL);
	  
	  
	  // ���� �׼� ����
	  Action compositeAction = actions.build();
	  
	  
	  // ���� �׼� ����
	  compositeAction.perform();
	  
	
    
  }

  @AfterMethod
  public void afterMethod() {
  }

}
