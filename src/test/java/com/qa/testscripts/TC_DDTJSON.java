package com.qa.testscripts;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_DDTJSON extends TestBase{
	
	@Test(dataProvider="getData")
	public void searchItem(String data) throws IOException {
		SoftAssert sAssert = new SoftAssert();
		
		String inputs[] = data.split(",");

		AmazonOR.getCategory().selectByVisibleText(inputs[0]); // 1st field --> Category
		AmazonOR.getSearchTxtField().clear();
		AmazonOR.getSearchTxtField().sendKeys(inputs[1]); // 2nd field --> Item Name
		AmazonOR.getMagnifierBtn().click();

		boolean contains = driver.getTitle().contains(inputs[1]);

		if(contains) {
			Reporter.log("The title of page has search term",true);
			//Assert.assertTrue(contains);
			sAssert.assertTrue(contains);
		}else {
			captureScreenshot(driver,"searchItem");
			Reporter.log("The title of the page do not have search term",true);
			//Assert.assertTrue(contains);
			sAssert.assertTrue(contains);
		}
		List<WebElement> getallItems = AmazonOR.getallItems();

		System.out.println("Total no. of items loaded are : " + getallItems.size());
		for(WebElement item:getallItems) {
			Reporter.log(item.getText(),true);
		}
		
		sAssert.assertAll();
	}
	
	@DataProvider
	public String[] getData() throws IOException, ParseException{
		
		JSONParser jsonParser = new JSONParser();
		
		FileReader reader = new FileReader("D:\\Capgemini\\Capgemini.TestAutomation.Selenium\\src\\test\\java\\com\\qa\\testdata\\TestData.json");
		Object obj = jsonParser.parse(reader);
		
		JSONObject objData = (JSONObject)obj;
		JSONArray objArray = (JSONArray)objData.get("SearchItems");
		
		String data[]= new String[objArray.size()];
		
		for(int i=0; i<objArray.size();i++) {
			JSONObject items = (JSONObject)objArray.get(i);
			String Category = (String)items.get("Category");
			String ItemName = (String)items.get("ItemName");
			data[i] = Category + "," + ItemName;
		}
	
		return data;
	}
	
	

}
