package basic;

import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver;  
  
public class JSDemo2 {  
    public static void main(String[] args) throws Exception {    
          
        WebDriver driver = new ChromeDriver();    
       
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
            
        driver.get("https://www.baidu.com/");    
         
        Thread.sleep(2000);  
          
        // 点击登录  
        driver.findElement(By.xpath("//*[@id='u1']/a[7]")).click();  
        driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__footerULoginBtn\"]")).click();
        Thread.sleep(500);  
        
        WebElement username = driver.findElement(By.id("TANGRAM__PSP_10__userName"));  
        username.sendKeys("abcdefg");  
        WebElement password = driver.findElement(By.id("TANGRAM__PSP_10__password"));  
        password.sendKeys("123456");
        // 创建一个JavascriptExecutor对象  
        JavascriptExecutor js= (JavascriptExecutor)driver;  
          
        // 设置颜色  
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",username);  
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",password);  
         
    }    
}  
