package com.qa.testngDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	@BeforeClass
	public void Login() {
		System.out.println("LoC for Login action");
	}
	
	@AfterClass
	public void Logout() {
		System.out.println("LoC for Logout action");
	}
	
	@BeforeTest
	public void setUp() {
		System.out.println("Invoke the browser");
		
	}

	@AfterTest
	public void tearDown() {
		System.out.println("Close the browser");
	}
	
	@BeforeMethod // runs before every @Test method
	public void checkBalance() {
		System.out.println("Check Balance");
	}
	
	@AfterMethod // runs after successful execution of @Test method
	public void Acknowledgement() {
		System.out.println("Print Acknowledgement");
	}
}
