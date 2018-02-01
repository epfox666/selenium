package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertDemo {

  public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new ChromeDriver();
    driver.get("https://www.baidu.com");

    driver.findElement(By.linkText("设置")).click();
    driver.findElement(By.linkText("搜索设置")).click();
    Thread.sleep(2000);

    //保存设置
    driver.findElement(By.className("prefpanelgo")).click();

    //接收弹窗
    Thread.sleep(2000);
    driver.switchTo().alert().accept();
    Thread.sleep(2000);

    driver.quit();
  }
}
