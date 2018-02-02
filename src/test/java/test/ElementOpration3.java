package test;


import java.util.concurrent.TimeUnit;  
  
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver;  
  
public class ElementOpration3 {  
    public static void main(String[] args) throws Exception {    
             
        WebDriver driver = new ChromeDriver();    
       
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
            
        driver.get("https://www.baidu.com");    
         
        Thread.sleep(1000);  
         
        WebElement news_link = driver.findElement(By.linkText("新闻"));  
        news_link.click();  
        Thread.sleep(1000);  
         
        // 打印当前页面的源码  
        System.out.println(driver.getPageSource());  
                  
    }    
} 