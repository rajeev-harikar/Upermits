package com.upermits.scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.upermits.pom.BasePage;
import com.upermits.pom.LoginPage;

import generics.Excel;
import utils.ScreenShotCapture;

public class Loginlogout extends SuperTestNG {
	
	@Test
	void loginLogout() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPage lp=new LoginPage(driver);
	    BasePage bp= new BasePage(driver);
		String xl="./excelfiles/Login.xlsx";
		String sheet="Sheet1";
		String usn = Excel.getCellValue(xl, sheet, 1, 0);
		String pwd = Excel.getCellValue(xl, sheet, 1, 1);
		lp.login(usn,pwd);
		Thread.sleep(2000);
		bp.logout();
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			ScreenShotCapture.captureScreenshot(driver, result.getName());
			
		}
	}

}
