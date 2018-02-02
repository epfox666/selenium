package test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeOut01 {
	public static void main(String[] args) throws Exception {  
        
        WebDriver driver = new ChromeDriver();  
     
        driver.manage().window().maximize();  
       
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
          
        driver.get("https://www.baidu.com");  
       
        Thread.sleep(200);
        
        String title = driver.getTitle();
        System.out.println(title);
        
        assert title =="百度一下，你就知道";
        
        // 或者这样写断言
        assert title.equals("百度一下，你就知道");
    }  
}
