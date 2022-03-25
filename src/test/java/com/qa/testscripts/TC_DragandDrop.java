package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_DragandDrop extends TestBase{
	
	
	@Test
	public void dragDrop() throws InterruptedException {
		
		driver.switchTo().frame(0);
		
		WebElement sourceEle = driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
		
		WebElement targetEle = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(sourceEle, targetEle).build().perform();
		
		Thread.sleep(4000);
		
	}

}
