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

	WebDriver driver; 	// ������ �� ����̹�
	
  @BeforeMethod
  public void beforeMethod() {
	  
	  	// ũ�ҵ���̹� ����� ����
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\qatest\\src\\test\\resources\\chromedriver-win64/chromedriver.exe");
		
		// ũ�� ����̹� �ν��Ͻ��� �ʱ�ȭ
	    driver = new ChromeDriver();	
	    
	    //�׺���̼� Ŭ������ to�޼��带 ����Ͽ� �������� URL�� �̵��Ѵ�.
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
