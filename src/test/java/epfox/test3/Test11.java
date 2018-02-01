package epfox.test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;


public class Test11 {

  public static void main(String[]args) throws InterruptedException {

    WebDriver driver = new ChromeDriver();
    driver.get("https://www.baidu.com");

    //显式等待， 针对某个元素等待
    WebDriverWait wait = new WebDriverWait(driver,10,1);

    wait.until(new ExpectedCondition<WebElement>(){      
      public WebElement apply(WebDriver text) {
            return text.findElement(By.id("kw"));
          }
    }).sendKeys("selenium");
    
    driver.findElement(By.id("su")).click();
    Thread.sleep(2000);

    driver.quit();
  }
}
