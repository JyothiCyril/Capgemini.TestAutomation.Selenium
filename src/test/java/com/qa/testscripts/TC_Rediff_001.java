package com.qa.testscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Rediff_001 extends TestBase{
	
	@Test
	public void LoginAction() throws InterruptedException {
		
		RediffOR.getsignInLink().click();
		boolean contains = driver.getCurrentUrl().contains("login");
		
		if(contains) {
			Reporter.log("User is landed on the login page");
			Assert.assertTrue(contains);
			
			RediffOR.getUNameTxtField().sendKeys(prop.getProperty("Uname"));
			RediffOR.getPwdTxtField().sendKeys(prop.getProperty("Pwd"));
			
			Thread.sleep(3000);
		}
		
	}

}
