package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectList2 {

  public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);  
    
    driver.get("http://jqueryui.com/resources/demos/selectmenu/default.html");    
     
    Thread.sleep(2000);  
      
    // 点击选中速度这个下拉菜单  
    driver.findElement(By.xpath("//*[@id='speed-button']/span[2]")).click();  
    // 一个节点下所有的option选项  
    List<WebElement> list = driver.findElements(By.xpath("//*[@id='speed-menu']/li/div"));  
      
    for (WebElement ele : list){  
    
        if(ele.getAttribute("innerHTML").equals("Fast")){  
            ele.click();  
           break;  
       }  
    }  
      
    
  }  
} 