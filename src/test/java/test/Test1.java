package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.baidu.com");
//	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[3]/a[1]")).click();
//	driver.findElement(By.xpath("//*[@id=\"u1\"]/a[text()=\"新闻\"]")).click();
	driver.findElement(By.id("kw")).sendKeys("selenium");
	driver.findElement(By.id("kw")).submit(); 
	Thread.sleep(2000);
//  driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div[3]/div[3]/h3/a")).click();
	driver.findElement(By.xpath("//*[@id=\"1\"]/h3/a")).click();
}
}
