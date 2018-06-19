package Automation;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class FrameDungeon {

	public static void main(String[] args)	{
		System.setProperty("webdriver.chrome.driver","D:\\chetan\\eclipse-workspace\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://10.0.1.86/tatoc/basic/frame/dungeon");

driver.switchTo().frame("main");

String original = driver.findElement(By.id("answer")).getAttribute("class");

boolean condn= true;
while(condn)
{
	driver.switchTo().frame("child");
String newans = driver.findElement(By.id("answer")).getAttribute("class");
driver.switchTo().parentFrame();

if(original.equals(newans))
{
	condn = false;
}	
else
{
	driver.findElement(By.linkText("Repaint Box 2")).click();
}

}
driver.findElement(By.linkText("Proceed")).click();


driver.close();
	}
}
