package basic;

import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver;  
  
public class HandleDate {  
    public static void main(String[] args) throws Exception {    
          
        WebDriver driver = new ChromeDriver();    
       
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);  
            
        driver.get("http://jqueryui.com/resources/demos/datepicker/default.html");    
         
        Thread.sleep(2000);  
          
        // 日期输入框  
        WebElement date_inputbox = driver.findElement(By.id("datepicker"));  
          
        //鼠标点击日期输入框  
        date_inputbox.click();  
        // 点击下一个月  
     //   driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[@data-handler='next']")).click();  
        driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
        // 点击17日，xpath定义第三行第五个元素，可能每个月排序不一样，所以不一定点击的就是17日  
   //     driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[5]/a")).click();  
        driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[7]/a")).click();
      }  
}  
