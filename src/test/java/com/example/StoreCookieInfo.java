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

        File dataFile = new File("./target/browser.data"); //��� �� ���� ����
        
        try {
            dataFile.delete(); // ���ϻ���
            dataFile.createNewFile(); // ���ϻ���
            
            //FileWriter��BufferedWriter�� ���� ���� ������ FileWriter�� �ܵ����� ���⺸�� ȥ���Ͽ� ����ϴ°� ��ϼӵ��� �� ������.
            FileWriter fos = new FileWriter(dataFile); // �ؽ�Ʈ �����͸� ���Ͽ� �����ҋ� ���
            BufferedWriter bos = new BufferedWriter(fos); // �ؽ�Ʈ �����͸� ���Ͽ� �����ҋ� ���
            
            
            for (Cookie ck : driver.manage().getCookies()) {
                bos.write((ck.getName() + ";" + ck.getValue() + ";" + ck.
                        getDomain()
                        + ";" + ck.getPath() + ";" + ck.getExpiry() + ";" + ck.
                        isSecure()));
                bos.newLine();
            }
            bos.flush(); //���� ������ ������ ���Ͽ� �ۼ��Ѵ�. ȣ������ ������ ���ۿ��� ���� ���Ͽ��� ������ �ʴ� ��Ȳ�� ���ü��� ����
            bos.close(); //�ܺ��ڿ�(��Ʈ��) �о� ���̴µ� �޸𸮸� �Ҹ��Ͽ� close()�� ȣ���Ͽ� �޸𸮸� Ȯ���ؾ��Ѵ�.
            fos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
                }
    }

    @AfterMethod
    public void tearDown() {
    
    }
}