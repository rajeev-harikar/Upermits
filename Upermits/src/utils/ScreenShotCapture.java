package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ScreenShotCapture {
	
	public static void captureScreenshot(WebDriver driver, String screenshotname) throws IOException
	{
		EventFiringWebDriver e=new EventFiringWebDriver(driver);
		File src=e.getScreenshotAs(OutputType.FILE);
		File dest= new File("./screenshots/"+screenshotname+".png");
		FileUtils.copyFile(src, dest);
		
	}

}
