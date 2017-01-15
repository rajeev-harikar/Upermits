package com.upermits.scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import generics.Excel;

public class SuperTestNG {
	
	public WebDriver driver;
	
	@BeforeClass
	public void preCondition() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		String xl="./excelfiles/Config.xlsx";
		String sheet="Sheet1";
		String url = Excel.getCellValue(xl, sheet, 0, 1);
		driver.get(url);
	}
	
	@AfterClass
	public void postCondition()
	{
		driver.close();
	}

}
