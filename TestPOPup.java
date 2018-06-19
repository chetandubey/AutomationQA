package Automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TestPOPup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chetan\\eclipse-workspace\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
	driver.get("http://10.0.1.86/tatoc/basic/windows");
	String parentHandle = driver.getWindowHandle(); // get the current window handle
   
	driver.findElement(By.linkText("Launch Popup Window")).click();
    
	for (String winHandle : driver.getWindowHandles()) { 
      
    	driver.switchTo().window(winHandle);
    //driver.findElement(By.linkText("proceed")).click();
	}
     driver.findElement(By.id("name")).sendKeys("chetan");
     
     driver.findElement(By.id("submit")).click();	
          
     driver.switchTo().window(parentHandle);         // switch back to the original window

     driver.findElement(By.linkText("Proceed")).click();
     

     
     driver.close();
}
	}
