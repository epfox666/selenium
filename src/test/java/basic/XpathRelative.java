package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathRelative {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://news.baidu.com");
	Thread.sleep(2000);
	//手写
	driver.findElement(By.xpath(".//*/label[@for='newstitle']/../input[@id='newstitle']")).click();
	//系统自带
	//driver.findElement(By.xpath(".//*[@id='sbox']/tbody/tr/td[2]/p/label[2]")).click();
	
	
	}
}