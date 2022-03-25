package com.qa.testscripts;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_WorkingWithMultipleWindows extends TestBase{
	
	@Test
	public void multiWins() {
		
		
		CitiBankOR.getcitigroupLink().click(); //2nd tab
		CitiBankOR.getTandCLink().click(); // 3rd tab
		// get all the tabs that opened and reach each window to check how many links are present
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		Iterator<String> iterator = windowHandles.iterator();
		
		while(iterator.hasNext()) {
			String windID = iterator.next();
			System.out.println(windID);
			WebDriver window = driver.switchTo().window(windID);
			Reporter.log(window.getTitle(),true);
			
			List<WebElement> links = window.findElements(By.tagName("a"));
			System.out.println("Total no. of hyperlinks present on the window are : " + links.size());
			
			
		}
		
		
	}

}
