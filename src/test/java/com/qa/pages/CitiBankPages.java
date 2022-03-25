package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CitiBankPages {
	
	WebDriver driver;
	
	@FindBy(linkText="CITIGROUP.COM")
	WebElement citigroupLink;
	
	public WebElement getcitigroupLink() {
		return citigroupLink;
	}
	
	
	@FindBy(linkText="TERMS AND CONDITIONS")
	WebElement TandCLink;
	
	public WebElement getTandCLink() {
		return TandCLink;
	}
	
	public CitiBankPages(WebDriver rDriver) {		
		this.driver = rDriver;
		PageFactory.initElements(rDriver, this);
		
	}
	

}
