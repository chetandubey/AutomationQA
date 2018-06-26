package com.qait.tap.hristest.AutomationQAmaven;


import com.qait.tap.hristest.AutomationQAmaven.Hris;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
//import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.annotations.*;



public class NewhrisTest {

	WebDriver driver;
	Hris Hobj;

	
@Test(priority=2)
  public void HrisLoginTest() {
		Hobj.HrisLogin("chetandubey","*******");
  }
	
	@Test(priority=1)
	 public void attempt_Login_With_Incorrect_Password_Should_Render_Error_Message(){

	Assert.assertTrue(Hobj.Login_with_Incorrect_Crediantials("INVALID_USERN", "INVALUD_PASSWEOR").contains("Invalid Login"));
	
	}
	@Test(priority=1)
	public void attempt_login_with_blank_password()
	{
		Hobj.HrisLogin("chetandubey", "");
        
		Assert.assertTrue(Hobj.isPasswordEntryAnnotated());	
		
	}
	
	
	
	
  @BeforeClass
  public void LaunchBrowser() {
	  
		System.setProperty("webdriver.chrome.driver","D:\\chetan\\eclipse-workspace\\chromedriver.exe");

	  driver = new ChromeDriver();
	  driver.get("https://hris.qainfotech.com");
	  driver.manage().window().maximize();
	  Hobj = new Hris(driver);
  }

  @AfterClass
  public void CloseBrowser() throws InterruptedException {
	    // driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
      Thread.sleep(10000);
	  driver.quit();  }

}
