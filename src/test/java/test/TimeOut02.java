package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeOut02  {
	public static void main(String[] args) throws Exception {  
           
        WebDriver driver = new ChromeDriver();  
       
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
          
        driver.get("https://www.baidu.com");  
       
        Thread.sleep(2000);
        
        String title = driver.getTitle();
        System.out.println(title);
        
        WebElement news_link = driver.findElement(By.linkText("新闻"));
        news_link.click();
        Thread.sleep(1000);
        
        String current_url = driver.getCurrentUrl();
        System.out.println(current_url);
        assert current_url == "http://news.baidu.com";
        		
    }  
}


