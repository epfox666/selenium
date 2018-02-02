package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.wjx.cn/m/2792226.aspx/");
	List<WebElement> lists= driver.findElements(By.xpath("//*/div[@id='divQuestion']/fieldset/div/div/div/span/input/../a"));
	for(WebElement lista : lists) {
		  lista.click();
	}
}
}