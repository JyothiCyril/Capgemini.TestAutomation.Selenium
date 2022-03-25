package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_WorkingwithFrames extends TestBase {
	
	@Test(priority=1, enabled=false)
	public void frameByIndex() {
		
		
		List<WebElement> frames = driver.findElements(By.tagName("frame"));
		System.out.println("Total no. of frames of the driver are : " +  frames.size());
		
		for(int i=0; i<frames.size();i++) {
			WebDriver frame = driver.switchTo().frame(i);
			System.out.println(frame.getTitle());			
			int size = frame.findElements(By.tagName("a")).size();			
			System.out.println("Total no. of links present on the frame " +i+ " are : " + size);
			driver.switchTo().defaultContent();
			
		}
		
		
	}
	@Test(priority=2, enabled=false)
	public void frameByName() {
		
		WebDriver frame = driver.switchTo().frame("packageFrame");
		System.out.println(frame.getTitle());
		int size = frame.findElements(By.tagName("a")).size();			
		System.out.println("Total no. of links present on the " + frame.getTitle()+ " frame are : " + size);
		driver.switchTo().defaultContent();		
	}
	
	
	@Test(priority=3)
	public void frameByElement() throws InterruptedException {
		
		WebElement ele = driver.findElement(By.xpath("//frame[@title='All classes and interfaces (except non-static nested types)']"));
		
		
		WebDriver frame = driver.switchTo().frame(ele);
		
		System.out.println(frame.getTitle());
		int size = frame.findElements(By.tagName("a")).size();			
		System.out.println("Total no. of links present on the " + frame.getTitle()+ " frame are : " + size);
		boolean displayed = frame.findElement(By.linkText("Applet")).isDisplayed();
		if(displayed) {
			frame.findElement(By.linkText("Applet")).click();
			Thread.sleep(3000);
		}
		
		driver.switchTo().defaultContent();		
		
	}

}
