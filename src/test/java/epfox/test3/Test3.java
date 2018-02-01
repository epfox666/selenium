package epfox.test3;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test3 {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver= new ChromeDriver();
   // driver.manage().window().maximize(); //最大化打开
   // driver.manage().window().setSize(new Dimension(400, 400)); //自定义大小打开
    driver.get("https://www.baidu.com");
    driver.findElement(By.id("kw")).sendKeys(new  String[] {"hello"});
    Thread.sleep(2000);
    driver.navigate().refresh();  //刷新页面
  //  driver.quit();
  }
}