package basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class API2 {
    public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.baidu.com");
		WebElement size = driver.findElement(By.id("kw"));//获得百度输入框的尺寸
	    System.out.println(size.getSize());
	    WebElement text = driver.findElement(By.id("cp"));//返回百度页面底部备案信息
	    System.out.println(text.getText());
	    WebElement ty = driver.findElement(By.id("kw"));//返回元素的属性值
	    System.out.println(ty.getAttribute("type"));
	    WebElement display = driver.findElement(By.id("kw"));//返回元素的结果是否可见
	    System.out.println(display.isDisplayed());

		driver.findElement(By.id("kw")).sendKeys("java");
		Thread.sleep(2000);
		driver.findElement(By.id("kw")).clear();
		driver.findElement(By.id("kw")).sendKeys("selenium");
		driver.findElement(By.id("kw")).submit();  //可以替代click
	//	driver.findElement(By.id("su")).click();
	    
        
	    

	}
}
