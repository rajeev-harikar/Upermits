package com.upermits.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	
	@FindBy(xpath="(//input[@id='user_email'])[2]")
	 private WebElement emailfld;
	
	@FindBy(xpath="(//input[@name='user[password]'])[2]")
	 private WebElement pwdfld;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
   private WebElement loginbtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login(String emailid, String pwd) throws InterruptedException
	{
		emailfld.sendKeys(emailid);
		pwdfld.sendKeys(pwd);
		loginbtn.click();
		Thread.sleep(1000);
	    Assert.assertEquals(" Pismo beach ", " Pismo beach ");
		
	}




}
