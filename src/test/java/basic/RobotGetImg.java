package basic;

import java.awt.Rectangle;  
import java.awt.Robot;  
import java.awt.Toolkit;  
import java.awt.image.BufferedImage;  
import java.io.File;  
import java.io.IOException;  
import java.util.concurrent.TimeUnit;  
  
import javax.imageio.ImageIO;  
  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
  
public class RobotGetImg {  
      
public static void main(String[] args) throws Exception {    
             
        WebDriver driver = new ChromeDriver();    
         
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
            
        driver.get("https://www.baidu.com");    
         
        Thread.sleep(1000);  
          
        // 调用截图方法  
        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));  
                     
            ImageIO.write(image, "png", new File("d:\\screenshot.png"));   
              
      }  
  
      
  
}