package epfox.test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

  public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new ChromeDriver();
    driver.get("https://www.baidu.com/");

    WebElement search_text = driver.findElement(By.id("kw"));
    WebElement search_button = driver.findElement(By.id("su"));

    search_text.sendKeys("Java");
    Thread.sleep(2000);
    search_text.clear();
    search_text.sendKeys("Selenium");
    search_button.click();

   // driver.quit();
  }
}