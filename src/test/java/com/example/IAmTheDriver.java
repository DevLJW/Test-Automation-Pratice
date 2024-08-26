package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class IAmTheDriver {
	 public static void main(String... args){

		 System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\qatest\\src\\test\\resources\\chromedriver-win64/chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

	        try {
	            EventFiringWebDriver eventFiringDriver = new EventFiringWebDriver(driver);
	            IAmTheEventListener eventListener = new IAmTheEventListener();
	            eventFiringDriver.register(eventListener);
	            eventFiringDriver.get("https://www.naver.com/");
//	            eventFiringDriver.get("http://www.facebook.com");
//	            eventFiringDriver.navigate().back();
	        } finally {

	        }
	    }
}
