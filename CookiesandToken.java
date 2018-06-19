package Automation;


import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesandToken {
 public static void main(String args[])
 {
		System.setProperty("webdriver.chrome.driver","D:\\chetan\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://10.0.1.86/tatoc/basic/cookie");
		driver.findElement(By.linkText("Generate Token")).click();
		
		// storing the token
		String Token = driver.findElement(By.id("Token")).getText();
		System.out.println(Token);
		
	       String[] splitStr = Token.split("\\s+");
	       System.out.println(splitStr[1]);
	       Cookie name = new Cookie("Token",splitStr[1]);
        driver.manage().addCookie(name);
        
        driver.findElement(By.linkText("Proceed")).click();

 }
}
