package com.qa.testscripts;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_ScrollBy extends TestBase{
	
	@Test(priority=1)
	public void scrollBy() throws InterruptedException {
		//scroll horizontal  or vertical
		
		// Scroll by 500 px vertically --> up or down
		
		//window.scrollBy(x,y) --> x represents horizontal, Y represents vertical
		
		for(int i=0; i<=5;i++) {
			Js.executeScript("window.scrollBy(0,500)"); // move top to down
			Thread.sleep(3000);
		}
		
		
		for(int i=5; i>=1;i--) {
			Js.executeScript("window.scrollBy(0,-500)"); // bottom to top
			Thread.sleep(3000);
		}
		
		/*
		// Scroll by 500 px horizontally --> right to left and left to right
		for(int i=0; i<=5;i++) {
			Js.executeScript("window.scrollBy(500,0)"); // move right to left
			Thread.sleep(3000);
		}
		
		
		for(int i=5; i>=1;i--) {
			Js.executeScript("window.scrollBy(-500,0)"); // left to right
			Thread.sleep(3000);
		} */
		
	}
	
	@Test(priority=2)
	public void scrollByElement() throws InterruptedException {
		// scroll to page till the presence of an element.
		
		WebElement ele = AmazonOR.getCareersLink();
		Thread.sleep(2000);
		Js.executeScript("arguments[0].scrollIntoView()",ele);
		Thread.sleep(3000);
		ele.click();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Amazon Careers");		
		
	}
	
	
	

}
