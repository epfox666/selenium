package epfox.test3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test2 {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();//打开浏览器 
        driver.get("https://123.sogou.com/");//打开搜狗官网
        driver.findElement(By.id("engineKeyWord")).sendKeys("hello");//点击搜索框输入hello
        driver.findElement(By.id("engineBtn")).click(); //点击搜索按钮（通过ID定位）
     //   driver.quit();
    }
}
