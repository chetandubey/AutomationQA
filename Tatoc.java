package Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tatoc {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chetan\\eclipse-workspace\\chromedriver.exe");


	// Initialize browser
	WebDriver driver=new ChromeDriver();
    driver.get("http://10.0.1.86/tatoc/basic/grid/gate");
    driver.findElement(By.className("greenbox")).click();
    
    	// Close browser
	driver.close();
	}

	}

