package epfox.test3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver(); 
        driver.get("https://123.sogou.com/");
        driver.findElement(By.id("engineKeyWord")).sendKeys(new  String[] {"hello"});
        driver.findElement(By.id("engineBtn")).click(); 
     //   driver.quit();
    }
}
