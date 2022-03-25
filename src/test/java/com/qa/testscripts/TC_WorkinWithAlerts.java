package com.qa.testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TC_WorkinWithAlerts extends TestBase{
	
	@Test
	public void sampleAlerts() throws InterruptedException {
		
		RediffOR.getFirstNameTxtField().sendKeys("23456");
		Thread.sleep(2000);
		RediffOR.getFirstNameTxtField().sendKeys(Keys.TAB);
		Thread.sleep(2000);
		// alert window will be loaded on the page.
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept(); 
		
		//alert.dismiss();
		
		RediffOR.getFirstNameTxtField().clear();
		Thread.sleep(2000);
		RediffOR.getFirstNameTxtField().sendKeys("smith");
		Thread.sleep(2000);
		RediffOR.getemailIDField().sendKeys("test@test.com");
		Thread.sleep(2000);
		
	}

}
