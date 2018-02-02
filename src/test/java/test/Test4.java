package test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
    public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.baidu.com");
		driver.findElement(By.id("kw")).sendKeys("selenium");
		driver.findElement(By.id("kw")).submit();
		List<WebElement> links = driver.findElements(By.xpath(".//div/h3/a"));
		for(WebElement link : links) {
			System.out.println(link.getText());
		}
	}
}