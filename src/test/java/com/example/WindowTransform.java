package com.example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class WindowTransform {

	WebDriver driver; 	// ������ �� ����̹�
	
  @BeforeMethod
  public void beforeMethod() {
	  
	  // ũ�ҵ���̹� ����� ����
	  System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\qatest\\src\\test\\resources\\chromedriver-win64/chromedriver.exe");
	  
	  //ũ�� ����̹� �ν��Ͻ��� �ʱ�ȭ
	  driver = new ChromeDriver();	
	  
	  //�ش� �ּ� ����Ʈ�� �����Ѵ�.
	  driver.get("http://guidebook.seleniumacademy.com/Window.html");
	  
	  
	  
  }

  @Test
  public void handleWindow() {
	  
	  // ���� ���� ������ â�� �ĺ��ڸ� ��ȯ�Ѵ�. --> beforeMethod() �޼ҵ忡�� get���� ������ ����Ʈ
	  String firstWindow = driver.getWindowHandle();
	  System.out.println("First Window Handle is :" + firstWindow);
	  
	  WebElement link = driver.findElement(By.linkText("Google Search"));
	  
	  //��ũ�� Ŭ���Ͽ� ���� ������â ����(2��°)
	  link.click();
	  
	
	  
	  // ���� ���� â���� �ĺ����� ������(1,2)
	  Object[] windowHandles=driver.getWindowHandles().toArray();
	  
	   
	  System.out.println("������ �ĺ� ��" + driver.getWindowHandles());
	  System.out.println("������ ����" + driver.getWindowHandles().size());
	
	  // ù��°�迭(0) --> ù��° ����â �ּҰ��� �����Ͽ� ù���� â���� ��Ŀ�� ����
	  driver.switchTo().window((String) windowHandles[0]);
	  


	 
	  
	  
	  
  }
  
  
  
  @AfterMethod
  public void tearDown() {
	  

	  
	  
	  
  }

}
