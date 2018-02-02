package basic;

import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.interactions.Actions;  
  
public class Mouse3 {  
    public static void main(String[] args) throws Exception {    
          
        WebDriver driver = new ChromeDriver();    
       
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
            
        driver.get("https://www.baidu.com/");    
         
        Thread.sleep(1000);  
          
        // 设置  
        WebElement inputbox = driver.findElement(By.id("kw"));  
        inputbox.sendKeys("selenium a");  
          
        // 自动补全其中一个选择项  
        WebElement auto_text = driver.findElement(By.xpath("//*[@id='form']/div/ul/li[@data-key='selenium api文档']"));  
          
        Actions action = new Actions(driver);  
        action.moveToElement(auto_text).click().perform();  
    }  
} 
