package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectList {

  public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new ChromeDriver();
    driver.get("https://www.baidu.com");

    driver.findElement(By.linkText("设置")).click();
    driver.findElement(By.linkText("搜索设置")).click();
    Thread.sleep(2000);

    //<select>标签的下拉框选择
    WebElement el = driver.findElement(By.xpath("//select"));
    Select sel = new Select(el);
    sel.selectByValue("20");
    Thread.sleep(2000);

    driver.quit();
  }
}