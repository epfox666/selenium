package basic;

import java.util.Set;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Cookie;


public class CookieDemo {

  public static void main(String[] args){

    WebDriver driver = new ChromeDriver();
    driver.get("https://www.baidu.com");

    Cookie c1 = new Cookie("name", "key-aaaaaaa");
    Cookie c2 = new Cookie("value", "value-bbbbbb");
    driver.manage().addCookie(c1);
    driver.manage().addCookie(c2);

    //获得 cookie
    Set<Cookie> coo = driver.manage().getCookies();
    System.out.println(coo);

    //删除所有 cookie
    //driver.manage().deleteAllCookies();

    driver.quit();
  }
}
