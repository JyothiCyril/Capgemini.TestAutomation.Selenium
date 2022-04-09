package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_MMT {
	
	
	@Test
	public void tc_mmt() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[1]/span[1]"));
		
		if(ele.isDisplayed()) {
			ele.click();
		}else {
			System.out.println("Continue without click");
		}
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/button[1]/span[1]")).click();
		Thread.sleep(3000);
	
	}

}
