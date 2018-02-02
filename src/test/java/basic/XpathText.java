package basic;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathText {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("localhost:81/wordpress/");

	driver.findElement(By.xpath(".//*/h1/a[text()='epfox']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*/h1/a[text()='epfox']")).click();	
	driver.findElement(By.xpath(".//*[@class='menu-scroll-down']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*/li/a[text()='登录']")).click();
	}
}