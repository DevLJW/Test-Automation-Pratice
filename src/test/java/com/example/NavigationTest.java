package com.example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NavigationTest {
	WebDriver driver; 	// 셀레늄 웹 드라이버

	  // 테스트를 실행하기 전 실행	
	  @BeforeMethod
	  public void beforeMethod1() {
		  
		  // 크롬드라이버 사용경로 설정
		  System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\qatest\\src\\test\\resources\\chromedriver-win64/chromedriver.exe");
		  
		  //크롬 드라이버 인스턴스로 초기화
		  driver = new ChromeDriver();	
		  
		  //해당 주소 사이트를 오픈한다.
		  driver.get("http://demo-store.seleniumacademy.com");
	  }
	  
	  // 테스트 실행 
	  @Test
	  public void ActionMethod() {
		  
		  // 드라이버를 통해 가져온 타이틀이름과 Madison Island가 같은지 확인
		  // 실패시 콘솔창에 failures 출력
		  Assert.assertEquals(driver.getTitle(),"Madison Island");
		  
		  
	  }

	  // 테스트가 끝난 후 어노테이션을 통해 afterMethod() 메소드 실행
	  @AfterMethod
	  public void afterMethod() {
		  driver.quit(); // 크롬 드라이버를 통해 사이트를 종료 시킨다.
	  }

}
