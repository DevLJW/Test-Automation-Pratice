package com.example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NavigationTest {
	WebDriver driver; 	// ������ �� ����̹�

	  // �׽�Ʈ�� �����ϱ� �� ����	
	  @BeforeMethod
	  public void beforeMethod1() {
		  
		  // ũ�ҵ���̹� ����� ����
		  System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\qatest\\src\\test\\resources\\chromedriver-win64/chromedriver.exe");
		  
		  //ũ�� ����̹� �ν��Ͻ��� �ʱ�ȭ
		  driver = new ChromeDriver();	
		  
		  //�ش� �ּ� ����Ʈ�� �����Ѵ�.
		  driver.get("http://demo-store.seleniumacademy.com");
	  }
	  
	  // �׽�Ʈ ���� 
	  @Test
	  public void ActionMethod() {
		  
		  // ����̹��� ���� ������ Ÿ��Ʋ�̸��� Madison Island�� ������ Ȯ��
		  // ���н� �ܼ�â�� failures ���
		  Assert.assertEquals(driver.getTitle(),"Madison Island");
		  
		  
	  }

	  // �׽�Ʈ�� ���� �� ������̼��� ���� afterMethod() �޼ҵ� ����
	  @AfterMethod
	  public void afterMethod() {
		  driver.quit(); // ũ�� ����̹��� ���� ����Ʈ�� ���� ��Ų��.
	  }

}
