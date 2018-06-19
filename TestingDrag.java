
package Automation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.*;

public class TestingDrag {
public static void main(String args[])
{
	System.setProperty("webdriver.chrome.driver", "D:\\chetan\\eclipse-workspace\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://10.0.1.86/tatoc/basic/drag");
	
	WebElement From=driver.findElement(By.id("dragbox")); //from
	
    WebElement To=driver.findElement(By.id("dropbox")); // to
    
    //action function
    
    Actions builder = new Actions(driver);
    
    //drag and drop
    
    Action dragAndDrop = builder.clickAndHold(From).moveToElement(To).release(To).build();
	   dragAndDrop.perform();
	   
	   driver.findElement(By.linkText("Proceed")).click();
	     
}
}
