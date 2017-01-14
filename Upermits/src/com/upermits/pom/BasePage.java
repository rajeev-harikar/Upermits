package com.upermits.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	@FindBy(xpath="//button[@class='btn dropdown-toggle']")
	private WebElement togglebtn;
	
	@FindBy(xpath="(//a[@href='/users/sign_out'])[2]")
	private WebElement logoutlnk;
	
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logout()
	{
		togglebtn.click();
		logoutlnk.click();
		
	}

}
