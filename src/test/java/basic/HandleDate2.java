package basic;

import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver;  
  
public class HandleDate2 {  
    public static void main(String[] args) throws Exception {    
          
        WebDriver driver = new ChromeDriver();    
       
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);  
            
        driver.get("http://jqueryui.com/resources/demos/datepicker/default.html");    
         
        Thread.sleep(2000);  
          
        // 日期输入框  
        WebElement date_inputbox = driver.findElement(By.id("datepicker"));  
        date_inputbox.sendKeys("08/17/2017");  
          
        
      }  
}  