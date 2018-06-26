package com.qait.tap.hristest.AutomationQAmaven;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
import com.qait.tap.hristest.AutomationQAmaven.New;
import org.testng.annotations.BeforeClass;
//import org.testng.Assert;
import org.testng.annotations.AfterClass;
//import org.testng.asserts.*;

public class NewTest
{
 
	WebDriver driver;	
	  New NewObject; 

	
	@Test(priority = 0)
    public void LaunchBrowser() {
		NewObject.BasicCourse();
//Assert.assertTrue(NewObject.BasicCourse());
}
	
	@Test(priority = 1)
	public void CheckGreenBox()
	{
		NewObject.Greenbox();
		
		
	}
	
	@Test(priority = 2)
	public void  ColorChangeTest() 
	{
		NewObject.ColorChange();
		
	}
	
	@Test(priority = 3)
public void DragingTest() {
		NewObject.Draging();
	}
	
	@Test(priority = 4)
	public void TestPopUp() {
			NewObject.PopUp();
		}
		
	
  @BeforeClass
  public void beforeClass() 
  {
		System.setProperty("webdriver.chrome.driver","D:\\chetan\\eclipse-workspace\\chromedriver.exe");
       driver = new ChromeDriver(); 
      driver.get("http://10.0.1.86/tatoc");
      NewObject = new New(driver);
    }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
