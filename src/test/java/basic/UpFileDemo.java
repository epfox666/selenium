package basic;

//import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class UpFileDemo {

  public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new ChromeDriver();
 //   File file = new File("./HTMLFile/upfile.html");
 //   String filePath = file.getAbsolutePath();
 //   driver.get(filePath);
    driver.get("file:///D:/eclipse-workspace/selenium/HTMLFile/upfile.html");
    //定位上传按钮， 添加本地文件
    driver.findElement(By.name("file")).sendKeys("D:\\upload_file.txt");
    Thread.sleep(5000);

    driver.quit();
  }
}
