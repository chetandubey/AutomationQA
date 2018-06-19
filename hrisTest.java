package Automation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class hrisTest {
	WebDriver driver;
	public void launch_Browser()
	{
System.setProperty("webdriver.chrome.driver", "D:\\chetan\\eclipse-workspace\\chromedriver.exe");
	
	 driver = new ChromeDriver();
	 driver.get("https://www.bing.com");
driver.findElement(By.id("sb_form_q")).sendKeys("microsoft");;
driver.findElement(By.id("sb_form_go")).click();
}
public void close_Browser()
{
	driver.quit();
}

public static void main(String args[])
{
	hrisTest hr = new hrisTest();
	hr.launch_Browser();
	hr.close_Browser();
}
}

