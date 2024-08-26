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
	
	WebDriver driver; 	// ������ �� ����̹�

  @BeforeMethod
  public void beforeMethod() {
	  
	// ũ�ҵ���̹� ����� ����
	System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\qatest\\src\\test\\resources\\chromedriver-win64/chromedriver.exe");
	
	// ũ�� ����̹� �ν��Ͻ��� �ʱ�ȭ
    driver = new ChromeDriver();	
    
    //�׺���̼� Ŭ������ to�޼��带 ����Ͽ� �������� URL�� �̵��Ѵ�.
    driver.navigate().to("http://demo-store.seleniumacademy.com/");
	
  }

  @Test
  public void broswernav1() {
	  
	
	  WebElement searchBox = driver.findElement(By.name("q"));
	  searchBox.sendKeys("Phones");
	  
	  WebElement searchButton = driver.findElement(By.className("search-button"));
	  searchButton.click();
	  

	  // �ڷΰ���
	  driver.navigate().back();
	  
	  // �����ΰ���
	  driver.navigate().forward();
	  
	  // ���ΰ�ħ
	  driver.navigate().refresh();
	  

	
	   
  }
  
  @AfterMethod
  public void afterMethod() {
  }

}
