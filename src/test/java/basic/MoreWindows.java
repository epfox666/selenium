package basic;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoreWindows  {

  public static void main(String[] arge) throws InterruptedException{

    WebDriver driver = new ChromeDriver();
    driver.get("https://www.baidu.com");

    //获得当前窗口句柄
    String search_handle = driver.getWindowHandle();
     System.out.println(search_handle);
    //打开百度注册窗口
    driver.findElement(By.linkText("登录")).click();
    Thread.sleep(3000);
    driver.findElement(By.linkText("立即注册")).click();

    //获得所有窗口句柄
    Set<String> handles = driver.getWindowHandles();

    //判断是否为注册窗口， 并操作注册窗口上的元素
    for(String handle : handles){
    	System.out.println(handle);
      if (handle.equals(search_handle)==false){
        //切换到注册页面
        driver.switchTo().window(handle);
        System.out.println("now register window!");
        Thread.sleep(2000);
        driver.findElement(By.name("userName")).clear();
        driver.findElement(By.name("userName")).sendKeys("user name");
        driver.findElement(By.name("phone")).clear();
        driver.findElement(By.name("phone")).sendKeys("phone number");
        //......
        Thread.sleep(2000);
        //关闭当前窗口
        driver.close();
      }
    }
    Thread.sleep(2000);

    driver.quit();
  }
}
