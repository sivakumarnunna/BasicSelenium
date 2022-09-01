package com.page;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.model.LoginDetails;
import com.reader.LocatorReader;
import com.utils.BasePage;
import com.utils.WebDriverUtils;

public class LumaCustomerLoginPage extends WebDriverUtils {
	
	public static By tfemail =  By.id(LocatorReader.LOCATOR_READER.getProperty("tfemail"));
	public static By tfpassword =  By.id(LocatorReader.LOCATOR_READER.getProperty("tfpassword"));
	public static By btnsubmit =  By.id(LocatorReader.LOCATOR_READER.getProperty("btnsubmit"));




 public void doLogin(LoginDetails logindetails) throws InterruptedException {
	 
	 

		driver.findElement(CommonPage.lnksignin).click();
		
		click(CommonPage.lnksignin);
		EnterText(tfemail, logindetails.getUsername());
		EnterText(tfpassword, logindetails.getPassword());
		click(btnsubmit);
		
      Assert.assertEquals(driver.findElement(CommonPage.txtwelcomemessage).getText().contains("Welcome,"),true);

	 
 }
 
 }


