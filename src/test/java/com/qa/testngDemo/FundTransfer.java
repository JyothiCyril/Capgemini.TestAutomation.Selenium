package com.qa.testngDemo;

import org.testng.annotations.Test;

public class FundTransfer extends TestBase{
	
	@Test(priority=1)
	public void FT_NEFT() {
		System.out.println("LOC for Fund Transfer using NEFT");
	}
	
	@Test(priority=2)
	public void FT_IMPS() {
		System.out.println("LOC for Fund Transfer using IMPS");
	}
	
	@Test(priority=3)
	public void FT_International() {
		System.out.println("LOC for Fund Transfer using International");
	}

}
