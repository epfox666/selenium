package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
   public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.baidu.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"u_sp\"]/a[1]"));
}
}
