package com.example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FrameHandlingTest {
	
	WebDriver driver; 	// ������ �� ����̹�

  @BeforeMethod
  public void beforeMethod() {
	  
	  // ũ�ҵ���̹� ����� ����
	  System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\qatest\\src\\test\\resources\\chromedriver-win64/chromedriver.exe");
	  
	  //ũ�� ����̹� �ν��Ͻ��� �ʱ�ȭ
	  driver = new ChromeDriver();	
	  
	  //�ش� �ּ� ����Ʈ�� �����Ѵ�.
	  driver.get("http://guidebook.seleniumacademy.com/Frames.html");
	  
  }
  
  @Test
  public void switchBetweenFrames() {
	  
	  // ù���� ������
	  driver.switchTo().frame(0);
	  WebElement firstField = driver.findElement(By.name("1"));
	  firstField.sendKeys("ù��° �Է� �� �Դϴ�.");
	  driver.switchTo().defaultContent();
	  
	  // �ι��� ������
	  driver.switchTo().frame(1);
	  WebElement SecondField = driver.findElement(By.name("2"));
	  SecondField.sendKeys("�ι�° �Է� �� �Դϴ�.");
	

	  
	  
  }
  

  @AfterMethod
  public void afterMethod() {
	  
	  
  }

}
