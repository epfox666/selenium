package basic;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
public class Keyboard {
  public static void main(String[] args) throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.baidu.com");
	  WebElement input = driver.findElement(By.id("kw"));
	  input.sendKeys("seleniumm");
	  Thread.sleep(2000);
	  
	  input.sendKeys(Keys.BACK_SPACE); //删除最后一个字符
	  Thread.sleep(2000);
	  
	  input.sendKeys(Keys.SPACE); //空格
	    input.sendKeys("教程");
	    Thread.sleep(2000);
	  
	    input.sendKeys(Keys.CONTROL,"a");//ctrl+a
	    Thread.sleep(2000);  
	    
	    input.sendKeys(Keys.CONTROL,"x");//ctrl+x
	    Thread.sleep(2000);
	    
	    input.sendKeys(Keys.CONTROL,"v");//ctrl+v
	    Thread.sleep(2000);
	    
	    input.sendKeys(Keys.ENTER);//回车
	    Thread.sleep(2000);
}
}
