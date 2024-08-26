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
            FileReader fr = new FileReader(dataFile); // �ؽ�Ʈ �����͸� ������ ����Ѵ�.
            BufferedReader br = new BufferedReader(fr); // �ؽ�Ʈ �����͸� ������ ����Ѵ�.
            String line;
            while ((line = br.readLine()) != null) { // �ؽ�Ʈ ������ ����(null)�� ���� ����������
            	
            	//���ڿ��� ; ������ ��ū���·� �����ش�.(StringTokenizer)
                StringTokenizer str = new StringTokenizer(line, ";");
                while (str.hasMoreTokens()) { // ��ū�� ������� true ��ȯ ��ū�� ������ true true�� ���� ���ѹݺ� 	
                							  // ��ū���� ���Ǹ� false�� �ȴ�. 4����ū �Ʒ� �ٻ���	
                	
                    String name = str.nextToken(); // ������ū �ҷ�����
                    String value = str.nextToken();// ������ū �ҷ����� 
                    String domain = str.nextToken(); // ������ū �ҷ�����
                    String path = str.nextToken(); // ������ū �ҷ�����
                    
                    Date expiry = null;
                    String dt;
                    if (!(dt = str.nextToken()).equals("null")) { // ������ū ���� null�� �����ϰ����� �ʴٸ�
                        SimpleDateFormat formatter =
                        new SimpleDateFormat("E MMM d HH:mm:ss z yyyy");
                        expiry = formatter.parse(dt);
                    }
                    	
                    	// ��ū �������� ������ true ������ false
	                    boolean isSecure = new Boolean(str.nextToken()).booleanValue();
	                    
	                    // ��� �� ����
                        Cookie ck = new Cookie(name, value, domain, path, expiry, isSecure);
                        
                        // ��Ű������ ����̹��� ���� ������ ���ǿ� �߰��Ѵ�.
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