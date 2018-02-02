package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://news.baidu.com");
	List<WebElement> lists= driver.findElements(By.xpath(".//*[@id='sbox']/tbody/tr/td[2]/p/label"));
	for(WebElement lista : lists) {
		  lista.click();
	}
}
}
