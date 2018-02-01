package basic;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
public class Mouse {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.baidu.com");
	WebElement search_setting=driver.findElement(By.linkText("设置"));
	Actions action = new Actions(driver);
	action.clickAndHold(search_setting).perform();//鼠标悬停
	//action.contextClick(news_text).perform();
}
}
