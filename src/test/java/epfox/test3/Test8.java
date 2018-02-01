package epfox.test3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Test8 {
     public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.baidu.com");
	    Thread.sleep(1000);
		Actions action=new Actions(driver);
	//	action.doubleClick(driver.findElement(By.id("su"))).perform(); //双击
	//	action.contextClick(driver.findElement(By.id("su"))).perform();//右键
		WebElement news = driver.findElement(By.name("tj_trnews"));
		WebElement text = driver.findElement(By.id("kw"));
		action.dragAndDrop(news, text).perform();  //拖拽A到B
		action.release().perform();  //释放鼠标
	}
}
