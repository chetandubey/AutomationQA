package com.qait.tap.hristest.AutomationQAmaven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import com.qait.tap.hristest.*;


public class New {
	WebDriver driver;
   // String oldcolor, repaintcolor;


    
    
    public New(WebDriver driver) {
    	this.driver = driver;
    	// TODO Auto-generated constructor stub
}



	public void BasicCourse()
{ 
	driver.findElement(By.linkText("Basic Course")).click();
    
}


public void Greenbox()
{
	driver.findElement(By.className("greenbox")).click();
}

public boolean ColorChange()
{
	//WebDriverWait wait = new WebDriverWait(driver, 10);
//	  WebElement pFrame= driver.findElement(By.id("main"));

		driver.switchTo().frame("main");
 String oldcolor = driver.findElement(By.id("answer")).getAttribute("class");
boolean cond = true;
while (cond)
{
	driver.switchTo().frame("child");
String	repaintcolor = driver.findElement(By.id("answer")).getAttribute("class");
	  driver.switchTo().parentFrame();

	if(oldcolor.equals(repaintcolor))
	{
		cond = false;
	}
	else
		driver.findElement(By.linkText("Repaint Box 2")).click();
	
}
driver.findElement(By.linkText("Proceed")).click();
return true;

}

public void Draging()
{
WebElement From=driver.findElement(By.id("dragbox")); //from
	
    WebElement To=driver.findElement(By.id("dropbox")); // to
    
    //action function
    
    Actions builder = new Actions(driver);
    
    //drag and drop
    
    Action dragAndDrop = builder.clickAndHold(From).moveToElement(To).release(To).build();
	   dragAndDrop.perform();
	   
	   driver.findElement(By.linkText("Proceed")).click();
	
}
public void PopUp()
{
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

}
}