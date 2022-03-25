package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_DatePicker {
	
	@Test
	public void clearTrip() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Tools\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/flights");
		WebElement ele = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]"));
		ele.click();
		
		WebElement dateValue = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[4]/div[6]/div[1]/div[1]"));
		dateValue.click();
		
		Thread.sleep(3000);
	
	}

}
