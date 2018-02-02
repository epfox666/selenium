package test;

import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver;  
  
public class IsDispayed {  
    public static void main(String[] args) throws Exception {    
          
        WebDriver driver = new ChromeDriver();    
       
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
            
        driver.get("https://www.baidu.com/");    
         
        Thread.sleep(1000);  
          
        // 点击登录  
        driver.findElement(By.linkText("登录")).click(); 
        driver.findElement(By.id("TANGRAM__PSP_10__footerULoginBtn")).click();
        // 登录中输入用户名和密码  
        driver.findElement(By.id("TANGRAM__PSP_10__userName")).sendKeys("abc");  
        driver.findElement(By.id("TANGRAM__PSP_10__password")).sendKeys("123456");  
        driver.findElement(By.id("TANGRAM__PSP_10__submit")).click();  
        Thread.sleep(2000);  
        // 方法一  
   //     WebElement error_message = driver.findElement(By.xpath("//*[@id='TANGRAM__PSP_10__error' and text()='请输入验证码']"));  
   //     assert error_message.isDisplayed();  
        // 方法二  
        String error_message = driver.findElement(By.xpath("//*[@id='TANGRAM__PSP_10__error']")).getText();  
        assert(error_message == "请输入验证码");      
    }    
}  