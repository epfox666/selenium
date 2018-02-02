package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;  
  
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver;  
  
public class RadioButton {  
    public static void main(String[] args) throws Exception {    
             
        WebDriver driver = new ChromeDriver();    
       
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
            
        driver.get("http://news.baidu.com");    
         
        Thread.sleep(1000);  
          
        // 把单选按钮放在一个list里面  
          List<WebElement> search_type = driver.findElements(By.xpath("//*/p[@class='search-radios']/input")); 
        for(WebElement ele : search_type){  
            ele.click();  
            Thread.sleep(1000);  
        }  
          
    }    
}  