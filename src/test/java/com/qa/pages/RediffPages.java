package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffPages {

	WebDriver driver;
	
	@FindBy(xpath="//tbody/tr[3]/td[3]/input[1]")
	WebElement FirstNameTxtField;
	
	
	public WebElement getFirstNameTxtField() {
		return FirstNameTxtField;
	}
	
	
	@FindBy(xpath="//tbody/tr[7]/td[3]/input[1]")
	WebElement emailIDField;
	
	public WebElement getemailIDField() {
		return emailIDField;
	}
	
	@FindBy(linkText="Sign in")
	WebElement signInLink;
	
	public WebElement getsignInLink() {
		return signInLink;
	}
	
	
	@FindBy(id="login1")
	WebElement UNameTxtField;
	
	public WebElement getUNameTxtField() {
		return UNameTxtField;
	}
	
	
	@FindBy(id="password")
	WebElement PwdTxtField;
	
	public WebElement getPwdTxtField() {
		return PwdTxtField;
	}
	
	
	
	public RediffPages(WebDriver rDriver) {		
		this.driver = rDriver;
		PageFactory.initElements(rDriver, this);
		
	}
	

}
