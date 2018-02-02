package test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.baidu.com");
	String search_handle=driver.getWindowHandle();
	driver.findElement(By.partialLinkText("主页")).click();
	Set<String> handles = driver.getWindowHandles();
	for(String handle : handles) {
		if(handle.equals(search_handle)==false) {
		driver.switchTo().window(handle);
		driver.findElement(By.linkText("百度首页")).click();
		Thread.sleep(2000);
		driver.close();
		}
	}
	Thread.sleep(2000);
	driver.quit();
}
}
