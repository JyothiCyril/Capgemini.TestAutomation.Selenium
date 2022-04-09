package com.qa.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Quickr {

	@Test
	public void sampleTest() throws InterruptedException {



		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");	

		WebDriver driver = new ChromeDriver();	


		driver.manage().window().maximize();		
		driver.get("https://www.quikr.com/hyderabad");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	
//		WebElement notNowBtn = driver.findElement(By.xpath("/html/body/div[10]/div[2]/div[2]/button[1]"));
//
//		boolean displayed = notNowBtn.isDisplayed();
//		if(displayed) {
//			notNowBtn.click();
//		}else {
//			System.out.println("Element is not found");
//		}

		WebElement CategoryEle = driver.findElement(By.id("searchedCat"));
		CategoryEle.click();

		Thread.sleep(2000);

		WebElement subCateEle = driver.findElement(By.xpath("//*[@id=\"category-dropdown\"]/ul/li[5]/a"));
		subCateEle.click();
		Thread.sleep(2000);

		//Actions act = new Actions(driver);
		//act.sendKeys(Keys.ESCAPE).build().perform();




	}

}
