package com.qa.testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.AmazonPages;
import com.qa.pages.CitiBankPages;
import com.qa.pages.RediffPages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	WebDriver driver;
	AmazonPages AmazonOR;
	CitiBankPages CitiBankOR;
	RediffPages RediffOR;
	FileInputStream fileLoc;
	Properties prop;
	JavascriptExecutor Js;
	WebDriverWait expWait;
	
	
	@Parameters({"Browser","Url"})
	@BeforeClass
	public void setUp(String Browser,String Url) throws IOException {
		
		fileLoc = new FileInputStream("D:\\Capgemini\\Capgemini.TestAutomation.Selenium\\src\\test\\java\\com\\qa\\testdata\\Credential.properties");
		prop = new Properties();
		prop.load(fileLoc);
		
		if(Browser.equalsIgnoreCase("Chrome")) {
			//System.setProperty("webdriver.chrome.driver", "D:\\Tools\\SeleniumDrivers\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(Browser.equalsIgnoreCase("Edge")) {
			//System.setProperty("webdriver.edge.driver", "D:\\Tools\\SeleniumDrivers\\msedgedriver.exe");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
			
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		expWait = new WebDriverWait(driver,40);
		
		AmazonOR = new AmazonPages(driver);
		CitiBankOR = new CitiBankPages(driver);
		RediffOR = new RediffPages(driver);
		
		Js = (JavascriptExecutor)driver;
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	
	//tName : name of method annotated as @Test/ so that the screenshot should be saved with testname.png
	public void captureScreenshot(WebDriver driver, String tName) throws IOException {		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/Screenshots/"+tName+".png");		
		FileUtils.copyFile(source, target);
	}
	

}
