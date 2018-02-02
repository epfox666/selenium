package basic;

import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver;  
  
public class Alert {  
    public static void main(String[] args) throws Exception {    
          
        WebDriver driver = new ChromeDriver();    
       
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
            
        driver.get("http://news.cyol.com/node_60799.htm");    
         
        Thread.sleep(2000);  
          
        // 处理alert框  
        System.out.println(driver.switchTo().alert().getText());  
       driver.switchTo().alert().accept();  
         
    }    
}  