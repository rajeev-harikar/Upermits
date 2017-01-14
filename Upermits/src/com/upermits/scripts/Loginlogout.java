package com.upermits.scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.upermits.pom.LoginPage;

import generics.Excel;

public class Loginlogout extends SuperTestNG {
	
	@Test
	void loginLogot() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		String xl="./excelfiles/Login.xlsx";
		String sheet="Sheet1";
		String usn = Excel.getCellValue(xl, sheet, 1, 0);
		String pwd = Excel.getCellValue(xl, sheet, 1, 1);
		
		lp.login(usn,pwd);
	}

}
