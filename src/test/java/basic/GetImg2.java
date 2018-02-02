package basic;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;

public class GetImg2 {

  public static void main(String[] args) throws IOException{

    WebDriver driver = new ChromeDriver();
    driver.get("https://www.baidu.com");

    File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(srcFile,new File("d:\\screenshot1.png"));

    driver.quit();
  }
}
