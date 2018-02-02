package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContains {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.jd.com");
    //自己写的xpath
	driver.findElement(By.xpath(".//*/a[contains(@href,'diannao')]")).click();
	//firepath生成的xpath
	driver.findElement(By.xpath(".//*[@id='J_cate']/ul/li[3]/a[1]")).click();
	}
}