package com.example;


import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;



public class LoadCookieInfo {
    WebDriver driver;

    @BeforeMethod
    public void setup() throws IOException {
    	 System.setProperty("webdriver.chrome.driver","C:\\eclipse\\qatest\\src\\test\\resources\\chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demo-store.seleniumacademy.com");

    }

    @Test
    public void loadCookies() {
        try {
            File dataFile = new File("./target/browser.data");
            FileReader fr = new FileReader(dataFile); // 텍스트 데이터를 읽을때 사용한다.
            BufferedReader br = new BufferedReader(fr); // 텍스트 데이터를 읽을때 사용한다.
            String line;
            while ((line = br.readLine()) != null) { // 텍스트 파일의 끝줄(null)과 같지 않을때까지
            	
            	//문자열을 ; 단위로 토큰형태로 끊어준다.(StringTokenizer)
                StringTokenizer str = new StringTokenizer(line, ";");
                while (str.hasMoreTokens()) { // 토큰이 있을경우 true 반환 토큰이 있을때 true true일 동안 무한반복 	
                							  // 토큰들이 사용되면 false가 된다. 4개토큰 아래 다사용됨	
                	
                    String name = str.nextToken(); // 다음토큰 불러오기
                    String value = str.nextToken();// 다음토큰 불러오기 
                    String domain = str.nextToken(); // 다음토큰 불러오기
                    String path = str.nextToken(); // 다음토큰 불러오기
                    
                    Date expiry = null;
                    String dt;
                    if (!(dt = str.nextToken()).equals("null")) { // 다음토큰 값이 null을 포함하고있지 않다면
                        SimpleDateFormat formatter =
                        new SimpleDateFormat("E MMM d HH:mm:ss z yyyy");
                        expiry = formatter.parse(dt);
                    }
                    	
                    	// 토큰 다음값이 있으면 true 없으면 false
	                    boolean isSecure = new Boolean(str.nextToken()).booleanValue();
	                    
	                    // 쿠기 값 설정
                        Cookie ck = new Cookie(name, value, domain, path, expiry, isSecure);
                        
                        // 쿠키정보를 드라이버를 통해 브라우저 세션에 추가한다.
                        driver.manage().addCookie(ck);
                }
            }
            
            driver.get("http://demo-store.seleniumacademy.com/customer/account/index/");

         
      

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @AfterMethod
    public void tearDown() {
       
    }
}