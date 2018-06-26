package com.qait.tap.hristest.AutomationQAmaven;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Hris {
	
	WebDriver driver;
 


	public  Hris(WebDriver driver) {
		this.driver=driver;
	}
	 public WebElement getPasswordEntry(){
	        return this.driver.findElement(By.id("txtPassword"));
	    }
	 
	 public WebElement getUserNameEntry() {
		 return this.driver.findElement(By.id("txtUserName"));
	 }
	 public WebElement getErrorMessage()
	 {
	        return this.driver.findElement(By.cssSelector(".alert-error"));
	 }
	 
	 
	 
	 

		public String Login_with_Incorrect_Crediantials(String UserName, String Password)
		{
	              HrisLogin(UserName, Password);
	              return getErrorMessage().getText();
		}

	 
		
		public Boolean isPasswordEntryAnnotated()
		{
			        return getPasswordEntry().getAttribute("style").contains("red");
		 }

		
	 
	public void HrisLogin(String UserName, String Password)
 {
		// username
	 getUserNameEntry().clear();
	 getUserNameEntry().sendKeys(UserName);
	 
	 // password
	 getPasswordEntry().clear();
	 getPasswordEntry().sendKeys(Password);
     getPasswordEntry().submit();
 }
}
