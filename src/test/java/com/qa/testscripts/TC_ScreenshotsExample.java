package com.qa.testscripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class TC_ScreenshotsExample extends TestBase{
	
	@Test(priority=1)
	public void elementScreenshot() throws IOException {
		File src = AmazonOR.getAmazonLogo().getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"/Screenshots/" + "AmazonLogo.png";
		File target = new File(path);
		FileUtils.copyFile(src, target);		
	}
	
	@Test(priority=2)
	public void driverScreenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/Screenshots/"+"Driver.png");		
		FileUtils.copyFile(source, target);		
	}
	

}
