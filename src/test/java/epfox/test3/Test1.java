
package epfox.test3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[]args)
    {
        System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe");
    	//设置chrome浏览器的驱动（在chrome安装包目录下设置），如果配置完环境变量不需要此步骤（设置环境变量需要重启电脑）
        System.setProperty("webdriver.chrome.driver", "D://webdriver//chromedriver.exe"); //也可以在自定义目录下设置 
        System.setProperty("webdriver.ie.driver", "E://webdriver//IEDriverServer.64.exe");//设置IE驱动
        //WebDriver driver=new InternetExplorerDriver(); //ie
        //WebDriver driver=new FireFoxDriver(); //firefox
       // WebDriver driver=new ChromeDriver(); //chrome
      //  driver.get("https://www.baidu.com");
     //   driver.quit();
    }
}
