
package epfox.test3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
    public static void main(String[]args)
    {
        //System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe");
     //   System.setProperty("webdriver.chrome.driver", "D://webdriver//chromedriver.exe");        
        //System.setProperty("webdriver.ie.driver", "E://webdriver//IEDriverServer.64.exe");        
        //WebDriver driver=new InternetExplorerDriver(); //ie
        //WebDriver driver=new FireFoxDriver(); //firefox
        WebDriver driver=new ChromeDriver(); //chrome
        driver.get("https://www.baidu.com");
     //   driver.quit();
    }
}
