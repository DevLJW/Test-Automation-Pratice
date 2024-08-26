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

	WebDriver driver; 	// 셀레늄 웹 드라이버
	
  @BeforeMethod
  public void beforeMethod() {
	  
	  // 크롬드라이버 사용경로 설정
	  System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\qatest\\src\\test\\resources\\chromedriver-win64/chromedriver.exe");
	  
	  //크롬 드라이버 인스턴스로 초기화
	  driver = new ChromeDriver();	
	  
	  //해당 주소 사이트를 오픈한다.
	  driver.get("http://guidebook.seleniumacademy.com/Window.html");
	  
	  
	  
  }

  @Test
  public void handleWindow() {
	  
	  // 현재 열린 윈도우 창의 식별자를 반환한다. --> beforeMethod() 메소드에서 get으로 오픈한 사이트
	  String firstWindow = driver.getWindowHandle();
	  System.out.println("First Window Handle is :" + firstWindow);
	  
	  WebElement link = driver.findElement(By.linkText("Google Search"));
	  
	  //링크를 클릭하여 구글 윈도우창 열기(2번째)
	  link.click();
	  
	
	  
	  // 현재 열린 창들의 식별값을 가져옴(1,2)
	  Object[] windowHandles=driver.getWindowHandles().toArray();
	  
	   
	  System.out.println("윈도우 식별 값" + driver.getWindowHandles());
	  System.out.println("윈도우 개수" + driver.getWindowHandles().size());
	
	  // 첫번째배열(0) --> 첫번째 열린창 주소값에 접근하여 첫번쨰 창으로 포커싱 변경
	  driver.switchTo().window((String) windowHandles[0]);
	  


	 
	  
	  
	  
  }
  
  
  
  @AfterMethod
  public void tearDown() {
	  

	  
	  
	  
  }

}
