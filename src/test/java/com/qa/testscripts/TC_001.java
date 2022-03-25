package com.qa.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TC_001 {

	public static void main(String[] args) throws InterruptedException {
	
//		System.setProperty("webdriver.edge.driver", "D:\\Tools\\SeleniumDrivers\\msedgedriver.exe");
//		WebDriver eDriver = new EdgeDriver();
		
		//Invoke the chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Tools\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://www.amazon.in/"); // Load the URL on the browser instance opened in the previous line
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		
		//driver.switchTo().window(wind id);
		//driver.switchTo().frame(id /name/id);
		//driver.switchTo().alert();
		Thread.sleep(5000);
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		
		System.out.println(driver.getCurrentUrl()); // Current URL at the run session in String
		
		System.out.println(driver.getTitle()); // fetch the title of the webpage in String
		
		System.out.println(driver.getWindowHandle()); // Window ID of the browser, String
		
		//driver.getWindowHandles(); // Get the collection of window id that are opened in the browser instance.
		
		 Thread.sleep(5000);
	//	System.out.println(driver.getPageSource()); // fetch the HTML code & Print
		
		//driver.findElement(Locators); // return WebElement present on the page matching the locator
		
		// driver.findElements(Locators); // Group of elements
		
		
		driver.close(); // close the current browser, use this when ther single browser instance
		driver.quit(); // close the multiple browser instance / pop up etc.

	}

}
