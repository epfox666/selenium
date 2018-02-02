package basic;

import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.openqa.selenium.interactions.Actions;  
  
public class Mouse4 {  
  
    public static void main(String[] args) throws InterruptedException {  
           
        WebDriver driver = new ChromeDriver();  
          
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);  
                                          
        driver.get("https://www.baidu.com/duty/");  
          
        //定义第一段文字  
 //    WebElement Sting_Sected = driver.findElement(By.xpath("//*/div[@class='dwri_bule']/table/tbody/tr/td/p"));     
        WebElement Sting_Sected = driver.findElement(By.xpath("html/body/center/div/div[2]/table/tbody/tr/td/p"));           
        //定义第二段文字  
//      WebElement String_Second = driver.findElement(By.xpath("//*/div[@class='dwri_bule']/table/tbody/tr/td/ul/li[1]"));  
        WebElement String_Second = driver.findElement(By.xpath("html/body/center/div/div[2]/table/tbody/tr/td/ul/li[1]"));
        Actions action = new Actions(driver);  
        action.clickAndHold(Sting_Sected).moveToElement(String_Second).perform();  
        action.release();  
          
    }  
  
}  