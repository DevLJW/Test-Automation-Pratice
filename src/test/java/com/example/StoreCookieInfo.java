package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;



public class StoreCookieInfo {
    WebDriver driver;

    @BeforeMethod
    public void setup()  {
    	
    	 System.setProperty("webdriver.chrome.driver","C:\\eclipse\\qatest\\src\\test\\resources\\chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demo-store.seleniumacademy.com/customer/account/login/");
       
    
    }

    @Test
    public void storeCookies () {

        driver.findElement(By.id("email")).sendKeys("user@seleniumacademy.com");
        driver.findElement(By.id("pass")).sendKeys("tester");
        driver.findElement(By.id("send2")).submit();

        File dataFile = new File("./target/browser.data"); //경로 및 파일 설정
        
        try {
            dataFile.delete(); // 파일삭제
            dataFile.createNewFile(); // 파일생성
            
            //FileWriter와BufferedWriter를 같이 쓰는 이유는 FileWriter를 단독으로 쓰기보다 혼합하여 사용하는게 기록속도가 더 빠르다.
            FileWriter fos = new FileWriter(dataFile); // 텍스트 데이터를 파일에 저장할떄 사용
            BufferedWriter bos = new BufferedWriter(fos); // 텍스트 데이터를 파일에 저장할떄 사용
            
            
            for (Cookie ck : driver.manage().getCookies()) {
                bos.write((ck.getName() + ";" + ck.getValue() + ";" + ck.
                        getDomain()
                        + ";" + ck.getPath() + ";" + ck.getExpiry() + ";" + ck.
                        isSecure()));
                bos.newLine();
            }
            bos.flush(); //내부 버퍼의 내용을 파일에 작성한다. 호출하지 않으면 버퍼에만 남고 파일에는 쓰이지 않는 상황이 나올수도 있음
            bos.close(); //외부자원(스트림) 읽어 들이는데 메모리를 소모하여 close()를 호출하여 메모리를 확보해야한다.
            fos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
                }
    }

    @AfterMethod
    public void tearDown() {
    
    }
}