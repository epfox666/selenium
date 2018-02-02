package basic;

import java.util.concurrent.TimeUnit;  
  
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver;  
  
public class Iframe2 {  
    public static void main(String[] args) throws Exception {    
             
        WebDriver driver = new ChromeDriver();    
         
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
            
        driver.get("http://data.pharmacodia.com/web/homePage/index?ns=1&ts=1&str=YWSJ");    
        
        Thread.sleep(1000);  
        // 切换到某一个frame内部  
        driver.switchTo().frame("rightMain");  
        // 化学药 这个分类点击  
        WebElement drug_type_huaxue = driver.findElement(By.xpath("//*/span[@title='化学药']"));  
        drug_type_huaxue.click();  
        Thread.sleep(1000);  
        // 切换到Top Windows，点击权限提示上面的去登录按钮。  
        driver.switchTo().defaultContent();  
          
        driver.findElement(By.xpath("//*[@id='noLoginAlert']/div/button")).click();  
          
    }    
}  