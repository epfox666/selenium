package test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
    public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.baidu.com");
		driver.findElement(By.linkText("新闻")).click();
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> links = driver.findElements(By.xpath(".//*[@id='pane-news']/ul[1]/li/a"));
		for(WebElement link : links) {
			System.out.println(link.getText());
		}
	}
}
