package com.page;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.model.LoginDetails;
import com.reader.LocatorReader;
import com.utils.BasePage;

public class LumaCustomerLoginPage extends BasePage {
	
	public static By tfemail =  By.id(LocatorReader.LOCATOR_READER.getProperty("tfemail"));
	public static By tfpassword =  By.id(LocatorReader.LOCATOR_READER.getProperty("tfpassword"));
	public static By btnsubmit =  By.id(LocatorReader.LOCATOR_READER.getProperty("btnsubmit"));




 public void doLogin(LoginDetails logindetails) throws InterruptedException {
	 
	 
	 Thread.sleep(3000);

		driver.findElement(CommonPage.lnksignin).click();
		driver.findElement(tfemail).clear(); // clear the prefilled values from testbox
		driver.findElement(tfemail).sendKeys(logindetails.getUsername()); // enter values in text box
		driver.findElement(tfpassword).clear(); // clear the prefilled values from testbox
		driver.findElement(tfpassword).sendKeys(logindetails.getPassword()); // enter values in text box
		driver.findElement(btnsubmit).click();
			Thread.sleep(3000);
		
      Assert.assertEquals(driver.findElement(CommonPage.txtwelcomemessage).getText().contains("Welcome,"),true);

	 
 }
 
 }


