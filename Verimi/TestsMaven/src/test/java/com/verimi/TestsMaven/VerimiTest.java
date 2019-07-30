package com.verimi.TestsMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class VerimiTest {
	
	public WebDriver driver;
	public String geckodriverPath="C:\\geckodriver.exe";
	public String email="nadia.monayongmedjo@gmail.com";
	public String password="Test_123";
	  @Test
	  public void main() throws InterruptedException, AWTException {
		  
		  //Store the current window handle
		  String firstWindow = driver.getWindowHandle();		  
		  
		  //Open the Login page in a new window 
		  WebElement link = driver.findElement(By.linkText("Login"));
		  Actions newwin = new Actions(driver);
		  newwin.keyDown(Keys.SHIFT).click(link).keyUp(Keys.SHIFT).build().perform();
		  
		  // Switch to new window
		  for(String currentWindows : driver.getWindowHandles()){
			  if(!currentWindows.equals(firstWindow))
	          {
				  driver.switchTo().window(currentWindows);
	          }
		  }
		  
	      // Enter email address in correct input 
	      driver.findElement(By.id("emailField")).sendKeys(email);
	 
	      // Enter password in correct input	 	 
	      driver.findElement(By.id("passwordField")).sendKeys(password);
	      
	      // Click outside the password input to click on the Login button 
	      driver.findElement(By.id("buttonContainer")).click();
	      driver.findElement(By.id("loginButton")).click();
	      
	      //Assert that login was successful by searching for the Logout button
	      Assert.assertNotSame(driver.findElement(By.id("header-logout")),null);
	      
	  }
	  
  @BeforeMethod
  public void beforeMethod() {
	  //Create a new instance of the Firefox driver
	  System.setProperty("webdriver.gecko.driver", geckodriverPath);	  
      driver = new FirefoxDriver();
 
      //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.manage().window().maximize();
      
      //Launch Verimi Website
      driver.get("https://verimi.de/en");
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	   // Close the driver
	  Thread.sleep(6000);
	  driver.quit();
  }

}
