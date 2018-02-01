package basic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class Browser2 {
  public static void main(String[] args)  throws InterruptedException{
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.baidu.com/");
	 //   System.out.printf("now accesss %s \n", driver.getCurrentUrl());
	 //   Thread.sleep(2000);
	    
	    driver.findElement(By.linkText("新闻")).click();  //通过linkText定位新闻
	  //  driver.findElement(By.name("tj_trnews")).click();//通过name定位新闻
	    System.out.printf("now accesss %s \n", driver.getCurrentUrl());
	    Thread.sleep(1000);
	    
	    driver.navigate().back();  //浏览器后退
	    System.out.printf("back to %s \n", driver.getCurrentUrl());
	    Thread.sleep(1000);
	    
	    driver.navigate().forward(); //浏览器前进
	    System.out.printf("forward to %s \n", driver.getCurrentUrl());
	    Thread.sleep(1000);

}
}
